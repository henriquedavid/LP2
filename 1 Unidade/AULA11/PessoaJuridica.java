public class PessoaJuridica extends Cliente{
	
	private String cnpj;
	private String nomeFantasia;

	public PessoaJuridica( String n, String e, String t, String c, String nf){
		super(n, e, t);
		cnpj = c;
		nomeFantasia = nf;
	}

	public String getCnpj(){
		return cnpj;
	}

	public String getNomeFantasia(){
		return nomeFantasia;
	}

	public void setNomeFantasia( String n ){
		nomeFantasia = n;
	}

	public void imprimirDados(){
		System.out.println("Nome: " + super.getNome() +
				   "\nEndereço: " + super.getEndereco() +
				   "\nTelefone: " + super.getTelefone() +
				   "\nCNPJ: " + cnpj +
				   "\nNome Fantasia: " + nomeFantasia);
	}

}
