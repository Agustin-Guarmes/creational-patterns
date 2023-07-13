/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.patterns.builder.entidad;

/**
 *
 * @author franc
 */
public class PlacaMadre {
    private String modelo;
    private int cantPuertos;

    public PlacaMadre(String modelo, int cantPuertos) {
        this.modelo = modelo;
        this.cantPuertos = cantPuertos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCantPuertos() {
        return cantPuertos;
    }

    public void setCantPuertos(int cantPuertos) {
        this.cantPuertos = cantPuertos;
    }
}
