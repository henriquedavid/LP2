import java.util.Scanner;

public class Banco{

	Conta conta;

	public Banco(){
		conta = new Conta(123, "Tio Patinhas");
	}
	
	public void informacoes(){
		int i = -1;
		while( i != 0){
			System.out.println("1 - Realizar depósito\n"+
					   "2 - Realizar saque\n"+
					   "3 - Mostrar saldo\n" +
					   "4 - Mostrar informações do titular\n"+
					   "0 - Sair");
			i = sistema();
		}
	}

	public int sistema(){
		Scanner sc = new Scanner(System.in);
		int escolha = sc.nextInt();

		switch(escolha){
			case 1:
				System.out.println("Qual o valor que você deseja depositar? (Deposito até as 16h)");
				float quantidade = sc.nextFloat();
				conta.depositar(quantidade);
				break;

			case 2:
				System.out.println("Qual o valor que você deseja sacar?");
				float valor = sc.nextFloat();
				conta.sacar(valor);
				break;
			case 3:
				System.out.println("Saldo: " + conta.getSaldo());
				break;
			case 4:
				System.out.println("Nome: " + conta.getNome() +
						"\nNúmero da conta: " + conta.getNumero() + "\nTipo: " + conta.getTipo() );
				break;
			default:
				break;
		}
		return escolha;
	}
}
