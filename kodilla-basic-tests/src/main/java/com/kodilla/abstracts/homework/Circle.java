package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    public Circle(double r){
        super(r);
    }
    @Override
    public double obwod() {
        double obwod;
        obwod = 2 * Shape.PI * getR();
        return obwod;
    }

    @Override
    public double polePowierzchni() {
        double polePowierzchni;
        polePowierzchni = Shape.PI * (getR() * getR());
        return polePowierzchni;
    }
}
