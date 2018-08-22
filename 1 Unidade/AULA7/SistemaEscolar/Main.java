public class Main{
	public static void main( String[] args ){
		Prova prova1_A1 = new Prova(4,2.5);
		Prova prova2_A1 = new Prova(1.0,7.0);
		Prova prova1_A2 = new Prova(6.5,3.5);
		Prova prova2_A2 = new Prova(0.0,3.0);
		Prova prova1_A3 = new Prova(5.0, 4.0);
		Prova prova2_A3 = new Prova(6.0,1.5);

		Aluno aluno1 = new Aluno(prova1_A1, prova2_A1);
		Aluno aluno2 = new Aluno(prova1_A2, prova2_A2);
		Aluno aluno3 = new Aluno(prova1_A3, prova2_A3);

		Turma turma = new Turma(aluno1, aluno2, aluno3);

		System.out.println("Média p/ Aluno:"+
				   "\nAluno 1: " + aluno1.calcularMedia() +
				   "\nAluno 2: " + aluno2.calcularMedia() +
				   "\nAluno 3: " + aluno3.calcularMedia());
		System.out.println("Média geral da Turma: " + turma.calcularMedia());
	}
}
