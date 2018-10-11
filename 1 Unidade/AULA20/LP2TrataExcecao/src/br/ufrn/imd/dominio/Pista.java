/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.imd.dominio;

import br.ufrn.imd.controle.AcimaVelocidadeException;
import br.ufrn.imd.controle.PistaException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author henriquedavid
 */
public class Pista {
 
    public void iniciar() throws PistaException {
        Automovel auto = new Automovel();
        
        try {
            auto.acelerar(130);
        } catch (AcimaVelocidadeException ave) {
            throw new PistaException("Problema na Pista!!!", ave);
        }
    }
}
