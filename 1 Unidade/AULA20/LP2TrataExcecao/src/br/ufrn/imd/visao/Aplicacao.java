/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.imd.visao;

import br.ufrn.imd.controle.PistaException;
import br.ufrn.imd.dominio.Pista;

/**
 *
 * @author henriquedavid
 */
public class Aplicacao {
    public static void main(String[] args) {
        
        Pista pista = new Pista();
        
        try{
            pista.iniciar();
        } catch(PistaException pe){
            pe.printStackTrace();
        }  finally{
            System.out.println("That's all folks...");
        }
        
        
    }
}
