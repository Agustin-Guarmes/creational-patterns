package creational.patterns.factory_method_abstracto.factory.impl;

import creational.patterns.factory_method_abstracto.entity.Construible;
import creational.patterns.factory_method_abstracto.entity.impl.Departamento;
import creational.patterns.factory_method_abstracto.factory.ViviendaFactory;

public class DepartamentoFactory extends ViviendaFactory {


    @Override
    public Construible construirVivienda() {
        return new Departamento();
    }
}
