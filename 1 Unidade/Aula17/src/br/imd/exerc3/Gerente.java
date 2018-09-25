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
public class Gerente extends Funcionario{

    private int qntBonificacao;
    
    public Gerente(String nome, String dataNascimento, String cpf, float salario) {
        super(nome, dataNascimento, cpf, salario);
        this.qntBonificacao = 0;
    }

    @Override
    public double getBonificacao() {
        qntBonificacao++;
        return qntBonificacao;
    }
    
    
    
}
