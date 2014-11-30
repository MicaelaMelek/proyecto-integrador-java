/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.vehiculos.entidades;

import ar.com.educacionit.base.entidades.Persona;
import java.util.logging.Logger;

/**
 *
 * @author meme
 */
public class Vendedor extends Persona {
    
    int cantDeAutosVendidos;
    private static final Logger LOG = Logger.getLogger(Vendedor.class.getName());

    public Vendedor(int cantDeAutosVendidos, String nombre, String apellido, 
            String numeroDocumento) {
        super(nombre, apellido, numeroDocumento);
        this.cantDeAutosVendidos = cantDeAutosVendidos;
    }

    
    public int getCantDeAutosVendidos() {
        return cantDeAutosVendidos;
    }

    public void setCantDeAutosVendidos(int cantDeAutosVendidos) {
        this.cantDeAutosVendidos = cantDeAutosVendidos;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "cantDeAutosVendidos=" + cantDeAutosVendidos + 
                super.toString() + '}';
    }
    
    
    
    
    
    
}
