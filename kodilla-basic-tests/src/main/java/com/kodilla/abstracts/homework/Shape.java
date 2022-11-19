package com.kodilla.abstracts.homework;

public abstract class Shape {
    static final double PI = 3.14;
    private double r;
    private double a;
    private double b;
    private double c;
    private double h;


    public Shape (double r){
        this.r = r;
    }

    public Shape (double a, double b){
        this.a = a;
        this.b = b;
    }

    public Shape (double a, double b, double c, double h){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getR(){
        return r;
    }

    public double getC(){
        return c;
    }

    public double getH(){
        return h;
    }

    public abstract double obwod();

    public abstract double polePowierzchni();
}
