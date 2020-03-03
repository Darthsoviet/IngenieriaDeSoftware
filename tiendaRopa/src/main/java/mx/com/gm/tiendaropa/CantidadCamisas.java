/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.tiendaropa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author silve
 */
public class CantidadCamisas extends ArrayList<Camisa>
{

    public CantidadCamisas() {
    }
    private double precio=0;

    @Override
    public boolean add(Camisa e) {
        
        return super.add(e); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public int size() {
        return super.size(); //To change body of generated methods, choose Tools | Templates.
    }
    public double getPrecio() {
        for (Camisa camisa : this) {
            this.precio+=camisa.getPrecio();
            
        }
        
        if(this.size()<=2 &&this.size() != 0){
           return this.precio;
            
        }else if(this.size()>=3 && this.size() <=5){
            this.precio = this.precio*0.95;
            return precio;
            
        }else if(this.size()>5){
            this.precio=precio*0.92;
            return precio;
                    
        }
        return precio;
        
    }
    
    
    
}
