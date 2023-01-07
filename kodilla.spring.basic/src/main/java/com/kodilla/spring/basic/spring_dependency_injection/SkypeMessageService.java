package com.kodilla.spring.basic.spring_dependency_injection;

import org.springframework.stereotype.Component;

/*
Adnotacja @Component to nie jedyna adnotacja, która tworzy beana i umieszcza go w kontenerze Springa.
Analogicznie działają @Service, @Controller i @Repository. Wspomniane adnotacje to bardziej specyficzne wersji adnotacji
@Component – programiści używają ich, aby zasygnalizować, że klasa będzie zawierać logikę biznesową (@Service),
będzie komunikować się z bazą danych (@Repository) lub będzie kontrolować przychodzące żądania (@Controller).
Z technicznego punktu widzenia, obojętnie której z wymienionych adnotacji użyjesz, bean zostanie utworzony.
 */

@Component // wskazanie klasy jako beana
public class SkypeMessageService {

    public String send(String message, String receiver) {
        return "Sending [" + message + "] to: " + receiver + " using Skype";
    }


}