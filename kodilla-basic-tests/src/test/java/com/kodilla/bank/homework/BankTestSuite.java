package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        Bank bank = new Bank();
        bank.getNumberOfMachines();
        assertEquals(0, bank.getNumberOfMachines());
    }

    @Test
    public void addTwoBanks(){
        Bank bank = new Bank();
        CashMachine cashMachineOne = new CashMachine();
        CashMachine cashMachineTwo = new CashMachine();
        bank.addMachine(cashMachineOne);
        bank.addMachine(cashMachineTwo);

        assertEquals(2, bank.getNumberOfMachines());

    }
/*
    @Test
    public void testyTransakcji(){
        Bank bank = new Bank();
        CashMachine cashMachineOne = new CashMachine();
        CashMachine cashMachineTwo = new CashMachine();
        bank.addMachine(cashMachineOne);
        bank.addMachine(cashMachineTwo);

    }

 */

    @Test
    public void sumaDokonanychWplatDwochBankomatow(){
       // int sumCashMachineOne;
      //  int sumCashMachineTwo;
       // int sum;
        Bank bank = new Bank();
        CashMachine cashMachineOne = new CashMachine();
        CashMachine cashMachineTwo = new CashMachine();

        bank.addMachine(cashMachineOne);
        cashMachineOne.depositMoneyAndCashOut(200);
        cashMachineOne.depositMoneyAndCashOut(400);
        cashMachineOne.depositMoneyAndCashOut(-1400);
       // sumCashMachineOne = bank.totalBalance();

        bank.addMachine(cashMachineTwo);
        cashMachineTwo.depositMoneyAndCashOut(1000);
        cashMachineTwo.depositMoneyAndCashOut(4000);
        cashMachineTwo.depositMoneyAndCashOut(-40200);
       // sumCashMachineTwo = bank.totalBalance();

        // sum = sumCashMachineOne + sumCashMachineTwo;


        assertEquals(5600, bank.totalBalance());
    }
    @Test
    public void sumaDokonanychWyplatDwochBankomatow(){
       // int sumCashMachineOne;
       // int sumCashMachineTwo;
       // int sum;
        Bank bank = new Bank();
        CashMachine cashMachineOne = new CashMachine();
        CashMachine cashMachineTwo = new CashMachine();

        bank.addMachine(cashMachineOne);
        cashMachineOne.depositMoneyAndCashOut(200);
        cashMachineOne.depositMoneyAndCashOut(400);
        cashMachineOne.depositMoneyAndCashOut(-1400);
        cashMachineOne.depositMoneyAndCashOut(-2400);
       // sumCashMachineOne = bank.totalSubtract();

        bank.addMachine(cashMachineTwo);
        cashMachineTwo.depositMoneyAndCashOut(1000);
        cashMachineTwo.depositMoneyAndCashOut(4000);
        cashMachineTwo.depositMoneyAndCashOut(-40200);
       // sumCashMachineTwo = bank.totalSubtract();

       // sum = sumCashMachineOne + sumCashMachineTwo;


        assertEquals(-44000, bank.totalSubtract());
    }

    @Test
    public void calkowityBilansZeWszystkichBankomatow(){
        Bank bank = new Bank();
       // int sumCashMachineOne;
       // int sumCashMachineTwo;
       // int sum;
        CashMachine cashMachineOne = new CashMachine();
        CashMachine cashMachineTwo = new CashMachine();

        bank.addMachine(cashMachineOne);
        cashMachineOne.depositMoneyAndCashOut(-1000);
        cashMachineOne.depositMoneyAndCashOut(333);
        //sumCashMachineOne = bank.totalSumBalanceAndSubtract();

        bank.addMachine(cashMachineTwo);
        cashMachineTwo.depositMoneyAndCashOut(-5);
        cashMachineTwo.depositMoneyAndCashOut(500);
       // sumCashMachineTwo = bank.totalSumBalanceAndSubtract();

        //sum = sumCashMachineOne + sumCashMachineTwo;
        assertEquals(-172, bank.totalSumBalanceAndSubtract());
    }

    @Test
    public void liczbaTransakcjiZwiazanychZWyplata(){
        Bank bank = new Bank();
       // int sumCashMachineOne;
        //int sumCashMachineTwo;
        //int sum;
        CashMachine cashMachineOne = new CashMachine();
        CashMachine cashMachineTwo = new CashMachine();

        bank.addMachine(cashMachineOne);
        cashMachineOne.depositMoneyAndCashOut(-1000);
        cashMachineOne.depositMoneyAndCashOut(-2000);
        cashMachineOne.depositMoneyAndCashOut(6000);
        //sumCashMachineOne = bank.numberOfOperationsOnlyCashOut();

        bank.addMachine(cashMachineTwo);
        cashMachineTwo.depositMoneyAndCashOut(-5);
        cashMachineTwo.depositMoneyAndCashOut(1500);
        cashMachineTwo.depositMoneyAndCashOut(500);
        //sumCashMachineTwo = bank.numberOfOperationsOnlyCashOut();
       // sum = sumCashMachineOne + sumCashMachineTwo;

        assertEquals(3, bank.numberOfOperationsOnlyCashOut());
    }

    @Test
    public void liczbaTranskacjiZwiazanychzWplata(){
        Bank bank = new Bank();
       // int sumCashMachineOne;
        //int sumCashMachineTwo;
       // int sum;
        CashMachine cashMachineOne = new CashMachine();
        CashMachine cashMachineTwo = new CashMachine();

        bank.addMachine(cashMachineOne);
        cashMachineOne.depositMoneyAndCashOut(1000);
        cashMachineOne.depositMoneyAndCashOut(2000);
        cashMachineOne.depositMoneyAndCashOut(-2000);
       // sumCashMachineOne = bank.numberOfOperationsOnlyDeposit();

        bank.addMachine(cashMachineTwo);
        cashMachineTwo.depositMoneyAndCashOut(-5);
        cashMachineTwo.depositMoneyAndCashOut(500);
        cashMachineTwo.depositMoneyAndCashOut(500);
        //sumCashMachineTwo = bank.numberOfOperationsOnlyDeposit();

       // sum = sumCashMachineOne + sumCashMachineTwo;
        assertEquals(4, bank.numberOfOperationsOnlyDeposit());

    }
    @Test
    public void sredniaWartoscWyplaty(){
        Bank bank = new Bank();
        //double averageCashMachineOne;
       // double averageCashMachinetwo;
        //double average;
        CashMachine cashMachineOne = new CashMachine();
        CashMachine cashMachineTwo = new CashMachine();

        bank.addMachine(cashMachineOne);
        cashMachineOne.depositMoneyAndCashOut(1000);
        cashMachineOne.depositMoneyAndCashOut(-2000);
        cashMachineOne.depositMoneyAndCashOut(2000);
        cashMachineOne.depositMoneyAndCashOut(-163);
        //averageCashMachineOne = bank.totalSubtract();

        bank.addMachine(cashMachineTwo);
        cashMachineTwo.depositMoneyAndCashOut(-5);
        cashMachineTwo.depositMoneyAndCashOut(1500);
        cashMachineTwo.depositMoneyAndCashOut(500);
        cashMachineTwo.depositMoneyAndCashOut(-598);
       // averageCashMachinetwo = bank.totalSubtract();

       // average = (averageCashMachineOne + averageCashMachinetwo) / 4;
        assertEquals(-691.5, bank.averageSubtract(), 0.01);
    }

    @Test
    public void sredniaWartoscWplaty(){
        Bank bank = new Bank();
        //double averageCashMachineOne;
        //double averageCashMachinetwo;
        //double average;
        CashMachine cashMachineOne = new CashMachine();
        CashMachine cashMachineTwo = new CashMachine();

        bank.addMachine(cashMachineOne);
        cashMachineOne.depositMoneyAndCashOut(1000);
        cashMachineOne.depositMoneyAndCashOut(2000);
        cashMachineOne.depositMoneyAndCashOut(-333);
        //averageCashMachineOne = bank.totalBalance();

        bank.addMachine(cashMachineTwo);
        cashMachineTwo.depositMoneyAndCashOut(-5);
        cashMachineTwo.depositMoneyAndCashOut(500);
        cashMachineTwo.depositMoneyAndCashOut(20);
        //averageCashMachinetwo = bank.totalBalance();

        //average = (averageCashMachineOne + averageCashMachinetwo) / 4;
        assertEquals(880, bank.averageBalance(), 0.01);
    }
}
