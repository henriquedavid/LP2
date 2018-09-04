public class Q12{
	public static void main(String[] args){
		int l1 = 0;
		int l2 = 0;

		l1 = 1;
		l2 = l1;
		l1 = 0;

		if( l2 == 1)
			System.out.println("Está ligada!");
		else
			System.out.println("Está desligada!");
	}
}
