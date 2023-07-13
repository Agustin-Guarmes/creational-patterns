package creational.patterns.abstractFactory.concreteProducts;

import creational.patterns.abstractFactory.interfaces.SmartTV;

public class SamsungSmartTv implements SmartTV {
    @Override
    public void paint() {
        System.out.println("Smart TV Samsung Neo QLED 4K");
    }
}
