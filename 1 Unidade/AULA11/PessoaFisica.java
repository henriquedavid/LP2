public class PessoaFisica extends Cliente{
	private String cpf;

	public PessoaFisica( String n, String e, String t, String c){
		super(n,e,t);
		cpf = c;
	}

	public String getCpf(){
		return cpf;
	}

	public void imprimirDados(){
		System.out.println("Nome:     " + super.getNome() +
				   "\nEndereço: " + super.getEndereco() +
				   "\nTelefone: " + super.getTelefone() +
				   "\nCPF:      " + cpf);
	}
}
