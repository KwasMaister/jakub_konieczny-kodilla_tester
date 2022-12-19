package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("FirstOreder123"));
        warehouse.addOrder(new Order("SecondOrder123"));
        warehouse.addOrder(new Order("ThirdOrder123"));

        try {
            Order orderExist = warehouse.getOrder("FourthdOrder123");
            System.out.println("Order exist");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order doesn't exist");
        }
        System.out.println("Thanks, have a nice day ;)");
    }
}
