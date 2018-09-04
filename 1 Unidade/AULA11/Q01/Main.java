public class Main{
	public static void main( String[] args ){
	
		PessoaFisica pf = new PessoaFisica("Henrique", "Rua Rico", "9999-1234", "123.456.789-10");

		PessoaJuridica pj = new PessoaJuridica("Finder", "Rua Find", "122-3445", "456.789/1212-3", "Finder Solutions");


		pf.imprimirDados();

		pj.imprimirDados();
	}
} 
