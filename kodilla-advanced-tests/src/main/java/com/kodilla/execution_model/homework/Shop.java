package com.kodilla.execution_model.homework;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import java.util.stream.Collectors;

public class Shop {
    Set<Order> orders = new HashSet<>();

    public void addOrder(Order order){
        if (order.getPrice() > 0) {
            this.orders.add(order);
        }
    }

    public int getSize(){
        return this.orders.size();
    }

    public double getSumFromAllOrders(){
        return orders
        .stream()
                .map(Order::getPrice)
                .mapToDouble(order -> order.doubleValue())
                .sum();
    }

    public Set <Order> getOrderByPrice (double high, double low){
        return this.orders
                .stream()
                .filter(order -> order.getPrice() < high && order.getPrice() > low)
                .collect(Collectors.toSet());
    }

    public Set<Order> getOrderByDate(LocalDate from, LocalDate to){
        Set<Order> result = new HashSet<>();
        for (Order order : orders) {
            if (order.getDate().isAfter(from) && order.getDate().isBefore(to)) {
                result.add(order);
            }
        }
        return result;
    }
}
