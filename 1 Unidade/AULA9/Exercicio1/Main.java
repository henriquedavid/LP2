public class Main{
	public static void main( String [] args ){
		ProfessorRegime pr = new ProfessorRegime("Selan", "123", 30, 10000);
		ProfessorHorista ph = new ProfessorHorista("Some", "234", 31, 20, "50");
		System.out.println(pr.getNome());
	}
}
