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
public class PlacaVideo {
    private String Marca;
    private String modelo;
    private String memoria;

    public PlacaVideo(String marca, String modelo, String memoria) {
        Marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }
}
