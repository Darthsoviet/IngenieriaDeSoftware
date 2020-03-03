/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.db;

/**
 *
 * @author silve
 */
public class UsuarioDao {
    public boolean loggin(String l,String p){
        boolean res = false;
        if(l.equals("dios") && p.equals("1234")){
            res=true;
            
        }
        return res;
    }
}
