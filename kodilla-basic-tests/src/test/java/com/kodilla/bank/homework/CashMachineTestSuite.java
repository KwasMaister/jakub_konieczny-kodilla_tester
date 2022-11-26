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
    public void dokonanieTrzechWplat(){
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
    public void dokonanieDwochwyplat(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.depositMoneyAndCashOut(-100);
        cashMachine.depositMoneyAndCashOut(-333);

        int[] values = cashMachine.getValues();

        assertEquals(2, values.length);
        assertEquals(-100, values[0]);
        assertEquals(-333, values[1]);
    }

    @Test
    public void sumaTrzechWplat(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.depositMoneyAndCashOut(100);
        cashMachine.depositMoneyAndCashOut(200);
        cashMachine.depositMoneyAndCashOut(500);
        cashMachine.depositMoneyAndCashOut(-666);

       // cashMachine.balance();

        assertEquals(800, cashMachine.balance());
    }

    @Test
    public void sredniaWartoscWplat(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.depositMoneyAndCashOut(100);
        cashMachine.depositMoneyAndCashOut(200);
        cashMachine.depositMoneyAndCashOut(500);
        cashMachine.depositMoneyAndCashOut(-5321300);

        //cashMachine.averageBalance();

        assertEquals(266.6, cashMachine.averageBalance(), 0.1);
    }

    @Test
    public void sredniaWartoscWyplat(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.depositMoneyAndCashOut(-55);
        cashMachine.depositMoneyAndCashOut(-139);
        cashMachine.depositMoneyAndCashOut(-200);
        cashMachine.depositMoneyAndCashOut(199900);

       // cashMachine.averageSubtract();

        assertEquals(-131.3, cashMachine.averageSubtract(), 0.1);
    }
    @Test
    public void sumaDwochWyplat(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.depositMoneyAndCashOut(-200);
        cashMachine.depositMoneyAndCashOut(-400);
        cashMachine.depositMoneyAndCashOut(600);

       // cashMachine.subtract();

        assertEquals(-600, cashMachine.subtract());
    }

    @Test
    public void sumaDwochWplatIDwochWyplat(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.depositMoneyAndCashOut(100);
        cashMachine.depositMoneyAndCashOut(555);
        cashMachine.depositMoneyAndCashOut(-333);
        cashMachine.depositMoneyAndCashOut(-10);

        //cashMachine.sumBalanceAndSubtract();

        assertEquals(312, cashMachine.sumBalanceAndSubtract());
    }

    @Test
    public void zeroWplatOrazWyplat(){
        CashMachine cashMachine = new CashMachine();

        //cashMachine.numberOfOperations();

        assertEquals(0, cashMachine.numberOfOperations());
    }
    @Test
    public void LiczbaTransakcjiJednaWplata(){
        CashMachine cashMachine = new CashMachine();

        cashMachine.depositMoneyAndCashOut(1000);

        assertEquals(1,cashMachine.numberOfOperations());
    }

    @Test
    public void LiczbaTransakcjiJednaWyplata(){
        CashMachine cashMachine = new CashMachine();

        cashMachine.depositMoneyAndCashOut(-100);

        assertEquals(1,cashMachine.numberOfOperations());
    }
    @Test
    public void LiczbaTransakcjiJednaWplataJednaWyplata(){
        CashMachine cashMachine = new CashMachine();

        cashMachine.depositMoneyAndCashOut(1000);
        cashMachine.depositMoneyAndCashOut(-500);

        assertEquals(2,cashMachine.numberOfOperations());
    }

    @Test
    public void LiczbaTransakcjiPiecWplatTrzyWyplat(){
        CashMachine cashMachine = new CashMachine();

        cashMachine.depositMoneyAndCashOut(1000);
        cashMachine.depositMoneyAndCashOut(1000);
        cashMachine.depositMoneyAndCashOut(1000);
        cashMachine.depositMoneyAndCashOut(1000);
        cashMachine.depositMoneyAndCashOut(1000);
        cashMachine.depositMoneyAndCashOut(-500);
        cashMachine.depositMoneyAndCashOut(-500);
        cashMachine.depositMoneyAndCashOut(-500);

        assertEquals(8,cashMachine.numberOfOperations());
    }

    @Test
    public void liczbaTransakcjiZwiazanychZWplata(){
        CashMachine cashMachine = new CashMachine();

        cashMachine.depositMoneyAndCashOut(500);
        cashMachine.depositMoneyAndCashOut(1500);
        cashMachine.depositMoneyAndCashOut(-1500);

        assertEquals(2, cashMachine.numberOfOperationsOnlyDeposit());
    }

    @Test
    public void liczbaTransakcjiZwiazanychZWyplata(){
        CashMachine cashMachine = new CashMachine();

        cashMachine.depositMoneyAndCashOut(-1000);
        cashMachine.depositMoneyAndCashOut(10);
        cashMachine.depositMoneyAndCashOut(-300);

        assertEquals(2, cashMachine.numberOfOperationsOnlyCashOut());
    }

}
