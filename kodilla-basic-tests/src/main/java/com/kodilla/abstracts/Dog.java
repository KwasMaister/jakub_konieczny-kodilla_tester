/*
Podklasa musi wywołac konstruktor z nadklasy
 */

package com.kodilla.abstracts;

public class Dog extends Animal {

    public Dog(){
        super(4);
    }

    @Override
    public void giveVoice() {
        System.out.println("Hau Hau");
    }
}
