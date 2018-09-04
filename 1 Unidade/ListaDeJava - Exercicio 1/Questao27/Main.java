public class Main{
	public static void main( String[] args ){
		ContaPoupanca cp = new ContaPoupanca("Henrique", 123, 100, 10000);
		ContaEspecial ce = new ContaEspecial("Henrique", 123, 100, 10000);

		ce.sacar(100);
		cp.receberTaxaPoupanca(30);


	}
}
