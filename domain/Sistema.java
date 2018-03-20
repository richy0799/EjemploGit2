/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;

/**
 *
 * @author richar
 */
public class Sistema {
    
    private String nombre;
    private ArrayList<Organo> organos;
    
    public Sistema() {
        
    }

    public Sistema(String nombre, ArrayList<Organo> organos) {
        this.nombre = nombre;
        this.organos = organos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Organo> getOrganos() {
        return organos;
    }

    public void setOrganos(ArrayList<Organo> organos) {
        this.organos = organos;
    }


     public void Imprimir(){
         for(int i =0; i<this.getOrganos().size(); i++)
            System.out.println(this.getOrganos().get(i).toString());
        
    }
}
    
    
    

