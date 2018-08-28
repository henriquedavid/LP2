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
	// Verify if there is a valid value in numBalls.
	if( numBalls <= 0 ){
		System.out.println("Valor inválido! Valor recebido: " + numBalls);
		System.exit(-1); // exit if is less or equal to 0;
	}

        int ground = HEIGHT-30;   // position of the ground line
        int xStart = 60;    // x-start of the ground line
        int xLimit = WIDTH - 60;   // x-limit of the ground line

        myCanvas.setVisible(true);
	
	// Draw for the first time the rectangle
	drawFrame(WIDTH, HEIGHT);

        // draw the ground
        myCanvas.setForegroundColor(Color.blue);
        myCanvas.drawLine(xStart, ground, xLimit, ground);

	// Create each ball
	for( int i = 0; i < numBalls ; i++){
		// create a random number to calculate the random values
		Random rand = new Random();
		// create a new start to each ball
		int newXStart = generateRandom(xStart, xLimit);
		// verify what is the half of Canvas
		int halfCanvas = myCanvas.getSize().height / 2;
		// with halfCanvas working than just create a new values to each ball
		int jump = generateRandom(20, halfCanvas);
		// choose a color to each ball
		int color_value = generateRandom(0, 11);
		// create a new ball
		BouncingBall ball = new BouncingBall(newXStart, jump, 20, cores[color_value], ground, myCanvas );
		// draw the ball
		ball.draw();
		// add a ball to the list
		balls.add(ball);
	}

        // Make them bounce until both have gone beyond the xLimit.
        boolean finished =  false;
        while(!finished) {
            myCanvas.wait(50);           // small delay
	    
	    // move each ball
	    for( BouncingBall ball : balls ){
	    	ball.move();
	    }

	    // count how many of them are in the end.
	    int valueTrue = 0;

	    // stop once ball has travelled a certain distance on x axis
	    for( BouncingBall bola : balls ){
		// Verify if the ball pass the xLimits
	    	if( (bola.getXPosition() + 10) >= xLimit ){
			// if the ball pass the xLimit, so it is erased.
			bola.erase();
			// count that with that ball is out of Xlimit.
			valueTrue++;
		}
	    }

	    // When every ball pass xLimits so finish the while.
	    if(valueTrue == balls.size()){
	    	finished = true;
	    }
	    
	    // Draw rect for each time.
	    drawFrame(WIDTH, HEIGHT);
  	}
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

    /**
     * Generate a random number.
     * This method is to help to generate randons values to
     * Ball's height and width, in a range.
     *
     * @param minimum value
     * @param maximum value
     */
    public int generateRandom(int min, int max){
    	// creste a random object
	Random random = new Random();
	// calculate the number in the range.
	return random.nextInt((max - min) + 1) + min;
    }
}
