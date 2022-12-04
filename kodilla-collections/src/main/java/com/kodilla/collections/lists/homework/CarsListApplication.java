package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Chevrolet;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.SangYong;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();  //przypisanie do zmiennej "cars" nowego obiektu klasy ArrayList

        SangYong sangYong = new SangYong(100, 20, 10);
        cars.add(sangYong);
        //cars.add(new SangYong(100,20,10));
        cars.add(new Opel(150, 30, 20));
        cars.add(new Chevrolet(200, 40, 30));
        cars.add(new Chevrolet(250, 40, 30));

        System.out.println("Size before remove: " + cars.size());
        for (Car car : cars){
            CarUtils.describeCar(car);
        }

        cars.remove(3);  // metoda usuniecia - remove(int index)

        cars.remove(sangYong);

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------");

        System.out.println("Size after remove: " + cars.size());
        for (Car car : cars){
            CarUtils.describeCar(car);
        }


    }
}
