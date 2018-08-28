public class ProdutoNaoDuravel extends Produto{
	private String dataValidade;
	private String genero;

	public ProdutoNaoDuravel( String nome, double preco, String marca, String descricao, String data, String dataValidade, String genero){
                super( nome, preco, marca, descricao, data);
		this.dataValidade = dataValidade;
		this.genero = genero;
        }

	public void setDataValidade( String dataValidade ){
		this.dataValidade = dataValidade;
	}

	public String getDataValidade(){
		return dataValidade;
	}

	public void setGenero( String genero ){
		this.genero = genero;
	}

	public String getGenero(){
		return genero;
	}

}
