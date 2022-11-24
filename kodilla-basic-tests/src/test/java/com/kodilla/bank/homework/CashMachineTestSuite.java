package com.kodilla.bank.homework;

import com.kodilla.school.Grades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] values = cashMachine.getValues();
        assertEquals(0, values.length);
    }

    @Test
    public void addThreeTransactions(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.depositMoneyAndCashOut(100);
        cashMachine.depositMoneyAndCashOut(200);
        cashMachine.depositMoneyAndCashOut(500);

        int [] values = cashMachine.getValues();
        assertEquals(3, values.length); //element 0 / 1 / 2
        assertEquals(100, values[0]);
        assertEquals(200, values[1]);
        assertEquals(500, values[2]);
    }

    @Test
    public void cashOutTwoTransactions(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.depositMoneyAndCashOut(-100);
        cashMachine.depositMoneyAndCashOut(-333);

        int[] values = cashMachine.getValues();

        assertEquals(2, values.length);
        assertEquals(-100, values[0]);
        assertEquals(-333, values[1]);
    }

    @Test
    public void numberOfTransactionsDoingTwoTransactions(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.depositMoneyAndCashOut(444);
        cashMachine.depositMoneyAndCashOut(-222);

        int[] values = cashMachine.getValues(); // nie do konca jestem przekonany dlaczego to tutaj musi byc

        cashMachine.numberOfOperations();
        assertEquals(2, values.length);
    }

    @Test
    public void numberOfTransactionsNothing(){
        CashMachine cashMachine = new CashMachine();

        int[] values = cashMachine.getValues(); // nie do konca jestem przekonany dlaczego to tutaj musi byc

        cashMachine.numberOfOperations();
        assertEquals(0, values.length);
    }

    @Test
    public void balanceAccountOnlyDepositMoney(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.depositMoneyAndCashOut(100);
        cashMachine.depositMoneyAndCashOut(200);
        cashMachine.depositMoneyAndCashOut(500);

        cashMachine.balance();

        assertEquals(800, cashMachine.balance());
    }

    @Test
    public void balanceAccountOnlyCashOutMoney(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.depositMoneyAndCashOut(-200);
        cashMachine.depositMoneyAndCashOut(-400);
        cashMachine.depositMoneyAndCashOut(-600);

        cashMachine.balance();

        assertEquals(-1200, cashMachine.balance());
    }

    @Test
    public void balanceAccountDepositMoneyAndCashOutMoney(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.depositMoneyAndCashOut(-200);
        cashMachine.depositMoneyAndCashOut(1000);
        cashMachine.depositMoneyAndCashOut(20);

        cashMachine.balance();

        assertEquals(820, cashMachine.balance());
    }

}
