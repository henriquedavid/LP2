public class Main{
	public static void main( String[] args ){

		Deposito deposito = new Deposito();

		Celular cel = new Celular("iPhone X", 6999.90, "Apple", "Celular com iOS", "14/09/2017", "Metal", "Indefinido");
		Carro car = new Carro("Renegade", 79990.00, "JEEP", "Carro SUV", "14/04/2018", "Ferro", "Indefinido", "Preto");

		if (deposito.vazio()){
			System.out.println("Não existe elementos.");
		}

		deposito.addProduct( cel );

		System.out.println(deposito.quantidade());
		
		deposito.addProduct( car );

		System.out.println(deposito.quantidade());

		deposito.maiorValor();
	}
}
