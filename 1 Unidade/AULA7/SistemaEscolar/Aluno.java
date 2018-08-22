public class Aluno{
	private Prova prova1;
	private Prova prova2;

	public Aluno(){
		prova1 = new Prova();
		prova2 = new Prova();
	}

	public Aluno(Prova p1, Prova p2){
		prova1 = p1;
		prova2 = p2;
	}
	
	public double calcularMedia(){
		double media = 0;
		media = (prova1.calcularNotaTotal() + prova2.calcularNotaTotal())/2;
		return media;
	}
}
