package creational.patterns.abstractFactory.concreteFactories;

import creational.patterns.abstractFactory.concreteProducts.SamsungMobilePhone;
import creational.patterns.abstractFactory.concreteProducts.SamsungSmartTv;
import creational.patterns.abstractFactory.interfaces.AbstractFactoryElectronicDevice;
import creational.patterns.abstractFactory.interfaces.MobilePhone;
import creational.patterns.abstractFactory.interfaces.SmartTV;

public class SamsungFactory implements AbstractFactoryElectronicDevice {
    @Override
    public SmartTV createSmartTV() {
        return new SamsungSmartTv();
    }

    @Override
    public MobilePhone createMobilePhone() {
        return new SamsungMobilePhone();
    }
}
