package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop = new Shop();
    Order order1 = new Order(100, LocalDate.of(2010, 10, 15), "Kuba");
    Order order2 = new Order(200, LocalDate.of(2010, 5, 23), "Malgosia");
    Order order3 = new Order(300, LocalDate.of(2011, 1, 1), "Andrzej");
    Order order4 = new Order(400, LocalDate.of(2015, 5, 7), "Magda");
    Order order5 = new Order(500, LocalDate.of(2017, 2, 27), "Lukasz");
    Order order6 = new Order(600, LocalDate.of(2014, 9, 5), "Wiktoria");
    Order order7 = new Order(700, LocalDate.of(2020, 10, 19), "Pawel");
    Order order8 = new Order(-1000, LocalDate.of(2013, 3, 13), "Test");

    Order order9 = new Order(701.30, LocalDate.of(2015, 8, 19), "Pawel");

    @BeforeEach
    public void initializeShop(){
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
        shop.addOrder(order6);
        shop.addOrder(order7);
        shop.addOrder(order8);
        shop.addOrder(order9);
    }

    @Test
    public void addOrderAndOneOrderIsNegativePrice(){
        //when
        int orders = shop.getSize();
        //then
        assertEquals(8, orders);
    }

    @Test
    public void getEmptyOrder(){
        //given
        Shop shop1 = new Shop();
        //when
        int orders = shop1.getSize();
        //then
        assertEquals(0, orders);
    }

    @Test
    public void getSumAllOfOrders(){
        //when
        double sum = shop.getSumFromAllOrders();
        //then
        assertEquals(3501.3, sum, 0.01);
    }

    @Test
    public void getSumWhenTheOrderListIsEmpty(){
        //given
        Shop shop1 = new Shop();
        //when
        double sum = shop1.getSumFromAllOrders();
        //then
        assertEquals(0, sum, 0.01);
    }

    @Test
    public void getOrderByPrice(){
        //when
        Set<Order> result = shop.getOrderByPrice(700, 400);
        Set<Order> expected = new HashSet<>();
        expected.add(order5);
        expected.add(order6);
        //then
        assertEquals(expected, result);
    }

    @Test
    public void getOrderByPriceWhenListIsEmpty(){
        //when
        Set<Order> result = shop.getOrderByPrice(2000, 3000);
        Set<Order> expected = new HashSet<>();
        //then
        assertEquals(expected, result);
    }

    @Test
    public void getOrderByDate(){
        //when
        Set<Order> result = shop.getOrderByDate(LocalDate.of(2016,1,1), LocalDate.of(2020,10,20));
        Set<Order> expected = new HashSet<>();
        expected.add(order5);
        expected.add(order7);
        //then
        assertEquals(expected, result);
    }

    @Test
    public void getOrderByDateWhenListIsEmpty(){
        //when
        Set<Order> result = shop.getOrderByDate(LocalDate.of(2025,1,1), LocalDate.of(2030,10,20));
        Set<Order> expected = new HashSet<>();
        //then
        assertEquals(expected,result);
    }

}