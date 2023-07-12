package creational.patterns.factory_method_abstracto.factory.impl;

import creational.patterns.factory_method_abstracto.entity.Figura;
import creational.patterns.factory_method_abstracto.entity.impl.Cuadrado;
import creational.patterns.factory_method_abstracto.factory.FiguraFactory;

public class CuadradoFactory extends FiguraFactory {

    @Override
    public Figura crearFigura() {
        return new Cuadrado();
    }
}
