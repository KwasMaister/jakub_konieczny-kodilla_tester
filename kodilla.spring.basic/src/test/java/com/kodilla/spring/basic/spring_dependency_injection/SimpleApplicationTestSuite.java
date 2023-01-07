package com.kodilla.spring.basic.spring_dependency_injection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest //uruchomienie Springowego kontekstu
public class SimpleApplicationTestSuite {

    /*
    //1 --> pobierany jest kontekst Springowy (koniecznie jest wskazanie nazwy pakietu !)
    //2 --> Mając kontekst przypisany do zmiennej, możemy skorzystać z metody getBean(Type.class), która szuka beana określonego typu
    //3 --> Mając beana, możemy wywoływać na nim poszczególne metody
     */
    @Test
    public void shouldReturnCorrectMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        SkypeMessageService bean = context.getBean(SkypeMessageService.class); //2
        String message = bean.send("Test", "Any receiver"); //3
        Assertions.assertNotNull(message);
    }

    @Test
    public void shouldProcessMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        SimpleApplication bean = context.getBean(SimpleApplication.class);
        String message = bean.processMessage("Test", "Any receiver");
        Assertions.assertEquals("Sending [Test] to: Any receiver using Skype", message);
    }

}