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
public class Celular {
    private double pantalla;
    private String so;
    private String procesador;
    private String alamacenamiento;
    private String camaraFrontal;
    private String camaraTrasera;
    private int ram ;
    private String bateria;

    public Celular() {
    }

    public Celular(double pantalla, String so, String procesador, String alamacenamiento, String camaraFrontal, String camaraTrasera, int ram, String bateria) {
        this.pantalla = pantalla;
        this.so = so;
        this.procesador = procesador;
        this.alamacenamiento = alamacenamiento;
        this.camaraFrontal = camaraFrontal;
        this.camaraTrasera = camaraTrasera;
        this.ram = ram;
        this.bateria = bateria;
    }

    public double getPantalla() {
        return pantalla;
    }

    public void setPantalla(double pantalla) {
        this.pantalla = pantalla;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getAlamacenamiento() {
        return alamacenamiento;
    }

    public void setAlamacenamiento(String alamacenamiento) {
        this.alamacenamiento = alamacenamiento;
    }

    public String getCamaraFrontal() {
        return camaraFrontal;
    }

    public void setCamaraFrontal(String camaraFrontal) {
        this.camaraFrontal = camaraFrontal;
    }

    public String getCamaraTrasera() {
        return camaraTrasera;
    }

    public void setCamaraTrasera(String camaraTrasera) {
        this.camaraTrasera = camaraTrasera;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }
    
    
    
}
