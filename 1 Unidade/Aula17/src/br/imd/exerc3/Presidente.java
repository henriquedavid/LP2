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
public class Presidente extends Funcionario{

    private int qntBonificacao;
    
    public Presidente(String nome, String dataNascimento, String cpf, float salario) {
        super(nome, dataNascimento, cpf, salario);
        qntBonificacao = 0;
    }

    @Override
    public double getBonificacao() {
        qntBonificacao++;
        return qntBonificacao;
    }
    
    
}
