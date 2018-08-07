public class Credit{

	private int saldo;

	public Credit( ){
		this.saldo = 1000;
	}

	public Credit( int valor ){
		if( valor < 0){
			System.out.println("Construtor foi chamado com um valor negativo: " + valor);
			this.saldo = 0;
		}
		else
			this.saldo = valor;
	}

	public int getSaldo(){
		return this.saldo;
	}

	public void setSaldo( int valor ){
		if( valor < 0 ){
			System.out.println("setSaldo foi chamado com um valor negativo: " + valor);
			this.saldo = 0;
		}else
			this.saldo = valor;
	}

	public void topUp( int valor ){
		if( valor < 0){
			System.out.println("topUp foi chamado com um valor negativo: " + valor);
			this.saldo += 0;
		} else
			this.saldo += valor;
	}

	public void downTopUp( int valor ){
		if(valor < 0){
			System.out.println("downTopUp foi chamado com um valor negativo: " + valor);
			this.saldo -= 0;
		}
		else{
			this.saldo -= valor;
			if( saldo < 0 )
				this.saldo = 0;
		}
	}


}
