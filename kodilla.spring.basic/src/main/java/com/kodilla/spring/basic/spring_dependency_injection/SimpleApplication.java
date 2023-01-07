package com.kodilla.spring.basic.spring_dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

    /*
    Beana możemy wstrzyknąć tylko do innego beana

    autowired --> wstrzykiwanie do pola
    Adnotacja @Autowired mówi: "znajdź beana o typie określonym poniżej i przypisz go do wskazanej zmiennej"
     */

@Component
public class SimpleApplication {
    @Autowired
    private SkypeMessageService messageService;

    public String processMessage(String message, String receiver) {
        if (checkReceiver(receiver)) {
            return this.messageService.send(message, receiver);
        }
        return null;
    }

    private boolean checkReceiver(String receiver) {
        return receiver != null && !receiver.isEmpty();
    }
}