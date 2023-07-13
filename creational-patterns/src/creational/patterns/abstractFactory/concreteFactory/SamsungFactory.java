package creational.patterns.abstractFactory.concreteFactory;

import creational.patterns.abstractFactory.concreteClasses.SamsungMobilePhone;
import creational.patterns.abstractFactory.concreteClasses.SamsungSmartTv;
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
