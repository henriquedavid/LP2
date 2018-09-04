import java.lang.*;

public class Q11{
	public static void main(String[] args){
		Character c1 = new Character('a');
		Character c2 = c1;
		Character c3 = new Character('b');
		c1 = c3;
		c3 = c2;
		c2 = new Character('c');
		c1 = c2;
		System.out.println("O valor de c1 é " + c1.charValue());
		System.out.println("O valor de c2 é " + c2.charValue());
		System.out.println("O valor de c3 é " + c3.charValue());
	}
}
