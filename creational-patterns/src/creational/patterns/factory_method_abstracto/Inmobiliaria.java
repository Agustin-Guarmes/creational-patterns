package creational.patterns.factory_method_abstracto;

import creational.patterns.factory_method_abstracto.entity.Construible;
import creational.patterns.factory_method_abstracto.factory.ViviendaFactory;
import creational.patterns.factory_method_abstracto.factory.impl.CasaFactory;
import creational.patterns.factory_method_abstracto.factory.impl.DepartamentoFactory;
import creational.patterns.factory_method_concreto.FiguraFactory;

public class Inmobiliaria {

    public ViviendaFactory crearViviendaFactory(String tipo) {
        ViviendaFactory viviendaFactory = null;
        switch (tipo) {
            case "casa":
                viviendaFactory = new CasaFactory();
                break;
            case "departamento":
                viviendaFactory = new DepartamentoFactory();
                break;
            default:
                System.out.println("Alguna excepcion");
                break;
        }
        return viviendaFactory;
    }

}
