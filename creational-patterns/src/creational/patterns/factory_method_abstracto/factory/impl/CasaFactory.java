package creational.patterns.factory_method_abstracto.factory.impl;

import creational.patterns.factory_method_abstracto.entity.Construible;
import creational.patterns.factory_method_abstracto.entity.impl.Casa;
import creational.patterns.factory_method_abstracto.factory.ViviendaFactory;

public class CasaFactory extends ViviendaFactory {

    @Override
    public Construible construirVivienda() {
        return new Casa();
    }
}
