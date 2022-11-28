package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.interfaces.Shape;

public class CarRace {
    public static void main(String[] args) {
        Chevrolet chevrolet = new Chevrolet(50, 10, 25);
        doRace(chevrolet);

        Opel opel = new Opel(100, 20, 50);
        doRace(opel);

        SangYong sangYong = new SangYong(200, 80, 35);
        doRace(sangYong);

    }

    private static void doRace (Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();

        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println("Aktualna predkosc samochodu wynosi: " + car.getSpeed());
    }
}

