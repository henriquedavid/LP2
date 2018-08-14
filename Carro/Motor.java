public class Motor{
	
	private String tipo_combustivel;
	private String cilindradas;
	private boolean ligado;

	public Motor(){
		this.tipo_combustivel = "flex";
		this.cilindradas = "1.6";
		this.ligado = false;
	}

	public Motor(String tipo_, String cilindradas_, boolean ligado_){
		this.tipo_combustivel = tipo_;
		this.cilindradas = cilindradas_;
		this.ligado = ligado_;
	}

	public String getTipoCombustivel(){
		return this.tipo_combustivel;
	}

	public void setTipoCombustivel( String tipo ){
		if( tipo != "alcool" || tipo != "gasolina" || tipo != "flex")
			System.out.println("Não existe esse tipo de combustível.");
		else
			this.tipo_combustivel = tipo;
	}

	public String getCilindradas(){
		return this.cilindradas;
	}

	public void setCilindradas( String cilindradas_){
		this.cilindradas = cilindradas_;
	}

	public boolean getLigado(){
		return this.ligado;
	}

	public void ligarMotor(){
		if(this.ligado)
			System.out.println("O motor já está ligado!");
		else
			this.ligado = !this.ligado;
	}

	public void desligarMotor(){
		if(!this.ligado)
			System.out.println("O motor já está desligado!");
		else
			this.ligado = !this.ligado;
	}
}
