/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.imd.exerc3;

/**
 *
 * @author henriquedavid
 */
public abstract class Funcionario {
    
    private String nome;
    private String dataNascimento;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String dataNascimento, String cpf, float salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public abstract double getBonificacao();

    @Override
    public String toString() {
        return "Nome = " + nome + 
                ", Data de Nascimento = " + dataNascimento + 
                ", CPF = " + cpf + ", "
                + "Salario=" + salario;
    }
   
}
