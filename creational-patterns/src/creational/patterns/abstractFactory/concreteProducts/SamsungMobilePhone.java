package creational.patterns.abstractFactory.concreteProducts;

import creational.patterns.abstractFactory.interfaces.MobilePhone;

public class SamsungMobilePhone implements MobilePhone {
    @Override
    public void paint() {
        System.out.println("Teléfono móvil Samsung Galaxy S20");
    }
}
