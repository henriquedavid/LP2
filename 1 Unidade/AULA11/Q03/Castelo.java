public class Castelo extends Movimento{
	
	protected double defesas;
	protected double pontosVida;
	protected String nome;

	public Castelo( int x, int y, double d, double l, double pv, String n ){
		super(x, y);
		defesas = d;
		//localizacao = l;
		pontosVida = pv;
		nome = n;
	}

	public void mostrarSituacao(){
		System.out.println("Defesa: " + defesas +
				   "\nLocalização: (" + super.getX() +"," + super.getY() + ")" +
				   "\nPontos de Vida: " + pontosVida +
				   "\nNome: " + nome);

		if( pontosVida == 0 )
			System.out.println("Castelo foi destruído!");
	}

	public void ataque( double d ){
		if( defesas > 0 ){
			defesas -= d;
		} else{
			pontosVida -= d;
		}
	}
}
