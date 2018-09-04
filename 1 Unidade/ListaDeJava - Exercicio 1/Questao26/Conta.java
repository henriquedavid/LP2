public class Conta{
	
	private int numero;	// número da conta
	private String nome;	// nome do titular da conta
	private int tipo;	// tipo de conta ( 0 - poupanca, 1 - corrente)
	private float saldo;	// saldo da conta

	public Conta(){
		saldo = 0;
	}

	public Conta( int numeroConta, String nome ){
		this.numero = numeroConta;
		this.nome = nome;
		this.tipo = 1;
		this.saldo = 0;
	}

	public int getNumero(){ return numero; }
	public String getNome(){ return nome; }
	public int getTipo(){ return tipo; }
	public float getSaldo(){ return saldo; }

	public void setNumero( int numero ) { this.numero = numero; }
	public void setNome( String nome ){ this.nome = nome; }
	public void setTipo( int tipo ){ this.tipo = tipo; }
	public void setSaldo( float saldo ){ this.saldo = saldo; }

	public void depositar( float valor ){ 
		this.saldo += valor;
		System.out.println("Deposito de " + valor + "realizado!");
	}

	public void sacar( float valor ){
		if( valor > this.saldo){
			System.out.println("Negado!");
		} else{
			saldo -= valor;
			System.out.println("Você sacou R$" + valor);
		}
	}
}
