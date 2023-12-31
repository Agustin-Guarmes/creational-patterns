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
public class ManualPc {
    private final String tipo;
    private final Procesador cpu;
    private final Ram ram;
    private final PlacaVideo placaVideo;
    private final Psu psu;
    private final PlacaMadre placaMadre;

    public ManualPc(String tipo, Procesador cpu, Ram ram, PlacaVideo placaVideo, Psu psu, PlacaMadre placaMadre) {
        this.tipo = tipo;
        this.cpu = cpu;
        this.ram = ram;
        this.placaVideo = placaVideo;
        this.psu = psu;
        this.placaMadre = placaMadre;
    }


    public String print() {
        return "Manual de pc Tipo: " + tipo +"\n"+
                "Componetes: \n"+
                "cpu =" + cpu.getMarca() +" Modelo: "+cpu.getModelo() +" Velocidad: " +cpu.getVelocidad() +"\n"+
                ", ram=" + ram.getMarca() +" Modelo: "+ram.getModelo()+ " Memoria: "+ ram.getMemoria()+"\n"+
                ", placaVideo=" + placaVideo.getMarca() +" Modelo: "+placaVideo.getModelo()+" Memoria:"+placaVideo.getMemoria()+"\n"+
                ", psu=" + psu.getMarca() +" Modelo: "+psu.getModelo()+"\n"+
                ", placaMadre=" + placaMadre.getModelo()+" Puertos:"+placaMadre.getCantPuertos();
    }
}
