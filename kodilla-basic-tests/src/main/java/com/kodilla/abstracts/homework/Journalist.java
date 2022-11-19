package com.kodilla.abstracts.homework;

public class Journalist extends Job{
    public Journalist (int salary){
        super(salary);
    }

    @Override
    public void salary() {
        System.out.println("Zarabia: " + getSalary());
    }

    @Override
    public void responsibilities() {
        System.out.println("Obowiązek: Przeprowadzac wywiady");
    }
}
