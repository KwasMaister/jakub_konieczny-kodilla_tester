package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {
        Person andrzej = new Person("Andrzej ", 20, "Mechanik");
        andrzej.show();
        CarMechanick carMechanick = new CarMechanick(2000);
        System.out.println("Zarabia: " + carMechanick.getSalary());
        carMechanick.responsibilities();
        System.out.println(" ");

        Person mikolaj = new Person("Mikolaj ", 30, "Dziennikarz");
        mikolaj.show();
        Journalist journalist  = new Journalist(3000);
        System.out.println("Zarabia: " + journalist.getSalary());
        journalist.responsibilities();
        System.out.println(" ");

        Person basia = new Person("Basia ", 40, "Doktor");
        basia.show();
        Doctor doctor  = new Doctor(4000);
        System.out.println("Zarabia: " + doctor.getSalary());
        doctor.responsibilities();
        System.out.println(" ");

    }
}
