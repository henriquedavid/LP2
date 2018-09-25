package br.imd.exerc1;

public class Main {

    public static void main(String[] args) {

        Deposito deposito = new Deposito();

        Celular cel = new Celular(123, "iPhone X", 6999.90, "Apple", "Celular com iOS", "14/09/2017", "Metal", "Indefinido", true);
        Carro car = new Carro(134, "Renegade", 79990.00, "JEEP", "Carro SUV", "14/04/2018", "Ferro", "Indefinido", "Preto", true);

        if (deposito.vazio()) {
            System.out.println("Não existe elementos.");
        }

        deposito.addProduct(cel);

        System.out.println(deposito.quantidade());

        deposito.addProduct(car);

        System.out.println(deposito.quantidade());

        deposito.maiorValor();
    }
}
