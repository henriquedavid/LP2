public class Personagem extends Movimento{
	
	private double hp;
	private double forca;
	private double defesa;
	private float critico;
	// The follows attributs isn't necessary because now we have Movimento class.
	//private int x_posicao;
	//private int y_posicao;
	private double vida;

	public Personagem( int x, int y, double h, double f, double d, float c,  double v){
		super(x,y);
		hp = h;
		forca = f;
		defesa = d;
		critico = c;
		//x_posicao = x;
		//y_posicao = y;
		vida = v;
	}

	public void atacar( Personagem p ){
		p.dano(10);
	}
	
	public void dano( double d ){
		if( defesa > 0)
			defesa -= d;
		else
			vida -= d;
		
	}
	
}
