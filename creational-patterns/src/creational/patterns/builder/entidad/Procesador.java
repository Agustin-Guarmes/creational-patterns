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
public class Procesador {
    private String modelo;
    private String marca;
    private String velocidad;

    public Procesador(String modelo, String marca, String velocidad) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidad = velocidad;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }
}
