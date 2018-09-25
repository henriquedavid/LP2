package br.imd.exerc1;

public abstract class Produto {

    private int id;
    private String nome;
    private double preco;
    private String marca;
    private String descricao;
    private String data;

    public Produto() {
        id = 0;
        nome = "";
        preco = 0;
        marca = "";
        descricao = "";
        data = "";
    }

    public Produto(int id, String nome, double preco, String marca, String descricao, String data) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.descricao = descricao;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getData() {
        return this.data;
    }

    public abstract boolean isDisponivel();
}
