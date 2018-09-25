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
public class Quadrado extends Forma {
    
    private float lado;
    
    public Quadrado( float lado ){
        super();
        this.lado = lado;
    }

    @Override
    public float calcularArea() {
        return (lado * lado * lado * lado);
    }

    @Override
    public float calcularPerimetro() {
        return (lado * 4);
    }

    @Override
    public String toString() {
        return "Lado = " + lado;
    }
    
    
    
}
