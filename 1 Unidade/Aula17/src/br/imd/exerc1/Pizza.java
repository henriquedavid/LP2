package br.imd.exerc1;

public class Pizza extends ProdutoNaoDuravel {

    public Pizza(int id, String nome, double preco, String marca, String descricao, String data, String validade, String genero) {
        super(id, nome, preco, marca, descricao, data, validade, genero);
    }

    @Override
    public boolean isInValid() {
        if (getDataValidade().equals(2018)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isDisponivel() {
        return true;
    }

}
