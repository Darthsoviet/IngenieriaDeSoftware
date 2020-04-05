/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is.foodtruck;

import ico.fes.is.factory.Snack;

/**
 *
 * @author silve
 */
public class Hamburguesa implements Snack{
   private String tipoCarne;
   private boolean dobleQueso;
   private boolean piña;
   private boolean dobleCarne;
   private boolean tocino;
   private boolean picante;

    public Hamburguesa() {
    }

    public Hamburguesa(String tipoCarne, boolean dobleQueso, boolean piña, boolean dobleCarne, boolean tocino, boolean picante) {
        this.tipoCarne = tipoCarne;
        this.dobleQueso = dobleQueso;
        this.piña = piña;
        this.dobleCarne = dobleCarne;
        this.tocino = tocino;
        this.picante = picante;
    }

    public boolean isPicante() {
        return picante;
    }

    public void setPicante(boolean picante) {
        this.picante = picante;
    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public boolean isDobleQueso() {
        return dobleQueso;
    }

    public void setDobleQueso(boolean dobleQueso) {
        this.dobleQueso = dobleQueso;
    }

    public boolean isPiña() {
        return piña;
    }

    public void setPiña(boolean piña) {
        this.piña = piña;
    }

    public boolean isDobleCarne() {
        return dobleCarne;
    }

    public void setDobleCarne(boolean dobleCarne) {
        this.dobleCarne = dobleCarne;
    }

    public boolean isTocino() {
        return tocino;
    }

    public void setTocino(boolean tocino) {
        this.tocino = tocino;
    }

    @Override
    public String toString() {
        return "Hamburguesa{" + "tipoCarne=" + tipoCarne + ", dobleQueso=" + dobleQueso + ", pi\u00f1a=" + piña + ", dobleCarne=" + dobleCarne + ", tocino=" + tocino + ", picante=" + picante + '}';
    }
   
    
}
