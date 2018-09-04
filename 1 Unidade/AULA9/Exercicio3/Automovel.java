public class Automovel{
	private String marca;
	private String modelo;
	private String placa;
	private boolean situacao;

	public Automovel( String marca, String modelo, String placa, boolean situacao = false){
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.situacao = situacao;
	}

	public void setMarca( String marca ){ this.marca = marca; }
	public void setModelo( String modelo ){ this.modelo = modelo; }
	public void setPlaca( String placa ){ this.placa = placa; }
	public void setSituacao( boolean situacao ){ this.situacao = situacao; }

	public String getMarca(){ return this.marca; }
	public String getModelo(){ return this.modelo; }
	public String getPlaca(){ return this.placa; }
	public boolean getSituacao(){ return this.situacao; }
}
