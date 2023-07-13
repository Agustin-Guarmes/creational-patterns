package creational.patterns.abstractFactory.concreteClasses;

import creational.patterns.abstractFactory.interfaces.SmartTV;

public class SonySmartTV implements SmartTV {
    public SonySmartTV() {
    }

    @Override
    public void paint() {
        System.out.println("Smart TV Sony A80J");
    }
}
