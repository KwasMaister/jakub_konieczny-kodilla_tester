package com.kodilla.basic_assertion;

public class ResultChecker {

    /*
    Metoda ta jak poniżej przyjmuje dwa argumenty: wynik oczekiwany i wynik zwracany
    Przekazujemy jej te argumenty: oczekujemy, że wynikiem dodawania 5 i 8 będzie 13,
    i porównujemy to oczekiwanie z wartością zmiennej sumResult. Wynik sprawdzenia przypisujemy do zmiennej typu boolean o nazwie correct.
     */
    public static boolean assertEquals(int expected, int actual) {
        return expected == actual;
    }
}
