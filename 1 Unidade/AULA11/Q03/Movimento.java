public class Movimento{

	private int x;
	private int y;

	public Movimento( int x, int y ){
		this.x = x;
		this.y = y;
	}

	public Movimento() {
		x = 1;
		y = 1;
	}

	/**
	 *	The ideia is to follow the follow coordenates:
	 *		  	    ^
 	 *			  < | >
	 *			    v 
	 */

	/**
         *	Go to the left;
	 */
	public void movimentarL(){
		this.x = x + 1;
	}

	/**
         *      Go to up;
         */
	public void movimentarN(){
		this.y = y + 1;
	}

	/**
         *      Go to down;
         */
	public void movimentarS(){
		this.y = y - 1;
	}

	/**
         *      Go to the right;
         */
	public void movimentarO(){
		this.x = x - 1;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

}
