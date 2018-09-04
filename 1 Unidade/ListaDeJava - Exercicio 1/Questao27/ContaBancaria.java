public class ContaBancaria{
	
	private String cliente;
	private int num_conta;
	private float saldo;
	
	public ContaBancaria( String cliente, int num, float saldo){
		this.cliente= cliente;
		this.num_conta = num;
		this.saldo = saldo;
	}

	public String getCliente(){ return cliente; }
	public int getNumero(){ return num_conta; }
	public float getSaldo(){ return saldo; }

	public void setCliente( String nome ){ this.cliente = nome; }
	public void setNumero( int num ){ this.num_conta = num; }
	public void setSaldo( float saldo ){ this.saldo = saldo; }

	public void sacar( float valor ){
		if( (saldo-valor) < 0){
			System.out.println("Negado!");
		} else{
			saldo -= valor;
			System.out.println("Você sacou R$" + valor + ".");
		}
	}

	public void depositar(float valor){
		saldo += valor;
		System.out.println("Você depositou R$" + valor + ".");
	}
}
