public class Roda{
	
	private int tamanhoAro;
	private int pressao;

	public Roda(){
		this.tamanhoAro = 14;
		this.pressao = 30;
	}

	public Roda(int tamanho_, int pressao_){
		this.tamanhoAro = tamanho_;
		this.pressao = pressao_;
	}

	public int getTamanhoAro(){
		return tamanhoAro;
	}

	public void setTamanhoAro( int aro ){
		this.tamanhoAro = aro;
	}

	public int getPressao(){
		return pressao;
	}

	public void setPressao( int pressao_ ){
		this.pressao = pressao_;
	}

}
