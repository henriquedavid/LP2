public class Cliente{
	private String nome;
	private String endereco;
	private String telefone;

	public Cliente( String n, String e, String t){
		nome = n;
		endereco = e;
		telefone = t;
	}

	public String getNome(){
		return nome;
	}

	public String getEndereco(){
		return endereco;
	}

	public void setEndereco( String e ){
		endereco = e;
	}

	public String getTelefone(){
		return telefone;
	}

	public void setTelefone( String t ){
		telefone = t;
	}
}
