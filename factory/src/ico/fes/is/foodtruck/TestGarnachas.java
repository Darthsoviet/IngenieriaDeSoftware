/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is.foodtruck;

import java.util.Scanner;

/**
 *
 * @author silve
 */
public class TestGarnachas {
   
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.println("que deseas comprar puñal?");
        System.out.println("1) pizza hawaiana orilla de queso");
        System.out.println("2) pizza margarita con doble queso");
        System.out.println("3) Hamburguesa sencilla");
        System.out.println("4) Hamburguesa hawaiana");
        opcion=teclado.nextInt();
        
        switch (opcion) {
            case 1:
                Pizza p = new Pizza("jamon y piña", false, false, true);
                System.out.println(p);
                break;
                
            case 2:
                
                break;
                
            case 3:
            
            
                break;
            case 4:
                Hamburguesa h = new Hamburguesa("res", false, true, false, false, false);
                System.out.println(h);
                    break;
            default:
                throw new AssertionError();
        }
        
    }
    

}
