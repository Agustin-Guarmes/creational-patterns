package creational.patterns.factory_method_abstracto.factory;

import creational.patterns.factory_method_abstracto.entity.Construible;

public abstract class ViviendaFactory {

    public Construible  cotizarYConstruir() {
        Construible construible = construirVivienda();
        construible.cotizar();
        return construible;
    }

    public abstract Construible construirVivienda();
}
