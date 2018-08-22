public class Main{
	public static void main( String[] args ){
		HugeInteger num1 = new HugeInteger();
		HugeInteger num2 = new HugeInteger();

		num1.inputHugeInteger("19");
		num2.inputHugeInteger("1");

		String sum = num1.addHugeIntegers(num2);
		System.out.println("A soma é : " + sum);
		
	}
}
