public class CalculadoraTester{
	public static void main(String[] args){
		Calculadora calc = new Calculadora();
		calc.setX(20);
		calc.setY(10);

		System.out.println(calc.somar() +
				   " " + calc.subtrair() +
				   " " + calc.multiplicar() +
				   " " + calc.dividir());
	}	
}
