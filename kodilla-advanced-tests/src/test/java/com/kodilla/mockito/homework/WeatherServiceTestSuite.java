package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherServiceTestSuite {

    WeatherNotification weatherNotification = new WeatherNotification();
    Client client1 = Mockito.mock(Client.class);
    Client client2 = Mockito.mock(Client.class);
    Location location1 = Location.KATOWICE;
    Location location2 = Location.CIESZYN;
    Information information = Mockito.mock(Information.class);
    Alert alert = Mockito.mock(Alert.class);

    @Test
    public void notSubscribedClientShouldNotReceiveInformation () {
        weatherNotification.sendInfoToAll(information);
        Mockito.verify(client1, Mockito.never()).receive(information);
    }

    @Test
    public void notSubscribedClientShouldNotReceiveAlert () {
        weatherNotification.sendAlertToLocationClients(location1, alert);
        Mockito.verify(client1, Mockito.never()).receive2(alert);
    }

    @Test
    public void subscribedClientsShouldReceiveInfo() {
        weatherNotification.addSubscriber(client1,location1);

        weatherNotification.sendInfoToAll(information);

        Mockito.verify(client1, Mockito.times(1)).receive(information);
        Mockito.verify(client2, Mockito.never()).receive(information);
    }

    @Test
    public void onlySubscribedClientsFromLocationShouldReceiveAlert() {
        weatherNotification.addSubscriber(client1,location1);
        weatherNotification.addSubscriber(client2,location2);

        weatherNotification.sendAlertToLocationClients(location1, alert);

        Mockito.verify(client1, Mockito.times(1)).receive2(alert);
        Mockito.verify(client2, Mockito.never()).receive2(alert);
    }

    @Test
    public void unsubscribedClientFromLocationShouldNotReceiveAlert() {
        weatherNotification.addSubscriber(client1,location1);
        weatherNotification.addSubscriber(client2,location1);

        weatherNotification.removeSubscriberFromLocation(client2,location1);

        weatherNotification.sendAlertToLocationClients(location1, alert);

        Mockito.verify(client1, Mockito.times(1)).receive2(alert);
        Mockito.verify(client2, Mockito.never()).receive2(alert);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveAlert() {
        weatherNotification.addSubscriber(client1,location1);
        weatherNotification.addSubscriber(client1,location2);
        weatherNotification.addSubscriber(client2,location1);

        weatherNotification.removeSubscriber(client1);

        weatherNotification.sendAlertToLocationClients(location1, alert);

        Mockito.verify(client2, Mockito.times(1)).receive2(alert);
        Mockito.verify(client1, Mockito.never()).receive2(alert);
    }
    @Test
    public void unsubscribedClientShouldNotReceiveInfo() {
        weatherNotification.addSubscriber(client1,location1);
        weatherNotification.addSubscriber(client1,location2);
        weatherNotification.addSubscriber(client2,location1);

        weatherNotification.removeSubscriber(client1);

        weatherNotification.sendInfoToAll(information);

        Mockito.verify(client2, Mockito.times(1)).receive(information);
        Mockito.verify(client1, Mockito.never()).receive(information);
    }

    @Test
    public void clientsShouldNotReceiveAlertForNotExistingLocation() {
        weatherNotification.addSubscriber(client1,location1);
        weatherNotification.addSubscriber(client2,location1);

        weatherNotification.removeLocation(location1);

        weatherNotification.sendAlertToLocationClients(location1, alert);

        Mockito.verify(client2, Mockito.never()).receive2(alert);
        Mockito.verify(client1, Mockito.never()).receive2(alert);
    }
}