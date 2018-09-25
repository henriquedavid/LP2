package br.imd.exerc1;

public class Carro extends ProdutoDuravel {

    private String color;

    public Carro(int id, String nome, double preco, String marca, String descricao, String data, String material, String durabilidade, String cor, boolean avaria) {
        super(id, nome, preco, marca, descricao, data, material, durabilidade, avaria);
        this.color = cor;
    }

    public String getCor() {
        return color;
    }

    public void setCor(String color) {
        this.color = color;
    }

    @Override
    public boolean isEletroEletronico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isDisponivel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
