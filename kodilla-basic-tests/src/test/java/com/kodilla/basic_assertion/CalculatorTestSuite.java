package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTestSuite {

    @Test
    public void testDzielenia(){
        Calculator calculatorDzielenie = new Calculator();
        int a = 10;
        int b = 5;
        int dzielenieSuma = calculatorDzielenie.dzielenie(a, b);
        assertEquals(2, dzielenieSuma);
    }
    @Test
    public void testSum() {
        Calculator calculatorSum = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculatorSum.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculatorSubtract = new Calculator();
        int a = 100;
        int b = 30;
        int subtractResult = calculatorSubtract.subtract(a, b);
        assertEquals(70, subtractResult);
    }

    @Test
    public void testPotegowaniaLiczbyDodatniej(){
        Calculator calculatorPotegowanie = new Calculator();
        double a = 5;
        double b = 2;
        double potegowanieRezultat = calculatorPotegowanie.potega(a, b);
        assertEquals(25, potegowanieRezultat, 0.2);
    }
    @Test
    public void testPotegowaniaLiczbyMniejszejOdZera(){
        Calculator calculatorPotegowanie = new Calculator();
        double a = -1;
        double b = 2;
        double potegowanieRezultat = calculatorPotegowanie.potega(a, b);
        assertEquals(1, potegowanieRezultat, 0.2);
    }
    @Test
    public void testPotegowaniaLiczbyRownejZero(){
        Calculator calculatorPotegowanie = new Calculator();
        double a = 0;
        double b = 2;
        double potegowanieRezultat = calculatorPotegowanie.potega(a, b);
        assertEquals(0, potegowanieRezultat, 0.2);
    }


}