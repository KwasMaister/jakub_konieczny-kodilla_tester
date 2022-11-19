package com.kodilla.abstracts.homework;

public class CarMechanick extends Job{

    public CarMechanick (int salary){
        super(salary);
    }

    public void salary(){
        System.out.println("Zarabia: " + getSalary());
    }

    @Override
    public void responsibilities() {
        System.out.println("Obowiązek: Naprawiac samochody");
    }
}
