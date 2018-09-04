import java.util.Random;
public class Europeu extends Castelo{
	
	protected int numPaladinos;
	
	public Europeu(int x, int y, double d, double l, double pv, String nome , int np ){
		super(x,y,d,l,pv, nome);
		numPaladinos = np;
	}

	public void mostrarSituacao(){
		super.mostrarSituacao();
		System.out.println("Número de Paladinos: " + numPaladinos);
	}

	public void ataque( double d ){
		if( numPaladinos > 0 ){
			Random rand = new Random();
			int qntElimina = rand.nextInt(4)+2;
			numPaladinos -= qntElimina;
		} else{
			super.ataque(d);
		}
	}
}
