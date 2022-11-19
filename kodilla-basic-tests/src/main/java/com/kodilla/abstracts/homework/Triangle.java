package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    public Triangle(double a, double b, double c, double h){
        super(a, b, c, h);
    }
    @Override
    public double obwod() {
        double obwod;
        obwod = getA() + getB() + getC();
        return obwod;
    }

    @Override
    public double polePowierzchni() {
        double polePowierzchni;
        polePowierzchni = (getA() * getH()) / 2;
        return polePowierzchni;
    }
}
