public class ProdutoDuravel extends Produto{
	private String materialPredominante;
	private String durabilidade;

	public ProdutoDuravel( String nome, double preco, String marca, String descricao, String data, String material, String durabilidade){
                super(nome, preco, marca, descricao, data);
		this.materialPredominante = material;
		this.durabilidade = durabilidade;
        }

	public void setMaterial( String material){
		this.materialPredominante = material;
	}
	
	public String getMaterial(){
		return materialPredominante;
	}

	public void setDurabilidade( String durabilidade ){
		this.durabilidade = durabilidade;
	}

	public String getDurabilidade(){
		return durabilidade;
	}

}
