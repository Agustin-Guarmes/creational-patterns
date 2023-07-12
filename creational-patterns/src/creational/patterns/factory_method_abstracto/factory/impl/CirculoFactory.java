package creational.patterns.factory_method_abstracto.factory.impl;

import creational.patterns.factory_method_abstracto.entity.Figura;
import creational.patterns.factory_method_abstracto.entity.impl.Circulo;
import creational.patterns.factory_method_abstracto.factory.FiguraFactory;

public class CirculoFactory extends FiguraFactory {
    @Override
    public Figura crearFigura() {
        return new Circulo();
    }
}
