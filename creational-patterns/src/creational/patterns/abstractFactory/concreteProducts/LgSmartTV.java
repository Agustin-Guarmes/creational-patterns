package creational.patterns.abstractFactory.concreteProducts;

import creational.patterns.abstractFactory.interfaces.SmartTV;

public class LgSmartTV implements SmartTV {
    @Override
    public void paint() {
        System.out.println("Smart TV LG Evo OLED55C2PSA");
    }
}
