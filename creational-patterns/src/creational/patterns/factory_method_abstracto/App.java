package creational.patterns.factory_method_abstracto;


import creational.patterns.factory_method_abstracto.entity.Construible;
import creational.patterns.factory_method_abstracto.factory.ViviendaFactory;

public class App {
    public static void main(String[] args) {
        Inmobiliaria inmobiliaria = new Inmobiliaria();
        ViviendaFactory viviendaFactory = inmobiliaria.crearViviendaFactory("casa");
        Construible vivienda = viviendaFactory.cotizarYConstruir();
        System.out.println(vivienda.getClass().getSimpleName());
    }
}
