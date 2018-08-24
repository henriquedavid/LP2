/**
 * Principal Class
 *
 *  This class was made to run the BallGame.
 *
 *  @author Henrique David de Medeiros
 *
 */

public class Main{
	public static void main(String[] args){
		// call an object (type BallDemo)
		BallDemo ball = new BallDemo();
		// play with 4 balls (you can change the value).
		ball.bounce(4);
	}
}
