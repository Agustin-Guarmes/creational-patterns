package creational.patterns.factory_method_concreto;

import creational.patterns.factory_method_concreto.entity.Figura;
import creational.patterns.factory_method_concreto.entity.impl.Circulo;
import creational.patterns.factory_method_concreto.entity.impl.Cuadrado;

public class FiguraFactory {
    public static final String CIRCULO = "circulo";
    public static final String CUADRADO = "cuadrado";

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

    public void mostrarSuperficie(Figura figura){
        System.out.println(figura.calcularSuperficie());
    }
}
