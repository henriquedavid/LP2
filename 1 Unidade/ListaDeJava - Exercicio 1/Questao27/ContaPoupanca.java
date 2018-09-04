public class ContaPoupanca extends ContaBancaria{

	private int diaDeRendimento;
	private float taxa;

	public ContaPoupanca(String cliente, int num, float saldo, int rend){
		super(cliente, num, saldo);
		this.diaDeRendimento = rend;
	}

	public void calcularNovoSaldo( float valor ){
		float salario = super.getSaldo();
		salario += valor;
		atualizarSaldo(salario);
	}

	public void receberTaxaPoupanca(float taxa){
		float salario_min = 54;
		float valor = (salario_min * taxa) - salario_min;
		calcularNovoSaldo(valor);
	}

	public void atualizarSaldo(float valor){
		super.setSaldo(valor);
	}
}
