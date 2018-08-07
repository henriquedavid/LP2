public class Porta{

	// Aberta = true / Fechada = false;
	private boolean estado;

	public Porta(){
		this.estado = false;
	}

	public Porta( boolean estado_ ){
		this.estado = estado_;
	}

	public boolean getEstado(){
		return this.estado;
	}

	public void abrir(){
		this.estado = true;
	}

	public void fechar(){
		this.estado = false;
	}


}
