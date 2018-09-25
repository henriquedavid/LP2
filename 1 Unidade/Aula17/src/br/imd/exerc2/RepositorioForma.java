/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.imd.exerc2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author henriquedavid
 */
public class RepositorioForma {
    
    private ArrayList<Forma> formas;
    private Random rand;

    public RepositorioForma() {
        this.formas = new ArrayList<Forma>();
        rand = new Random();
    }
    
    public void adicionaFormas( int qnt ){
        
        for( int i = 0; i < qnt ; i++ ){
            Circulo c = new Circulo(rand.nextInt(20));
            formas.add(c);
            Quadrado d = new Quadrado(rand.nextInt(20));
            formas.add(d);
            Retangulo r = new Retangulo(rand.nextInt(20), rand.nextInt(20));
            formas.add(r);
        }
        
    }
    
    public void calcularTodas(){
        for( Forma i : formas){
            System.out.print("Área do ");
            if( i instanceof Circulo){
                System.out.print("circulo: ");;
            } else if( i instanceof Quadrado){
                System.out.print("quadrado: ");
            } else{
                System.out.print("retângulo: ");
            }
            System.out.println(i.calcularArea());
        }
    }
    
    
    
}
