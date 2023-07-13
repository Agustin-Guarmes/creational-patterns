package Directores;

import BuilderPc.Builder;
import Entidad.*;

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
