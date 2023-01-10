package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

//1 - kontekst Springowy. Konieczne jest wskazanie nazwy pakietu – pomaga to określić zasięg skanowania. Ta linia jest konieczna gdy jest testowanie
// za pomoca Springa

@SpringBootTest
class ShippingCenterTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); //1

@Test
    public void shouldSendPackage(){
    ShippingCenter bean = context.getBean(ShippingCenter.class);
    String packageSend = bean.sendPackage("Cieszyn", 30);
    assertEquals("Package delivered to: Cieszyn", packageSend);
}

    @Test
    public void shouldNotSendPackage(){
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String packageSend = bean.sendPackage("Cieszyn", 31);
        assertEquals("Package not delivered to: Cieszyn", packageSend);
        //Assertions.assertEquals("Package not delivered to: Cieszyn", packageSend);
    }
}