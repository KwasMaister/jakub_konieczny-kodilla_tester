package com.kodilla.spring.basic.dependency_injection.homework;

public class DeliveryServiceUPS implements DeliveryService {
    @Override
    public boolean deliverPackage(String address, double weight) {
        {
            if (weight > 30) {
                System.out.println("Package too heavy");
                return false;
            }
            System.out.println("Delivering in progress...");
            return true;
        }
    }

    @Override
    public void nameOfCompany() {
        System.out.println("Delivered by: UPS");
    }
}
