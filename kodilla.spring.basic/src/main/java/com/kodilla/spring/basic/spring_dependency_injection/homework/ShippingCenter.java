package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ShippingCenter {

    // tutaj dodaj odpowiednie wstrzykiwanie zależności

    @Resource(name = "deliveryService")
    private DeliveryService deliveryService;


    //@Resource(name = "notificationService") --> moglo byc to wykorzystane ale sprawdzilem autowired + qualifier
    @Autowired
    @Qualifier(value = "notificationService")
    private NotificationService notificationService;

    public String sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            return notificationService.success(address);
        }
        return notificationService.fail(address);
    }
}