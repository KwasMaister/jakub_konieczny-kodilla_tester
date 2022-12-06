package com.kodilla.collections.adv.immutable;

public record BookRecord(String author, String title) {
    BookRecord bookRecord = new BookRecord("test", "testowa pozycja");
}
