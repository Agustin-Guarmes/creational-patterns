package creational.patterns.factory_method_concreto;

import creational.patterns.factory_method_concreto.entity.Figura;

public class App {
    public static void main(String[] args) {
        FiguraFactory factory = new FiguraFactory();
        Figura figura1 = factory.crearFigura(factory.CIRCULO);
        Figura figura2 = factory.crearFigura(factory.CUADRADO);
        factory.mostrarSuperficie(figura1);
        factory.mostrarSuperficie(figura2);
    }
}
