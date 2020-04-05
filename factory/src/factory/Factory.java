/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import ico.fes.is.factory.Snack;

/**
 *
 * @author silve
 */
public class Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Snack snack = SnackFactory.createSnack(Snack.PIZZA_HAW);
        snack = SnackFactory.createSnack(Snack.TORTA_MILANESA);
        
    }
    
}
