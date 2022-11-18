package com.kodilla.inheritance.homework;

public class Application {
    public static void main (String [] args){
        OperatingSystem operatingSystem = new OperatingSystem(1900);
        operatingSystem.turnOn();
        operatingSystem.turnOff();
        System.out.println(" ");

        OperatingSystemFirstInheritance operatingSystemFirstInheritance = new OperatingSystemFirstInheritance(1950);
        operatingSystemFirstInheritance.turnOn();
        operatingSystemFirstInheritance.turnOff();
        System.out.println(" ");

        OperatingSystemSecondInheritance operatingSystemSecondInheritance = new OperatingSystemSecondInheritance(2000);
        operatingSystemSecondInheritance.turnOn();
        operatingSystemSecondInheritance.turnOff();
        operatingSystemSecondInheritance.getYearOfProduction();
        System.out.println(" ");
    }
}
