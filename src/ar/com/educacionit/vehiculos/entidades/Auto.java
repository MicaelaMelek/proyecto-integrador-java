/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.vehiculos.entidades;

import ar.com.educacionit.base.entidades.Vehiculo;

/**
 *
 * @author meme
 */
public class Auto extends Vehiculo {
    
    public Auto(String marca, String modelo, 
            String color, int alto, int ancho, int largo) {
        super(alto, ancho, largo);
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    private String marca;
    private String modelo;
    private String color;

    @Override
    public String toString() {
        return super.toString() +"Auto{" + "marca=" + marca + ", modelo=" 
                + modelo + ", color=" + color+""+super.toString()+'}';
    }
    
    
}
