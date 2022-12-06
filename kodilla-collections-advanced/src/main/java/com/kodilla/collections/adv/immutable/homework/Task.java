package com.kodilla.collections.adv.immutable.homework;

public record Task(String title, int duration) {
    //Task task2 = new Task("aaa", 30);
    // jakbym odkomentowal 4 linie to blad - "Instance field is not allowed in record"
    // czyli chyba prawidłowo ustalona niemutowalnosc klasy ?
}
