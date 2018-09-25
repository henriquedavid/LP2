package br.imd.exerc1;

public abstract class ProdutoDuravel extends Produto {

    private String materialPredominante;
    private String durabilidade;
    private boolean avaria;

    public ProdutoDuravel(int id, String nome, double preco, String marca, String descricao, String data, String material, String durabilidade, boolean avaria) {
        super(id, nome, preco, marca, descricao, data);
        this.materialPredominante = material;
        this.durabilidade = durabilidade;
        this.avaria = avaria;
    }

    public void setMaterial(String material) {
        this.materialPredominante = material;
    }

    public String getMaterial() {
        return materialPredominante;
    }

    public void setDurabilidade(String durabilidade) {
        this.durabilidade = durabilidade;
    }

    public String getDurabilidade() {
        return durabilidade;
    }

    public boolean isAvaria() {
        return avaria;
    }

    public void setAvaria(boolean avaria) {
        this.avaria = avaria;
    }

    public abstract boolean isEletroEletronico();

}
