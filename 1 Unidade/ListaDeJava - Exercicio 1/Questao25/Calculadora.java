public class Calculadora{
	
	private int x;
	private int y;

	public int getX(){ return x; }
	public int getY(){ return y; }
	public void setX(int x){ this.x = x; }
	public void setY(int y){ this.y = y; }


	public int somar(){
		return x+y;
	}

	public int subtrair(){
		return x-y;
	}

	public int multiplicar(){
		return x*y;
	}

	public int dividir(){
		return x/y;
	}
}
