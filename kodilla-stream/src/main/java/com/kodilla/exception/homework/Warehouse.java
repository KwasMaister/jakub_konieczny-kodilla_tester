package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Warehouse {
    List<Order> orderList = new ArrayList<>();

    public void addOrder (Order order){
        orderList.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
       return orderList
                .stream()
                .filter(n -> n.getNumber().equals(number))
                .findAny()
                .orElseThrow(OrderDoesntExistException::new); // za bardzo nie wiem dlaczego new ale z tym mi to zadzialalo ...
    }
}
