package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Chevrolet;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.SangYong;

public class CarUtils {
    public static void describeCar (Car car){

            System.out.println("-----------------------------");
            System.out.println("Marka samochodu: " + getNameCar(car));
            System.out.println("Samochod porusza sie z predkoscia: " + car.getSpeed());

    }
    public static void doIncrease(Car car){
        car.increaseSpeed();
    }
    public static void doDecrease(Car car){
        car.decreaseSpeed();
    }

    private static String getNameCar (Car car){
        if (car instanceof Chevrolet)
            return "chevrolet";
        if (car instanceof Opel)
            return "opel";
        if (car instanceof SangYong)
            return "sangyong";
        else
            return "brak samochodu";
    }

}
