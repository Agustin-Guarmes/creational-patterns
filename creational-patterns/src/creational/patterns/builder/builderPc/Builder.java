/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.patterns.builder.builderPc;

import creational.patterns.builder.entidad.PlacaMadre;
import creational.patterns.builder.entidad.PlacaVideo;
import creational.patterns.builder.entidad.Procesador;
import creational.patterns.builder.entidad.Psu;
import creational.patterns.builder.entidad.Ram;

/**
 *
 * @author franc
 */
public interface Builder {
    void setTipo(String tipo);
    void setProcesador(Procesador cpu);
    void setRam(Ram ram);
    void SetPlacaVideo(PlacaVideo placaVideo);
    void setPsu(Psu psu);
    void setPlacaMadre(PlacaMadre placaMadre);
}
