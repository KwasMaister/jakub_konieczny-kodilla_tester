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
        for (CashMachine machine : this.machine) { // for each --> for(Typ_Obiektu nazwa_obiektu : nazwa_tablicy){ ... }
            this.totalBalance = machine.balance();
        }
        return totalBalance;
    }

    public int totalSubtract(){
        for (CashMachine machine : this.machine) {
            this.totalSubtract = machine.subtract();
        }
        return totalSubtract;

    }

    public int totalSumBalanceAndSubtract () {
        for (CashMachine machine : this.machine){
            this.totalSumBalanceAndSubtract = machine.sumBalanceAndSubtract();
        }
        return this.totalSumBalanceAndSubtract;
    }

   public int numberOfOperationsOnlyCashOut (){
        for (CashMachine machine : this.machine){
            this.numberOfOperationsOnlyCashOut = machine.numberOfOperationsOnlyCashOut();
        }
        return this.numberOfOperationsOnlyCashOut;
   }

   public int numberOfOperationsOnlyDeposit (){
        for (CashMachine machine : this.machine){
            this.numberOfOperationsOnlyDeposit = machine.numberOfOperationsOnlyDeposit();
        }
        return this.numberOfOperationsOnlyDeposit;
   }

   public double averageBalance (){
        for (CashMachine machine : this.machine){
            this.averageBalance = machine.averageBalance();
        }
        return averageBalance;
   }

   public double averageSubtract (){
        for (CashMachine machine : this.machine){
            this.averageSubtract = machine.averageSubtract();
        }
        return averageSubtract;
   }



}
