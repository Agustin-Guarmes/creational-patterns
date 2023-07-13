package creational.patterns.factory_method_concreto.entity.impl;

import creational.patterns.factory_method_concreto.entity.Figura;

public class Circulo implements Figura {

    private double radio;

    public Circulo() {
        radio = 4;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularSuperficie() {
        return Math.PI * (Math.pow(radio, 2));
    }
}
