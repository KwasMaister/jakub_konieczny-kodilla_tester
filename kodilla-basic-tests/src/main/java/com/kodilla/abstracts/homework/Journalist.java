package com.kodilla.abstracts.homework;

public class Journalist extends Job{
    @Override
    public String responsibilities() {
        return "Przeprowadzac wywiady";
    }

    @Override
    public int salary(){
        return 2000;
    }
}
