/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.patterns.builder.builderPc;

import creational.patterns.builder.entidad.Computadora;
import creational.patterns.builder.entidad.PlacaMadre;
import creational.patterns.builder.entidad.PlacaVideo;
import creational.patterns.builder.entidad.Procesador;
import creational.patterns.builder.entidad.Psu;
import creational.patterns.builder.entidad.Ram;

/**
 *
 * @author franc
 */
public class PcBuilder implements Builder{
    private String tipo;
    private Procesador cpu;
    private Ram ram;
    private PlacaVideo placaVideo;
    private Psu psu;
    private PlacaMadre placaMadre;
    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setProcesador(Procesador cpu) {
        this.cpu = cpu;
    }

    @Override
    public void setRam(Ram ram) {
        this.ram = ram;
    }

    @Override
    public void SetPlacaVideo(PlacaVideo placaVideo) {
        this.placaVideo = placaVideo;
    }

    @Override
    public void setPsu(Psu psu) {
        this.psu = psu;
    }

    @Override
    public void setPlacaMadre(PlacaMadre placaMadre) {
        this.placaMadre = placaMadre;
    }
    public Computadora getResult(){
        return new Computadora(tipo,cpu,ram,placaVideo,psu,placaMadre);
    }
}
