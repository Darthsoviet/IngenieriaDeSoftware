/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.patronsingleton;

import com.fes.aragon.BaseDeDatosSingleton;
import com.fes.conalep.BaseDeDatos;

/**
 *
 * @author silve
 */
public class PatronSingleton {

    public static void main(String[] args) {
        BaseDeDatos bd = new BaseDeDatos("localhost", "puto", "test", "3306", "root");
        BaseDeDatos bd1 = new BaseDeDatos("localhost", "puto", "test", "3306", "root");
        BaseDeDatos bd2 = new BaseDeDatos("localhost", "puto", "test", "3306", "root");
        bd.consultaClientes();
        bd1.consultaClientes();
        System.out.println("termina codigo conalep");
        BaseDeDatosSingleton bds = BaseDeDatosSingleton.getInstance();
        BaseDeDatosSingleton bds1 = BaseDeDatosSingleton.getInstance();
        BaseDeDatosSingleton bds2 = BaseDeDatosSingleton.getInstance();
        bds.consultaClientes();
        bds1.consultaClientes();
        bds2.consultaClientes();
    }

}
