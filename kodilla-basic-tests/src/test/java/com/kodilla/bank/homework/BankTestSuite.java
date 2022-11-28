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

    @Test
    public void sumaDokonanychWplatDwochBankomatow(){

        Bank bank = new Bank();
        CashMachine cashMachineOne = new CashMachine();
        CashMachine cashMachineTwo = new CashMachine();

        bank.addMachine(cashMachineOne);
        cashMachineOne.depositMoneyAndCashOut(200);
        cashMachineOne.depositMoneyAndCashOut(400);
        cashMachineOne.depositMoneyAndCashOut(-1400);

        bank.addMachine(cashMachineTwo);
        cashMachineTwo.depositMoneyAndCashOut(1000);
        cashMachineTwo.depositMoneyAndCashOut(4000);
        cashMachineTwo.depositMoneyAndCashOut(-40200);

        assertEquals(5600, bank.totalBalance());
    }
    @Test
    public void sumaDokonanychWyplatDwochBankomatow(){

        Bank bank = new Bank();
        CashMachine cashMachineOne = new CashMachine();
        CashMachine cashMachineTwo = new CashMachine();

        bank.addMachine(cashMachineOne);
        cashMachineOne.depositMoneyAndCashOut(200);
        cashMachineOne.depositMoneyAndCashOut(400);
        cashMachineOne.depositMoneyAndCashOut(-1400);
        cashMachineOne.depositMoneyAndCashOut(-2400);

        bank.addMachine(cashMachineTwo);
        cashMachineTwo.depositMoneyAndCashOut(1000);
        cashMachineTwo.depositMoneyAndCashOut(4000);
        cashMachineTwo.depositMoneyAndCashOut(-40200);

        assertEquals(-44000, bank.totalSubtract());
    }

    @Test
    public void calkowityBilansZeWszystkichBankomatow(){
        Bank bank = new Bank();

        CashMachine cashMachineOne = new CashMachine();
        CashMachine cashMachineTwo = new CashMachine();

        bank.addMachine(cashMachineOne);
        cashMachineOne.depositMoneyAndCashOut(-1000);
        cashMachineOne.depositMoneyAndCashOut(333);

        bank.addMachine(cashMachineTwo);
        cashMachineTwo.depositMoneyAndCashOut(-5);
        cashMachineTwo.depositMoneyAndCashOut(500);

        assertEquals(-172, bank.totalSumBalanceAndSubtract());
    }

    @Test
    public void liczbaTransakcjiZwiazanychZWyplata(){
        Bank bank = new Bank();

        CashMachine cashMachineOne = new CashMachine();
        CashMachine cashMachineTwo = new CashMachine();

        bank.addMachine(cashMachineOne);
        cashMachineOne.depositMoneyAndCashOut(-1000);
        cashMachineOne.depositMoneyAndCashOut(-2000);
        cashMachineOne.depositMoneyAndCashOut(6000);

        bank.addMachine(cashMachineTwo);
        cashMachineTwo.depositMoneyAndCashOut(-5);
        cashMachineTwo.depositMoneyAndCashOut(1500);
        cashMachineTwo.depositMoneyAndCashOut(500);

        assertEquals(3, bank.numberOfOperationsOnlyCashOut());
    }

    @Test
    public void liczbaTranskacjiZwiazanychzWplata(){
        Bank bank = new Bank();

        CashMachine cashMachineOne = new CashMachine();
        CashMachine cashMachineTwo = new CashMachine();

        bank.addMachine(cashMachineOne);
        cashMachineOne.depositMoneyAndCashOut(1000);
        cashMachineOne.depositMoneyAndCashOut(2000);
        cashMachineOne.depositMoneyAndCashOut(-2000);
        cashMachineOne.depositMoneyAndCashOut(2000);

        bank.addMachine(cashMachineTwo);
        cashMachineTwo.depositMoneyAndCashOut(-5);
        cashMachineTwo.depositMoneyAndCashOut(500);
        cashMachineTwo.depositMoneyAndCashOut(500);

        assertEquals(5, bank.numberOfOperationsOnlyDeposit());

    }
    @Test
    public void sredniaWartoscWyplaty(){
        Bank bank = new Bank();

        CashMachine cashMachineOne = new CashMachine();
        CashMachine cashMachineTwo = new CashMachine();

        bank.addMachine(cashMachineOne);
        cashMachineOne.depositMoneyAndCashOut(1000);
        cashMachineOne.depositMoneyAndCashOut(-2000);
        cashMachineOne.depositMoneyAndCashOut(2000);
        cashMachineOne.depositMoneyAndCashOut(-163);

        bank.addMachine(cashMachineTwo);
        cashMachineTwo.depositMoneyAndCashOut(-5);
        cashMachineTwo.depositMoneyAndCashOut(1500);
        cashMachineTwo.depositMoneyAndCashOut(500);
        cashMachineTwo.depositMoneyAndCashOut(-598);
        cashMachineTwo.depositMoneyAndCashOut(-333);

        assertEquals(-619.8, bank.averageSubtract(), 0.01);
    }

    @Test
    public void sredniaWartoscWplaty(){
        Bank bank = new Bank();

        CashMachine cashMachineOne = new CashMachine();
        CashMachine cashMachineTwo = new CashMachine();

        bank.addMachine(cashMachineOne);
        cashMachineOne.depositMoneyAndCashOut(1000);
        cashMachineOne.depositMoneyAndCashOut(2000);
        cashMachineOne.depositMoneyAndCashOut(-333);
        cashMachineOne.depositMoneyAndCashOut(444);

        bank.addMachine(cashMachineTwo);
        cashMachineTwo.depositMoneyAndCashOut(-5);
        cashMachineTwo.depositMoneyAndCashOut(500);
        cashMachineTwo.depositMoneyAndCashOut(20);

        assertEquals(792.8, bank.averageBalance(), 0.01);
    }
}
