package com.kodilla.bank.homework;

public class Bank {
    private int numberOfMachines;
    private CashMachine [] machine;
    private int totalBalance = 0;
    private int totalSubtract = 0;
    private int totalSumBalanceAndSubtract = 0;
    private int numberOfOperationsOnlyCashOut = 0;
    private int numberOfOperationsOnlyDeposit = 0;

    private double averageBalance = 0;
    private double averageSubtract = 0;



    public Bank(){
        this.numberOfMachines = 0;
        this.machine = new CashMachine[0];
    }

    public void addMachine(CashMachine value){
        this.numberOfMachines++;
        CashMachine [] newTab = new CashMachine[this.numberOfMachines];
        System.arraycopy(machine, 0, newTab, 0, machine.length);
        newTab[this.numberOfMachines - 1] = value;
        this.machine = newTab;
    }

    public int getNumberOfMachines(){
        return numberOfMachines;
    }

    public int totalBalance(){
        int x = 0;
        for (CashMachine machine : this.machine) { // for each --> for(Typ_Obiektu nazwa_obiektu : nazwa_tablicy){ ... }
            this.totalBalance = machine.balance();
            x += machine.balance();
        }
        return x;
    }

    public int totalSubtract(){
        int x = 0;
        for (CashMachine machine : this.machine) {
            this.totalSubtract = machine.subtract();
            x += machine.subtract();
        }
        return x;

    }

    public int totalSumBalanceAndSubtract () {
        int x = 0;
        for (CashMachine machine : this.machine){
            this.totalSumBalanceAndSubtract = machine.sumBalanceAndSubtract();
            x += machine.sumBalanceAndSubtract();
        }
        return x;
    }

   public int numberOfOperationsOnlyCashOut (){
        int x = 0;
        for (CashMachine machine : this.machine){
            this.numberOfOperationsOnlyCashOut = machine.numberOfOperationsOnlyCashOut();
            x += machine.numberOfOperationsOnlyCashOut();
        }
        return x;
   }

   public int numberOfOperationsOnlyDeposit (){
        int x = 0;
        for (CashMachine machine : this.machine){
            this.numberOfOperationsOnlyDeposit = machine.numberOfOperationsOnlyDeposit();
            x += machine.numberOfOperationsOnlyDeposit();
        }
        return x;
   }

   public double averageBalance (){
        double x = 0;
        for (CashMachine machine : this.machine){
            this.averageBalance = machine.averageBalance();
            x += machine.averageBalance();
        }
        return x / this.machine.length;
   }

   public double averageSubtract (){
        double x = 0;
        for (CashMachine machine : this.machine){
            this.averageSubtract = machine.averageSubtract();
            x += machine.averageSubtract();
        }
        return x / this.machine.length;
   }



}
