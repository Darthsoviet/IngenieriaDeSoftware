/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.dp;

import ico.fes.db.UsuarioDao;

/**
 *
 * @author silve
 */
public class Usuario {
    private String login;
    private String password;
    private String nombre;
    private boolean administrador;

    public Usuario() {
    }

    public Usuario(String login, String password, String nombre, boolean administrador) {
        this.login = login;
        this.password = password;
        this.nombre = nombre;
        this.administrador = administrador;
    }
    
    public boolean loggin(String l,String p){
        UsuarioDao userDao = new UsuarioDao();
        return userDao.loggin(l,p);
        
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
    
    
}
