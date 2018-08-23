import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;

/**
 * Class BallDemo - provides a demonstration of the
 * BouncingBall and Canvas classes. 
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2010.11.30
 */

public class BallDemo   
{
    private Canvas myCanvas;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 500;
    // Create a collection to save balls.
    private ArrayList<BouncingBall> balls;
    // Create a color collection
    private Color[] cores = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.ORANGE, Color.PINK, Color.MAGENTA, Color.RED, Color.YELLOW};

    /**
     * Create a BallDemo object.
     * Creates a fresh canvas and makes it visible.
     */
    public BallDemo()
    {
	balls = new ArrayList<BouncingBall>();
        myCanvas = new Canvas("Ball Demo", WIDTH, HEIGHT);
        myCanvas.setVisible(true);
    }
 
    /**
     * Simulate two bouncing balls
     * @param number of balls
     */
    public void bounce( int numBalls )
    {
        int ground = HEIGHT-20;   // position of the ground line
        int xStart = 20;    // x-start of the ground line
        int xLimit = WIDTH-20;   // x-limit of the ground line

        myCanvas.setVisible(true);

	drawFrame(WIDTH, HEIGHT);

        // draw the ground
        myCanvas.setForegroundColor(Color.blue);
        myCanvas.drawLine(xStart, ground, xLimit, ground);

	// create and show the balls using ArrayList
	
	if( numBalls <= 0 ){
		System.out.println("Informe um valor válido! Valor recebido: " + numBalls);
		return;
	}

	for( int i = 0; i < numBalls ; i++){
		Random rand = new Random();
		int newXStart = generateRandom(xStart, xLimit);
		int halfCanvas = myCanvas.getSize().height / 2;
		int jump = generateRandom(0, halfCanvas);
		int color_value = generateRandom(0, 11);
		BouncingBall ball = new BouncingBall(newXStart, jump, 20, cores[color_value], ground, myCanvas );
		ball.draw();
		balls.add(ball);
	}

/*
        // create and show the balls
        BouncingBall ball = new BouncingBall(xStart, 50, 16, Color.blue, ground, myCanvas);
        ball.draw();
        BouncingBall ball2 = new BouncingBall(xStart + 20, 80, 20, Color.red, ground, myCanvas);
        ball2.draw();
*/

        // Make them bounce until both have gone beyond the xLimit.
        boolean finished =  false;
        while(!finished) {
            myCanvas.wait(50);           // small delay
	    for( BouncingBall ball : balls ){
	    	ball.move();
	    }
            //ball.move();
            //ball2.move();

	    // count how many of them are in the end.
	    int valueTrue = 0;

	    // stop once ball has travelled a certain distance on x axis
	    for( BouncingBall bola : balls ){
	    	if( (bola.getXPosition() + 30) >= xLimit )
			valueTrue++;
	    }

            if(valueTrue == balls.size()) {
                finished = true;
            }
        }
	
	for( BouncingBall ball : balls ){
		ball.erase();
	}
        //ball.erase();
        //ball2.erase();
    }

    /**
     *	Draw a Rectangle in screen.
     *	@param inform the ball's height
     *	@param inform the ball's width
     * */    
    public void drawFrame(int width, int height){
	// Add a Dimension type to save the rectangle height and width.
	Dimension dim = new Dimension(width,height);
	// Create a Rectangle with margin 20 from the top and left, and
	// using Dimension object above.
    	Rectangle rect = new Rectangle(20,20, dim.width-40, dim.height-40);
	// draw rectangle
	myCanvas.draw(rect);
    }

    public int generateRandom(int min, int max){
    	Random random = new Random();
	return random.nextInt((max - min) + 1) + min;
    }
}
