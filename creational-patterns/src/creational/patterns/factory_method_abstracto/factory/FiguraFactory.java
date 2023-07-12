package creational.patterns.factory_method_abstracto.factory;

import creational.patterns.factory_method_abstracto.entity.Figura;

public abstract class FiguraFactory {

    public void mostrarSuperficie() {
        Figura figura = crearFigura();
        System.out.println(figura.calcularSuperficie());
    }

    public abstract Figura crearFigura();
}
