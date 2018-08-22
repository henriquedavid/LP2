public class Prova{
	private double notaParte1;
	private double notaParte2;

	public Prova(){
		notaParte1 = 0;
		notaParte2 = 0;
	}

	public Prova( double np1, double np2 ){
		notaParte1 = np1;
		notaParte2 = np2;
	}

	public double calcularNotaTotal(){
		double total = 0;
		total = notaParte1 + notaParte2;
		if( total > 10 )
			total = 10;
		return total;
	}
}
