package creational.patterns.abstractFactory.concreteFactories;

import creational.patterns.abstractFactory.concreteProducts.LgMobilePhone;
import creational.patterns.abstractFactory.concreteProducts.LgSmartTV;
import creational.patterns.abstractFactory.interfaces.AbstractFactoryElectronicDevice;
import creational.patterns.abstractFactory.interfaces.MobilePhone;
import creational.patterns.abstractFactory.interfaces.SmartTV;

public class LgFactory implements AbstractFactoryElectronicDevice {
    @Override
    public SmartTV createSmartTV() {
        return new LgSmartTV();
    }

    @Override
    public MobilePhone createMobilePhone() {
        return new LgMobilePhone();
    }
}
