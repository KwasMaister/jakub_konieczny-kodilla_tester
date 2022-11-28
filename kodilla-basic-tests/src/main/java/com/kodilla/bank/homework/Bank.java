package com.kodilla.bank.homework;

public class Bank {
    private int numberOfMachines;
    private CashMachine [] machine;

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
            x += machine.balance();
        }
        return x;
    }

    public int totalSubtract(){
        int x = 0;
        for (CashMachine machine : this.machine) {
            x += machine.subtract();
        }
        return x;

    }

    public int totalSumBalanceAndSubtract () {
        int x = 0;
        for (CashMachine machine : this.machine){
            x += machine.sumBalanceAndSubtract();
        }
        return x;
    }

   public int numberOfOperationsOnlyCashOut (){
        int x = 0;
        for (CashMachine machine : this.machine){
            x += machine.numberOfOperationsOnlyCashOut();
        }
        return x;
   }

   public int numberOfOperationsOnlyDeposit (){
        int x = 0;
        for (CashMachine machine : this.machine){
            x += machine.numberOfOperationsOnlyDeposit();
        }
        return x;
   }

   public double averageBalance (){
        double x = 0;
        for (CashMachine machine : this.machine){
            x += machine.balance();
        }

       return x / numberOfOperationsOnlyDeposit();
   }

   public double averageSubtract (){
        double x = 0;
        for (CashMachine machine : this.machine){
            x += machine.subtract();
        }
        return x / numberOfOperationsOnlyCashOut();
   }



}
