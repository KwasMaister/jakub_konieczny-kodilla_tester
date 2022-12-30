package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    private GamblingMachine gamblingMachine = new GamblingMachine();


    @ParameterizedTest
    @CsvFileSource(resources = "/correctNumbers.csv")
    public void correctNumbers (String expected) throws InvalidNumbersException {
        String[] numbers = expected.split(","); // z csv pobieram do tablicy "numbers" - String oddzielone ","
        Set<String> setNumbers = new HashSet<>(Arrays.asList(numbers)); // przypisanie do SET'a zawartosci tablicy numbers (Arrays.asList)
        Set<Integer> correctNumbers = setNumbers
                .stream()
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        int result = gamblingMachine.howManyWins(correctNumbers);
        boolean correct = result >= 0 && result < 7;
        assertTrue(correct);
    }

    /*
    Inny sposób
     */
    @ParameterizedTest
    @CsvFileSource(resources = "/correctNumbers.csv")
    public void correctNumbersv2 (String expected) throws InvalidNumbersException {
        String[] numbers = expected.split(",");
        Set<Integer> numbersv2 = new HashSet<>();
        for (String number : numbers) {
            numbersv2.add(Integer.parseInt(number)); // parsuje lanczuch znakowy i zwracam liczbe calkowita typu integer
        }
        int result = gamblingMachine.howManyWins(numbersv2);
        boolean correct = result >= 0 && result < 7;
        assertTrue(correct);
    }

    @ParameterizedTest
    @CsvFileSource (resources = "/incorrectNumbers.csv")
    public void incorrectNumbers (String number) throws InvalidNumbersException {
        String[] numbers = number.split(","); // z csv pobieram do tablicy "numbers" - String oddzielone ","
        Set<String> setNumbers = new HashSet<>(Arrays.asList(numbers)); // przypisanie do SET'a zawartosci tablicy nuymbers (Arrays.asList)
        Set<Integer> collect = setNumbers // nowy Set, string zmienione na INT
                .stream()
                .map(Integer::parseInt).collect(Collectors.toSet());
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(collect));
    }

    @ParameterizedTest
    @ValueSource(ints = {5})
    public void notEnoughNumbersForExampleOnlyOne (int a) throws InvalidNumbersException {
        Set<Integer> numbers = new HashSet<>(a);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
    }

}
