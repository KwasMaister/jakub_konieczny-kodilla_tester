package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherNotification {

    private Map<Location, Set<Client>> Clients = new HashMap<>();

    /*
    przekazuje argument
    sprawdza czy w mapie jest klucz "lokalizacja"
    jesli nie, to do mapy dopisuje lokalizacje, oraz dopisuje do listy klienta
    jesli tak, to dopisuje do tej lokalizacji klienta
     */

    public void addSubscriber (Client client, Location location){
        if (!Clients.containsKey(location)){
            Clients.put(location, new HashSet<>(Arrays.asList(client)));
        } else {
            Clients.get(location).add(client);
        }
    }

    public void removeSubscriber(Client client) {
        for (Set<Client> clients : Clients.values()) {
            clients.remove(client);
        }
    }

    /*
    Pobieram sobie cala zawartosc mapy (entrySet)
    usuwam jesli klucz mapy (czyli lokalizacja) zgadza się z parametrem przekazanym w metodzie
     */
    public void removeLocation(Location location) {
        Clients.entrySet().removeIf(entry -> entry.getKey().equals(location));
    }

    /*
    sprawdzam lokalizacje i jesli lokalizacja pasuje to usuwam klienta
     */
    public void removeSubscriberFromLocation(Client client, Location location) {
        if (Clients.containsKey(location)) {
            // Clients.remove(client);
            Clients.get(location).remove(client);
        }
    }

    /*
    flatMap --> zwraca strumien elementow
    .distinct --> zwraca unikalny strumien elementow

    Za bardzo nie rozumiem dlaczego te opreacje musimy polaczyc ale tak mi mowią internety ;I
    https://nullpointerexception.pl/kurs-java-dla-poczatkujacych-8-streamy-i-lambdy/
     */
    public void sendInfoToAll(Information information) {
        Clients.values()
                .stream()
                .flatMap(Collection::stream)
                .distinct()
                .forEach(client -> client.receive(information));
    }

    public void sendAlertToLocationClients(Location location, Alert alert) {
        if (Clients.containsKey(location)) {
            Clients.get(location).forEach(client -> client.receive2(alert));
        }
    }


    /*
    public void sendv2 (Alert alert){
        this.Clients.forEach((location, clients) -> location.receive(alert);
    }

     */
}
