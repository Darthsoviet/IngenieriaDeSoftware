/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is.celulares;

/**
 *
 * @author silve
 */
public class Iphone extends Celular{

    public Iphone() {
    }

    public Iphone(double pantalla, String so, String procesador, String alamacenamiento, String camaraFrontal, String camaraTrasera, int ram, String bateria) {
        super(pantalla, so, procesador, alamacenamiento, camaraFrontal, camaraTrasera, ram, bateria);
    }
    
    
    @Override
    public void setBateria(String bateria) {
        super.setBateria(bateria); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getBateria() {
        return super.getBateria(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRam(int ram) {
        super.setRam(ram); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRam() {
        return super.getRam(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCamaraTrasera(String camaraTrasera) {
        super.setCamaraTrasera(camaraTrasera); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCamaraTrasera() {
        return super.getCamaraTrasera(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCamaraFrontal(String camaraFrontal) {
        super.setCamaraFrontal(camaraFrontal); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCamaraFrontal() {
        return super.getCamaraFrontal(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAlamacenamiento(String alamacenamiento) {
        super.setAlamacenamiento(alamacenamiento); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAlamacenamiento() {
        return super.getAlamacenamiento(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setProcesador(String procesador) {
        super.setProcesador(procesador); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getProcesador() {
        return super.getProcesador(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSo(String so) {
        super.setSo(so); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSo() {
        return super.getSo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPantalla(double pantalla) {
        super.setPantalla(pantalla); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPantalla() {
        return super.getPantalla(); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
