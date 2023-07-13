package creational.patterns.factory_method_concreto;

import creational.patterns.factory_method_concreto.entity.Figura;
import creational.patterns.factory_method_concreto.entity.impl.Circulo;
import creational.patterns.factory_method_concreto.entity.impl.Cuadrado;

public class FiguraFactory {
    public static final String CIRCULO = "circulo";
    public static final String CUADRADO = "cuadrado";
    private static FiguraFactory instance;
    private FiguraFactory(){}

    public static FiguraFactory getInstance(){
        if(instance == null) instance = new FiguraFactory();
        return instance;
    }

    public Figura crearFigura(String tipo) {
        Figura figura = null;
        switch (tipo) {
            case CIRCULO:
                figura = new Circulo();
                break;
            case CUADRADO:
                figura = new Cuadrado();
                break;
            default:
                System.out.println("Alguna excepcion");
                break;
        }
        return figura;
    }
}
