package com.kodilla.bank.homework;

public class Bank {
    private String name;
    private int numberOfMachines;
    private int [] machine;

    private CashMachine firstCashMachine;

    private CashMachine secondCashMachine;

    public Bank(){
        this.numberOfMachines = 0;
        this.machine = new int[0];
    }

    public void addMachine(int value){
        this.numberOfMachines++;
        int [] newTab = new int [this.numberOfMachines];
        System.arraycopy(machine, 0, newTab, 0, machine.length);
        newTab[this.numberOfMachines - 1] = value;
        this.machine = newTab;
    }

    public int [] getNumberOfMachines(){
        return machine;
    }


}
