public class Moto extends Automovel{

	private String tipoPartida;
	private String cilindradas;

	public Moto( String marca, String modelo, String placa, boolean situacao = false, String tipoPartida, String cilindradas){
                super(marca, modelo, placa, situacao);
                this.tipoPartida = tipoPartida;
                this.cilindradas = cilindradas;
        }

	public void setTipoPartida( String tipo ){
		this.tipoPartida = tipo;
	}

	public String getTipoPartida(){
		return tipoPartida;
	}

	public void setCilindradas( String cilindradas ){
		this.cilindradas = cilindradas;
	}

	public String getCilindradas(){
		return cilindradas;
	}


}
