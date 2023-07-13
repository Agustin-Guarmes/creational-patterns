package creational.patterns.factory_method_concreto;

import creational.patterns.factory_method_concreto.entity.Figura;

public class App {
    public static void main(String[] args) {
        FiguraFactory factory = FiguraFactory.getInstance();
        Figura figura1 = factory.crearFigura(FiguraFactory.CIRCULO);
        Figura figura2 = factory.crearFigura(FiguraFactory.CUADRADO);
        System.out.println(figura1.calcularSuperficie());
        System.out.println(figura2.calcularSuperficie());
    }
}
