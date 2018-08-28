public class Cliente{
	private String nome;
	private String carteira;
	
	public Cliente( String nome, String carteira ){
		this.nome = nome;
		this.carteira = carteira;
	}

	public void setNome( String nome ){
		this.nome = nome;
	}

	public String getNome(){
		return nome;
	}

	public void setCarteira( String carteira ){
		this.carteira = carteira;
	}

	public String getCarteria(){
		return carteira;
	}
}
