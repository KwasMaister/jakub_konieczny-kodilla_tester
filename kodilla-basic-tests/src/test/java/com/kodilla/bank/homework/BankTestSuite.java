package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        Bank bank = new Bank();
        int[] values = bank.getNumberOfMachines();
        assertEquals(0, values.length);
    }

    @Test
    public void addTwoBanks(){
        Bank bank = new Bank();
        bank.addMachine(1);
        bank.addMachine(2);

        int [] values = bank.getNumberOfMachines();
        assertEquals(2, values.length); //element 0 / 1 / 2
        assertEquals(1, values[0]);
        assertEquals(2, values[1]);

    }
}
