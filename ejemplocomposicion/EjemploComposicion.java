/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocomposicion;

import domain.Deportivo;
import domain.Organo;
import domain.Sistema;
import domain.Zapato;
import java.util.ArrayList;

/**
 *
 * @author richar
 */
public class EjemploComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Sistema digestivo = new Sistema();
        
        Organo estomago = new Organo("Estomago", "Digerir alimentos");
        Organo boca = new Organo("Boca", "Masticar");
        
        ArrayList<Organo> organos = new ArrayList<Organo>();
        organos.add(boca);
        organos.add(estomago);
        
        digestivo.setOrganos(organos);
        digestivo.setNombre("Digestivo");
        
        digestivo.Imprimir();
        
        Zapato nike = new Deportivo("Futbol", 38);
        System.out.println(nike.toString());
    }
    
}
