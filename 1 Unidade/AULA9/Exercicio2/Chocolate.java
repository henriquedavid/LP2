public class Chocolate extends ProdutoNaoDuravel{

	private String tipo;

        public Chocolate( String nome, double preco, String marca, String descricao, String data, String validade, String genero){
                super(nome, preco, marca, descricao, data, validade, genero);
        }

	public String setTipo( String tipo ){
		this.tipo = tipo;
	}

	public void getTipo(){
		return tipo;
	}

}

