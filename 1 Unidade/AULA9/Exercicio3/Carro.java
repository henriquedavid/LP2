public class Carro{

	private String potencia;
	private String portas;

	public Carro( String marca, String modelo, String placa, boolean situacao = false, String potencia, String portas){
                super(marca, modelo, placa, situacao);
		this.potencia = potencia;
		this.portas = portas;
        }

	public void setPotencia( String potencia ){
		this.potencia = potencia;
	}

	public String getPotencia(){
		return potencia;
	}

	public void setPortas( String portas ){
		this.portas = portas;
	}

	public String getPortas(){
		return portas;
	}

}
