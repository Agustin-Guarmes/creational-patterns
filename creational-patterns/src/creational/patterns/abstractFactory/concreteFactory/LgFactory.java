package creational.patterns.abstractFactory.concreteFactory;

import creational.patterns.abstractFactory.concreteClasses.LgMobilePhone;
import creational.patterns.abstractFactory.concreteClasses.LgSmartTV;
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
