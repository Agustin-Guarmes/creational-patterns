package creational.patterns.abstractFactory.concreteFactory;

import creational.patterns.abstractFactory.concreteClasses.SonyMobilePhone;
import creational.patterns.abstractFactory.concreteClasses.SonySmartTV;
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
