package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {
    Invoice invoice = new Invoice();
    Item milk = new Item("Milk", 3.50);
    Item eggs = new Item("Eggs", 8.00);
    Item bread = new Item("Bread", 4.15);

    @Test
    public void shouldAddItemsToInvoiceReturnSize(){
        /*
        np tej linii invoice.addItem(milk);
        nie możemy przeniesc wyzej, bezposrednio pod klase. Bo kodu wykonywalnego nie mozna umiescic bezposrednio w klasie
         */
        //when
        int x = invoice.getSize();

        //then
        assertEquals(3, x);
    }

    @Test
    public void shouldGetExistingItem(){
        //when
        Item result = invoice.getItem(2);

        //then
        assertEquals("Bread", result.getName());
        assertEquals(4.15, result.getPrice(), 0.01);
    }

    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {
        //When
        Item result = invoice.getItem(-3);

        //Then
        assertNull(result);
    }

    @Test
    public void shouldReturnNullWhenPassingOutOfRangeIndex(){

        //when
        Item result = invoice.getItem(7);

        //then
        assertNull(result);
    }

    @Test
    public void shouldClearInvoice(){

        //when
        invoice.clear();

        //then
        assertEquals(0, invoice.getSize());
    }

    @BeforeEach  //Metoda oznaczona tą adnotacją zostanie wywołana przed uruchomieniem każdego testu.
    public void initializeInvoice(){
        invoice.addItem(milk);
        invoice.addItem(eggs);
        invoice.addItem(bread);
    }

    @AfterEach  //metoda oznaczona taką adnotacją zostanie wywołana po uruchomieniu każdego testu.
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll //metoda wywola sie przed wszystkimi testami
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll //metoda wywola sie po wszystkich testach
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}