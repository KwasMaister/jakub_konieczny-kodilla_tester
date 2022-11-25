package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;
    Job job; //zmienna typu Job. Majac zmienna tego typu mozna na niej wywolywac metody

    public Person (String firstName, int age, Job job){ //kompozycja (przekazanie obiektu typu Job) String to tez obiekt.
        this.job = job;
        this.firstName = firstName;
        this.age = age;
    }

    public void responsibilities (){
        System.out.println(firstName + " ma obowiazek: " + this.job.responsibilities());
    }
    public void salary (){
        System.out.println("Zarabia: " + this.job.salary());
    }
    public void show () {
        System.out.println("Imie: " + firstName + ", Wiek: " + age);
    }


}
