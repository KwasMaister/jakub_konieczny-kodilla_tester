package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {


    public Rectangle(double a, double b){
        super(a, b);
    }
    @Override
    public double obwod() {
        double obwod;
        obwod = 2 * getA() + 2 * getB();
        return obwod;
    }

    @Override
    public double polePowierzchni() {
        double polePowierzchni;
        polePowierzchni = getA() * getB();
        return polePowierzchni;
    }


}
