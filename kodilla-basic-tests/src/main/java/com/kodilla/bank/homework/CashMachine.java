package com.kodilla.bank.homework;

public class CashMachine {
    private int [] values;  // tablica przechowuje wartosci typu int i tablica nazywa sie "values"
    private int size;

    private int amountOfMoney;

    public CashMachine(){             // w tym miejscu definiujemy pierwsza metode a w niej deklarujemy pusta tablice. Ma zero elementów typu int
        this.size = 0;
        this.values = new int[0];
    }

    public void depositMoneyAndCashOut(int value){
        this.size++;
        int [] newTab = new int [this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value; // -1 ???
        this.values = newTab;
    }

    public int [] getValues(){
        return values;
    } // to znaczy że zwracamy wartosc tablicy zadeklarowanej w linii 4. Metoda nie ma dostepu do innej metody

    public int balance(){
        int sumBalance = 0;
        if (this.values.length ==0){
            return 0;
        }
        for (int i = 0; i < this.values.length; i++){
            if (this.values[i] >= 0){
                sumBalance = sumBalance + this.values[i];
            }
        }
        return sumBalance;
    }

    public double averageBalance(){
        double sumBalance = 0;
        double averageBalance = 0;
        double x = 0;
        if (this.values.length ==0){
            return 0;
        }
        for (int i = 0; i < this.values.length; i++){
            if (this.values[i] >= 0){
                sumBalance = sumBalance + this.values[i];
                x++;
            }
        }
        averageBalance = sumBalance / x;
        return averageBalance;
    }

    public int subtract (){
        int subtract = 0;
        int x = 0;
        if (this.values.length == 0){
            return 0;
        }
        for (int i = 0; i < this.values.length; i++){
            if (this.values[i] <= 0){
            subtract = subtract + this.values[i];
            }
        }
        return subtract;
    }

    public double averageSubtract(){
        double subtract = 0;
        double averageSubtract = 0;
        double x = 0;
        if (this.values.length ==0){
            return 0;
        }
        for (int i = 0; i < this.values.length; i++){
            if (this.values[i] <= 0) {
                subtract = subtract + this.values[i];
                x++;
            }
        }
        averageSubtract = subtract / x;
        return averageSubtract;
    }

    public int sumBalanceAndSubtract(){
        int sum = 0;
        int sumBalance = 0;
        int subtract = 0;
        if (this.values.length == 0){
            return 0;
        }
        for (int i = 0; i < this.values.length; i++){
            if (this.values[i] >= 0){
                sum = sum + this.values[i];
            } else {
                subtract = subtract + this.values[i];
        }
            sumBalance = sum + subtract;
        }
        return sumBalance;
    }

    public int numberOfOperations() {
        int sum = 0;
        if (this.values.length == 0) {
            return 0;
        }
       if (this.values.length > 0){
            sum = this.values.length;
        }
        return sum;
    }

    public int numberOfOperationsOnlyDeposit() {
        int sum = 0;
        if (this.values.length == 0) {
            return 0;
        }
        for (int i = 0; i < this.values.length; i++) {
            if (this.values.length > 0 && this.values[i] >= 0){
                sum = sum + 1;
            }
        }
        return sum;
    }

    public int numberOfOperationsOnlyCashOut(){
        int sum = 0;
        if (this.values.length == 0){
            return 0;
        }
        for (int i = 0; i < this.values.length; i++){
            if (this.values.length > 0 && this.values[i] < 0){
                sum = sum +1;
            }
        }
        return sum;
    }



}
