package creational.patterns.factory_method_abstracto;

import creational.patterns.factory_method_abstracto.factory.FiguraFactory;
import creational.patterns.factory_method_abstracto.factory.impl.CirculoFactory;
import creational.patterns.factory_method_abstracto.factory.impl.CuadradoFactory;

public class Demo {

    public static final String CIRCULO = "circulo";
    public static final String CUADRADO = "cuadrado";

    public FiguraFactory crearFigura(String tipo) {
        FiguraFactory figura = null;
        switch (tipo) {
            case CIRCULO:
                figura = new CirculoFactory();
                break;
            case CUADRADO:
                figura = new CuadradoFactory();
                break;
        }
        return figura;
    }

}
