/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fes.aragon;

/**
 *
 * @author silve
 */
public class BaseDeDatosSingleton {

    String url;
    String password;
    String nombreBD;
    String puerto;
    String usuario;
    private static BaseDeDatosSingleton instance = null;

    private BaseDeDatosSingleton() {
        System.out.println("conectando a BD...");
    }

    private BaseDeDatosSingleton(String url, String password, String nombreBD, String puerto, String usuario) {
        this.url = url;
        this.password = password;
        this.nombreBD = nombreBD;
        this.puerto = puerto;
        this.usuario = usuario;
    }

    public static BaseDeDatosSingleton getInstance() {
        if (instance == null) {
            instance = new BaseDeDatosSingleton();
            return instance;
        } else {
            return instance;

        }
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


