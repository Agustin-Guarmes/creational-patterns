/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.patterns.builder.director;

import creational.patterns.builder.builderPc.Builder;
import creational.patterns.builder.entidad.PlacaMadre;
import creational.patterns.builder.entidad.PlacaVideo;
import creational.patterns.builder.entidad.Procesador;
import creational.patterns.builder.entidad.Psu;
import creational.patterns.builder.entidad.Ram;

/**
 *
 * @author franc
 */
public class Director {
    public void crearPcGamer(Builder builder){
     builder.setTipo("GAMER");
     builder.setPlacaMadre(new PlacaMadre("ASUS",3));
     builder.setProcesador(new Procesador("i9","Intel","4.70Ghz"));
     builder.setRam(new Ram("Kingston","Fury","16gb"));
     builder.setPsu(new Psu("ASUS","AR530"));
     builder.SetPlacaVideo(new PlacaVideo("MSI","RTX3060","4gb"));

 }

 public void crearPcOficina(Builder builder){
     builder.setTipo("OFICINA");
     builder.setPlacaMadre(new PlacaMadre("ASUS",1));
     builder.setProcesador(new Procesador("Pentium","Intel","1.3Ghz"));
     builder.setRam(new Ram("Kingston","Normal","2gb"));
     builder.setPsu(new Psu("Magnum Tech","MT-PSU500"));
     builder.SetPlacaVideo(new PlacaVideo("Asus","Gt170","1gb"));
 }
}
