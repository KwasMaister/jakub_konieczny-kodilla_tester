package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private int speed;
    private int increaseSpeed;
    private int decreaseSpeed;

    public Opel (int speed, int increaseSpeed, int decreaseSpeed){
        this.speed = speed;
        this.increaseSpeed = increaseSpeed;
        this.decreaseSpeed = decreaseSpeed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + increaseSpeed;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - decreaseSpeed;
    }
}
