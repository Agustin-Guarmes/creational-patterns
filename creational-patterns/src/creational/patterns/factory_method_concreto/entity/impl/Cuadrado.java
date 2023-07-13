package creational.patterns.factory_method_concreto.entity.impl;

import creational.patterns.factory_method_concreto.entity.Figura;

public class Cuadrado implements Figura {

    private double lado;

    public Cuadrado() {
        lado = 4;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularSuperficie() {
        return lado * lado;
    }
}
