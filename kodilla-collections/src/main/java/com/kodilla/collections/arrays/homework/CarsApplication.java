package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Chevrolet;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.SangYong;

import java.util.Random;



public class CarsApplication {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Random random = new Random();
        Car [] cars  = new Car[RANDOM.nextInt(15) + 1];  //deklaracja tablicy - początek Car (czemu Car) musimy wskazac nasza klase interface w tym przypadku ?

        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        /*
         do zapisywania elementow w tablicy trzeba skorzystac z petfli for ?
         Petfla "for each" w tym wypadku nie zadziala ? Ona tylko do tego jak chcemy pobrac elementy z tablicy dziala tak ?
         */

        for (Car car : cars) { // wykonaj operacje dla kazdego elementu tablicy cars
            CarUtils.doIncrease(car);
            CarUtils.doDecrease(car);
            CarUtils.describeCar(car);
        }

    }
    public static Car drawCar(){
        int drawCar = RANDOM.nextInt(3);
        // int drawIncreaseSpeed = RANDOM.nextInt(maxValue+1 - minValue) + minValue;
        int drawIncreaseSpeed = getRandomIncreaseSpeed();

        if (drawCar == 0)
            return new Chevrolet(100, drawIncreaseSpeed, 10);
        else if (drawCar == 1)
            return new Opel(150, drawIncreaseSpeed, 20);
        else
        return new SangYong(200, drawIncreaseSpeed, 30);

    }


    private static int getRandomIncreaseSpeed(){
        return RANDOM.nextInt(150+1 - 50) + 50;
    }

    /*

    Przeniesione do klasy CarUtils

    public static void doIncrease(Car car){
        car.increaseSpeed();
    }
    public static void doDecrease(Car car){
        car.decreaseSpeed();
    }

     */
}
