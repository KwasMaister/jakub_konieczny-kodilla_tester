package com.kodilla.abstracts.homework;

public class CarMechanick extends Job{


    @Override
    public String responsibilities() {
        return "Naprawiac samochody";
    }

    @Override
    public int salary(){
        return 1000;
    }
}
