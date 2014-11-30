/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.educacionit.vehiculos.pruebas;

import ar.com.educacionit.vehiculos.entidades.Auto;
import ar.com.educacionit.vehiculos.entidades.Comprador;
import ar.com.educacionit.vehiculos.entidades.Vendedor;

/**
 *
 * @author meme
 */
public class Integrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Auto a1 = new Auto ("Fiat", "Uno", "Rojo", 112,345,253);
        System.out.println(a1.toString());
        System.out.println("");
        
        Comprador c1 = new Comprador (1213,"Micaela", "Melek", "37204226");
        System.out.println(c1.toString());
        System.out.println("");
        
        Vendedor v1 = new Vendedor (2, "Adan", "Koch", "37181059");
        System.out.println(v1.toString())
                ;
        
       
    }
    
}
