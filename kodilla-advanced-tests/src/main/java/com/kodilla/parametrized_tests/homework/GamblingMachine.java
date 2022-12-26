package com.kodilla.parametrized_tests.homework;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GamblingMachine {

    public int howManyWins(Set<Integer> userNumbers) throws InvalidNumbersException {
        validateNumbers(userNumbers);
        Set<Integer> computerNumbers = generateComputerNumbers();
        int count = 0;
        for (Integer number : userNumbers) {
            if (computerNumbers.contains(number)) {
                count++;
            }
        }
        return count;
    }

    /*
    Jesli conajmniej jedna z metod boolean bedzie true to wtedy rzuci wyjatkiem
     */
    private void validateNumbers(Set<Integer> numbers) throws InvalidNumbersException {
        if (isNotCorrectSize(numbers) || isAnyNumberOutOfDeclaredScope(numbers)) {
            throw new InvalidNumbersException();
        }
    }

    /*
    Jesli jakakolwiek cyfra bedzie pasowac do tego zakresu (number < 1 || number > 49) zwroci true
    i metoda sie wykonana
     */
    private boolean isAnyNumberOutOfDeclaredScope(Set<Integer> numbers) {
        return numbers.stream()
                .anyMatch(number -> number < 1 || number > 49);
    }

    /*
    rozmiar SET różny od 6 to wtedy true i metoda sie wykona
     */
    private boolean isNotCorrectSize(Set<Integer> numbers) {
        return numbers.size() != 6;
    }

    /*
    Generuje liczby z zakresu 1 do 49
    Generuje dopoki jest ich mniej niz 6
    Sa one w setach wiec liczby się nie powtarzają
     */
    private Set<Integer> generateComputerNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Random generator = new Random();
        while(numbers.size() < 6) {
            numbers.add(generator.nextInt(49) + 1);
        }
        return numbers;
    }
}