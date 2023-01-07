package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {
/*
    //1 --> pobierany jest kontekst Springowy (koniecznie jest wskazanie nazwy pakietu !)
    //2 --> Mając kontekst przypisany do zmiennej, możemy skorzystać z metody getBean(Type.class), która szuka beana określonego typu

    I pozniej w kazdym tescie na bean wywoluje poszczegolne metody
 */

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); //1
    Calculator bean = context.getBean(Calculator.class); //2

    @Test
    public void addTwoNumbers(){
        double sum = bean.add(3.15, 7.87);
        assertEquals(11.02, sum, 0.01);
    }

    @Test
    public void subtractTwoNumbers(){
        double subtract = bean.subtract(2, 6.15);
        assertEquals(-4.15, subtract, 0.01);
    }

    @Test
    public void multiplyTwoNumbers (){
        double multiply = bean.multiply(2, 16);
        assertEquals(32, multiply, 0.01);
    }

    @Test
    public void divideTwoNumbers (){
        double divide = bean.divide(6, 2.5);
        assertEquals(2.4, divide, 0.01);
    }

    @Test
    public void divideByZero(){
        assertThrows(IllegalArgumentException.class, () -> {double divide = bean.divide(10, 0);});
    }
}