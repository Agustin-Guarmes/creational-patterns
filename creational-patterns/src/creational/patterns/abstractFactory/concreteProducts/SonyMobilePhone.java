package creational.patterns.abstractFactory.concreteProducts;

import creational.patterns.abstractFactory.interfaces.MobilePhone;

public class SonyMobilePhone implements MobilePhone {

    @Override
    public void paint() {
        System.out.println("Teléfono móvil Sony Xperia");
    }
}
