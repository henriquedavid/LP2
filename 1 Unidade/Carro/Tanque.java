public class Tanque{
	
	private int litrosMax;
	private int atual;

	public Tanque(){
		this.litrosMax = 60;
		this.atual = 60;
	}

	public Tanque( int litrosMax_, int atual_){
		this.litrosMax = litroMax_;
		this.atual = atual_;
	}

	public int getLitrosMax(){
		return this.litrosMax;
	}

	public void setLitrosMax( int max ){
		this.litrosMax = max;
	}

	public int atual(){
		return this.atual;
	}

	public void setAtual( int valor ){
		this.atual = valor;
	}

	public void abastecer( int quant ){
		this.atual += quant;
		if(this.atual > litrosMax){
			System.out.println("O tanque já está cheio!");
			this.atual = litrosMax;
		}
	}

	public void diminuir( int quant ){
		this.atual -= quant;
		if(this.atual < 0){
			this.atual = 0;
		}
	}
}
