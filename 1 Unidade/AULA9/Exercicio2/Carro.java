public class Carro extends ProdutoDuravel{

	private String color;

        public Carro( String nome, double preco, String marca, String descricao, String data, String material, String durabilidade, String cor){
                super(nome, preco, marca, descricao, data, material, durabilidade);
		this.color = cor;
        }

	public String getCor(){
		return color;
	}

	public void setCor( String color ){
		this.color = color;
	}

}

