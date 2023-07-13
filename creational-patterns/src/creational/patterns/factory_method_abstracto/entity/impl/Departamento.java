package creational.patterns.factory_method_abstracto.entity.impl;

import creational.patterns.factory_method_abstracto.entity.Construible;

public class Departamento implements Construible {

    @Override
    public void cotizar() {
        System.out.println("Cotizando Departamento ...");
    }
}
