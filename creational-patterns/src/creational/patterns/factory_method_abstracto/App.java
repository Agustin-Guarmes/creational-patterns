package creational.patterns.factory_method_abstracto;


import creational.patterns.factory_method_abstracto.factory.FiguraFactory;

public class App {
    public static void main(String[] args) {
        Demo demo = new Demo();
        FiguraFactory figuraFactory = demo.crearFigura(Demo.CUADRADO);
        figuraFactory.mostrarSuperficie();
    }
}
