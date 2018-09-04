import java.util.Random;
public class Japones extends Castelo{

	protected int numSamurais;

	public Japones( int x, int y, double d, double l, double pv, String n, int ns ){
		super(x, y, d, l, pv, n );
		numSamurais = ns;
	}

	public void mostrarSituacao(){
		super.mostrarSituacao();
		System.out.println("Número de Samurais: " + numSamurais);
	}

	public void ataque(double d){
		if( numSamurais > 0 ){
			Random rand = new Random();
			int qntElimina = rand.nextInt(4)+2;
			numSamurais -= qntElimina;
		} else{
			super.ataque(d);
		}
	}

}
