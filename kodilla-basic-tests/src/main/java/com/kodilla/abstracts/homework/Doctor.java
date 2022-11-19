package com.kodilla.abstracts.homework;

public class Doctor extends Job{
    public Doctor (int salary){
        super(salary);
    }

    @Override
    public void responsibilities() {
        System.out.println("Obowiązek: Leczyc ludzi");
    }

    @Override
    public void salary() {
        System.out.println("Zarabia: " + getSalary());
    }
}
