/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fes.conalep;

/**
 *
 * @author silve
 */
public class BaseDeDatos {

    String url;
    String password;
    String nombreBD;
    String puerto;
    String usuario;

    public BaseDeDatos() {
        System.out.println("conectando a BD...");
    }

    public BaseDeDatos(String url, String password, String nombreBD, String puerto, String usuario) {
        this.url = url;
        this.password = password;
        this.nombreBD = nombreBD;
        this.puerto = puerto;
        this.usuario = usuario;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreBD() {
        return nombreBD;
    }

    public void setNombreBD(String nombreBD) {
        this.nombreBD = nombreBD;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void consultaClientes() {
        System.out.println("id de este objeto " + this.toString());
        System.out.println("ID  / nombre / TELEFONO");
        System.out.println("ID  / nombre / TELEFONO");
        System.out.println("ID  / nombre / TELEFONO");

        System.out.println("ID  / nombre / TELEFONO");

        System.out.println("ID  / nombre / TELEFONO");

        System.out.println("ID  / nombre / TELEFONO");

    }

}
