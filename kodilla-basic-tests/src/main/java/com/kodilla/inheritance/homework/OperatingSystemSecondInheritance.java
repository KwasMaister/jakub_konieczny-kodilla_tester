package com.kodilla.inheritance.homework;

public class OperatingSystemSecondInheritance extends OperatingSystemFirstInheritance{
    public OperatingSystemSecondInheritance(int yearOfProduction) {
        super(yearOfProduction);
        System.out.println("OperatingSystemSecondInheritance --> construktor");
    }

    /*
    @Override
    public void turnOn() {
        System.out.println("Turn on: OperatingSystemSecondInheritance");
    }

    public void turnOff(){
        System.out.println("Turn off: OperatingSystemSecondInheritance");
    }

     */
}
