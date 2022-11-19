package com.kodilla.abstracts.homework;

public abstract class Job {
    private int salary;
    //private String responsibilities;

    public Job (int salary){
        this.salary = salary;
        //this.responsibilities = responsibilities;
    }

    public int getSalary() {
        return salary;
    }
/*
    public void getResponsibilities() {
        System.out.println("Obowiazki: ");
    }

 */

    public abstract void salary();

    public abstract void responsibilities();
}
