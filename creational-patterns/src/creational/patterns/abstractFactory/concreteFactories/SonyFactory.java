package creational.patterns.abstractFactory.concreteFactories;

import creational.patterns.abstractFactory.concreteProducts.SonyMobilePhone;
import creational.patterns.abstractFactory.concreteProducts.SonySmartTV;
import creational.patterns.abstractFactory.interfaces.AbstractFactoryElectronicDevice;
import creational.patterns.abstractFactory.interfaces.MobilePhone;
import creational.patterns.abstractFactory.interfaces.SmartTV;

public class SonyFactory implements AbstractFactoryElectronicDevice {

    @Override
    public SmartTV createSmartTV() {
        return new SonySmartTV();
    }

    @Override
    public MobilePhone createMobilePhone() {
        return new SonyMobilePhone();
    }
}
