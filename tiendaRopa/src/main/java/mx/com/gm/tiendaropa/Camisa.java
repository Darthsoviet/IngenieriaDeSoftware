/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.tiendaropa;

/**
 *
 * @author silve
 */
public class Camisa {
    
    private int idCamisa;
    public final static int CORTA=1;
    public final static int  MEDIA=2;
    public final static int LARGA=3;
    private double precio;

    

    public Camisa(int idCamisa) {
        this.idCamisa = idCamisa;
        switch(idCamisa){
            case 1:
                this.setPrecio(190);
                break;
            
            case 2:
                this.setPrecio(230);
                break;
            case 3:
                this.setPrecio(310);
                break;
        }
        
    }

    public int getIdCamisa() {
        return idCamisa;
    }

    public void setIdCamisa(int idCamisa) {
        this.idCamisa = idCamisa;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    
    
   
    
    
}
