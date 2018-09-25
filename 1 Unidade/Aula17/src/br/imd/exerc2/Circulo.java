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
public class Circulo extends Forma {
    
    private float raio;

    public Circulo(float raio) {
        super();
        this.raio = raio;
    }
    
    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
    @Override
    public float calcularArea() {
        float area =  (float) ((raio*raio) * Math.PI);
        return area;
    }

    @Override
    public float calcularPerimetro() {
        float perimetro = (float) (raio * (2 * Math.PI));
        return perimetro;
    }

    @Override
    public String toString() {
        return "Raio = " + raio;
    }
    
    
}
