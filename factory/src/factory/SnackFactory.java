/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import ico.fes.is.factory.Snack;
import ico.fes.is.foodtruck.Hamburguesa;
import ico.fes.is.foodtruck.Pizza;
import ico.fes.is.foodtruck.Torta;

import sun.security.jgss.TokenTracker;

/**
 *
 * @author silve
 */
public class SnackFactory implements Snack{
    
    public static Snack createSnack(int tipo){
        switch (tipo) {

            case Snack.PIZZA_HAW:
                return new Pizza("jamon y piña", false, false, false);
                
            case Snack.PIZZA_MARG:
                return new Pizza("Albhaca y aceite de olivo", false, true , true);
                
            case Snack.PIZZA_CARNE:
                return new Pizza("xarne de res,cerdo,pollo", true, true, false);

            case Snack.PIZZA_PEPERONI:
                return new Pizza("peperoni",false,true,false);

            case Snack.HAMBURGUESA_HAW:
                return new Hamburguesa("res", false, true, false, false, true);

            case Snack.HAMBURGUESA_DE_POLLO:
                return new Hamburguesa("pollo", false, false, false, false, false); 

            case Snack.HAMBURGUESA_DOBLE_CON_QUESO:
                return new Hamburguesa("res", true, false, false, false, false);

            case Snack.HAMBURGUESA_BBQ:
                return new Hamburguesa("true", true, false, true, false, false);

            case Snack.TORTA_BASICA:
                return new Torta("basica", true, false, true, false);

            case Snack.TORTA_CUBANA:
                return new Torta("torta cubana", true, true, true, true);

            case Snack.TORTA_MILANESA:
                return new Torta("milanesa", false, true, true, true);

            
            default:

                throw new AssertionError();
        }
        
    }
    
}