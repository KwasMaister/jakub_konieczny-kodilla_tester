/*
Podklasa musi wywołac konstruktor z nadklasy
 */

package com.kodilla.abstracts;

public class Duck extends Animal {

    public Duck () {
        super (2);
    }

    public void giveVoice(){
        System.out.println("Quack");
    }
}
