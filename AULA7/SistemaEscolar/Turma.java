public class Turma{
	private Aluno aluno1;
	private Aluno aluno2;
	private Aluno aluno3;

	public Turma(){
		aluno1 = new Aluno();
		aluno2 = new Aluno();
		aluno3 = new Aluno();
	}

	public Turma(Aluno a1, Aluno a2, Aluno a3){
		aluno1 = a1;
		aluno2 = a2;
		aluno3 = a3;
	}

	public double calcularMedia(){
		double media = 0;
		media = aluno1.calcularMedia() + aluno2.calcularMedia() + aluno3.calcularMedia();
		media = media / 3;
		return media;
	}
}
