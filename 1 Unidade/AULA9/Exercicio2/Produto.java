public class Produto{
	private String nome;
	private double preco;
	private String marca;
	private String descricao;
	private String data;

	public Produto(){
		nome = "";
		preco = 0;
		marca = "";
		descricao = "";
		data = "";
	}

	public Produto( String nome, double preco, String marca, String descricao, String data){
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
		this.descricao = descricao;
		this.data = data;
	}

	public void setNome( String nome ){
		this.nome = nome;
	} 
	
	public void setPreco( double preco ){ this.preco = preco; }
	
	public void setMarca( String marca ) { this.marca = marca; }
	
	public void setDescricao( String descricao ){ this.descricao = descricao;}
	
	public void setData( String data ){ this.data = data; }

	public String getNome(){ return this.nome; }
	
	public double getPreco(){ return this.preco; }
	
	public String getMarca(){ return this.marca; }
		
	public String getDescricao(){ return this.descricao; }
	
	public String getData(){ return this.data;}
}
