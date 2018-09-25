/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.imd.exerc2;

/**
 *
 * @author henriquedavid
 */
public class Main {
    public static void main(String[] args) {
        RepositorioForma rp = new RepositorioForma();
        
        rp.adicionaFormas(10);
        rp.calcularTodas();
    }
}
