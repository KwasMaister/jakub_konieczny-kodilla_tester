package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String firstName;
    private String surname;

    public Principal(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(firstName, principal.firstName) && Objects.equals(surname, principal.surname);
    }


    @Override
    public int hashCode() {
        return Objects.hash(firstName, surname);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
