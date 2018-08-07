public class Main{
	public static void main( String[] args ){
		Credit cred = new Credit();

		System.out.println("Saldo: " + cred.getSaldo());
		cred.setSaldo(2000);
		System.out.println("Saldo: " + cred.getSaldo());
		cred.setSaldo(-100);
		System.out.println("Saldo: " + cred.getSaldo());
		
		cred.topUp(-30);
		cred.topUp(2000);
		System.out.println("Saldo: " + cred.getSaldo());

		cred.downTopUp(-20);
		cred.downTopUp(2000);
		System.out.println("Saldo: " + cred.getSaldo());
		
		Credit cred_new = new Credit(2000);
		System.out.println("Saldo: " + cred_new.getSaldo());
		
	}
}
