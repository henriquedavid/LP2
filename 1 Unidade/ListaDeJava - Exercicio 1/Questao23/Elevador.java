public class Elevador{
	
	int andarAtual;
	int andarTotal;
	int capacidade;
	int capacidadeTotal;

	public Elevador(){
		andarAtual = 0;
		andarTotal = 0;
		capacidade = 0;
		capacidadeTotal = 0;
	}

	public Elevador( int aa, int at, int c, int ct ){
		andarAtual = aa;
		andarTotal = at;
		capacidade = c;
		capacidadeTotal = ct;
	}

	public void inicializa( int capacidade, int total_andares){
		this.capacidadeTotal = capacidade;
		this.andarTotal = total_andares;
		this.andarAtual = 0;
		this.capacidade = 0;
	}

	public void entra(){
		if( capacidade < capacidadeTotal ){
			capacidade++;
		}
	}

	public void sai(){
		if( capacidade > 0 ){
			capacidade--;
		}
	}

	public void sobe(){
		if( andarAtual != andarTotal ){
			andarAtual++;
		}
	}

	public void desce(){
		if( andarAtual != 0){
			andarAtual--;
		}
	}

	public int getAndarTotal(){ return andarTotal; }
	public int getCapacidade(){ return capacidade; }
	public int getCapacidadeTotal(){ return capacidadeTotal; }
	public int getAndarAtual(){ return andarAtual; }

	public void setAndarTotal( int andar ){ this.andarTotal = andar; }
	public void setAndarAtual( int andar ){ this.andarAtual = andar; }
	public void setCapacidade( int capacidade ){ this.capacidade = capacidade; }
	public void setCapacidadeTotal( int capacidade ){ this.capacidadeTotal = capacidade; }
}
