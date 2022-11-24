package com.kodilla.bank.homework;

public class CashMachine {
    private int [] values;
    private int size;

    private int amountOfMoney;

    public CashMachine(){             // w tym miejscu definiuje ten pierwszy pusty konstruktor tak ?
        this.size = 0;
        this.values = new int[0];
    }

    public void depositMoneyAndCashOut(int value){
        this.size++;
        int [] newTab = new int [this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value; // dlaczego -1 ?
        this.values = newTab;
    }
    public int [] getValues(){
        return values;
    }

    public int numberOfOperations() {
        int sum = 0;
        if (this.values.length == 0) {
            return 0;
        }

        for (int i = 0; i < this.values.length; i++){
            sum = sum + i;
        }
        return sum;
    }

    public int balance(){
        int sumBalance = 0;
        int subtractionBalance = 0;
        int balance = 0;
        //this.amountOfMoney = amountOfMoney;
        if (this.values.length ==0){
            return 0;
        }
        for (int i = 0; i < this.values.length; i++){
            if (this.values[i] < 0){
                subtractionBalance = subtractionBalance - this.values[i];
            } else if (this.values[i] > 0){
                sumBalance = sumBalance + this.values[i];
            }
            balance = sumBalance - subtractionBalance;
        }
        return balance;
    }



}
