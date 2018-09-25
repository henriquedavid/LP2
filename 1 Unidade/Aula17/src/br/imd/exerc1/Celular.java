package br.imd.exerc1;

public class Celular extends ProdutoDuravel {

    public Celular(int id, String nome, double preco, String marca, String descricao, String data, String material, String durabilidade, boolean avaria) {
        super(id, nome, preco, marca, descricao, data, material, durabilidade, avaria);
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
