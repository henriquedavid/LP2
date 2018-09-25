/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.imd.exerc3;

import java.util.ArrayList;
/**
 *
 * @author henriquedavid
 */
public class ControleDeBonificacoes {

    private int qntMax;
    private ArrayList<Funcionario> bonificados;
    private ArrayList<Funcionario> naoBonificados;

    public void registrarBonificacao(Funcionario funcionario) {
        if (funcionario.getBonificacao() < 5) {
            double valor = funcionario.getSalario();

            if (funcionario instanceof Gerente) {
                funcionario.setSalario(calcularBonificacao(valor, 10));
            } else if (funcionario instanceof Diretor) {
                funcionario.setSalario(calcularBonificacao(valor, 20));
            } else {
                funcionario.setSalario(calcularBonificacao(valor, 30));
            }
        }
    }
    
    public void cadastrarFuncionario(){
        
    }

    public double calcularBonificacao(double valor, float porc) {
        valor += ((valor * porc) / 100);
        return valor;
    }

}
