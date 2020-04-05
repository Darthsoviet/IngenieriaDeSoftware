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
public class Pizza implements Snack {

    private String ingredientePrincipal;
    boolean dobleQueso;
    boolean salsaDeTomate;
    boolean orillaQueso;

    public Pizza() {
    }

    public Pizza(String ingredientePrincipal, boolean dobleQueso, boolean salsaDeTomate, boolean orillaQueso) {
        this.ingredientePrincipal = ingredientePrincipal;
        this.dobleQueso = dobleQueso;
        this.salsaDeTomate = salsaDeTomate;
        this.orillaQueso = orillaQueso;
    }

    public String getIngredientePrincipal() {
        return ingredientePrincipal;
    }

    public void setIngredientePrincipal(String ingredientePrincipal) {
        this.ingredientePrincipal = ingredientePrincipal;
    }

    public boolean isDobleQueso() {
        return dobleQueso;
    }

    public void setDobleQueso(boolean dobleQueso) {
        this.dobleQueso = dobleQueso;
    }

    public boolean isSalsaDeTomate() {
        return salsaDeTomate;
    }

    public void setSalsaDeTomate(boolean salsaDeTomate) {
        this.salsaDeTomate = salsaDeTomate;
    }

    public boolean isOrillaQueso() {
        return orillaQueso;
    }

    public void setOrillaQueso(boolean orillaQueso) {
        this.orillaQueso = orillaQueso;
    }

    @Override
    public String toString() {
        return "Pizza{" + "ingredientePrincipal=" + ingredientePrincipal + ", dobleQueso=" + dobleQueso + ", salsaDeTomate=" + salsaDeTomate + ", orillaQueso=" + orillaQueso + '}';
    }
    
    

}
