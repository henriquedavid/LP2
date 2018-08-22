public class Carro{

	private int num_marchas;
	private String color;
	private float velocidade;
	private float velocidade_max;
	private String marca;
	private String modelo;
	private String chassi;
	private boolean automatico;
	private float percorrido;

	Motor motor;

	Roda r_esquerda_traseira;
	Roda r_esquerda_dianteira;
	Roda r_direita_traseira;
	Roda r_direita_dianteira;

	Porta p_esquerda_traseira;
	Porta p_esquerda_dianteira;
	Porta p_direita_traseira;
	Porta p_direita_dianteira;

	Tanque tanque;

	public Carro(){
		motor = new Motor();
		tanque = new Tanque();

		r_esquerda_traseira = new Roda();
		r_esquerda_dianteira = new Roda();
		r_direita_traseira = new Roda();
		r_direita_dianteira = new Roda();

		p_esquerda_traseira = new Porta();
		p_esquerda_dianteira = new Porta();
		p_direita_traseira = new Porta();
		p_direita_traseira = new Porta();

		this.num_marchas = 9;
		this.color = "black";
		this.velocidade = 0;
		this.velocidade = 270;
		this.marca = "Jeep";
		this.modelo = "F1-4x4";
		this.chassi = "3848dddffd3";
		this.automatico = true;
	}

	public Carro( int num_marchas_, String color_, float velocidade_, float velocidade_max_, String marca_, String modelo_, String chassi_, boolean cambio_){
		this.num_marchas = num_marchas_;
		this.color = color_;
		this.velocidade = velocidade_;
		this.velocidade_max = velocidade_max_;
		this.marca = marca_;
		this.modelo = modelo_;
		this.chassi = chassi_;
		this.cambio = cambio_;
	}


	public int getNumMarchas(){
		return this.num_marchas;
	}
	public void setNumMarchas( int quantidade ){
		this.num_marchas = quantidade;
	}
	
	public String getColor(){
		return this.color;
	}
	public void setColor( String cor ){
		this.color = cor;
	}
	
	public float getVelocidade(){
		return this.velocidade;
	}
	public void setVelocidade( float veloc ){
		this.velocidade = veloc;
	}
	
	public float getVelocidadeMax(){
		return this.velocidade_max;
	}
	public void setVelocidadeMax( float veloc ){
		this.velocidade_max = veloc;
	}
	
	public String getMarca(){
		return this.marca;
	}
	public void setMarca( String nome ){
		this.marca = nome;
	}
	
	public String getModelo(){
		return this.modelo;
	}
	public void setModelo( String nome ){
		this.modelo = nome;
	}
	
	public String getChassi(){
		return chassi;
	}
	public void setChassi( String chassi_ ){
		this.chassi = chassi_;
	}

	public boolean getCambio(){
		return this.cambio;
	}
	public void setCambio( boolean cambio ){
		this.cambio = cambio;
	}

	public float getPercorrido(){
		return this.percorrido;
	}

	public void setPercorrido( float perc ){
		this.percorrido = perc;
	}

	public void painel(){
		System.out.println("" +
		"--------------------------------------------" +
		"\n>	   Velocidade = " + velocidade +
		"\n>	   Km rodados = " + percorrido +
		"\n>	   Km/L na atual velocidade = " + (velocidade));
	}
}
