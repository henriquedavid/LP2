public class ContaEspecial extends ContaBancaria{
	
	private float limite;

	public ContaEspecial( String cliente, int num, float saldo, float limite){
		super(cliente, num, saldo);
		this.limite = limite;
	}

	public void sacar( float valor ){
		float atual = super.getSaldo();
		if( (atual - valor) > (-1*limite)){
			atual -= valor;
			super.setSaldo(atual);
			System.out.println("Você sacou R$" + valor );
		} else{
			System.out.println("Negado!");
		}
	}
}
