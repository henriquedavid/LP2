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
public class Retangulo extends Forma{
    
    private float lado;
    private float altura;

    public Retangulo(float lado, float altura) {
        super();
        this.lado = lado;
        this.altura = altura;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    @Override
    public float calcularArea() {
        float area = lado*altura;
        return area;
    }

    @Override
    public float calcularPerimetro() {
        float perimetro  = (2 * altura) + (2 * lado);
        return perimetro;
    }

    @Override
    public String toString() {
        return "Lado = " + lado + " | Altura=" + altura;
    }
    
    
    
}
