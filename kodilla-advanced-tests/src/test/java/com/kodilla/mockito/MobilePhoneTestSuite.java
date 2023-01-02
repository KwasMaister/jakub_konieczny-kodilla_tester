package com.kodilla.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class MobilePhoneTestSuite {
    MobilePhone myPhone = Mockito.mock(MobilePhone.class);

    @Test
    public void testDefaultBehaviourOfTestDouble() {
        Assertions.assertFalse(myPhone.needsCharging());
        Assertions.assertEquals(0.0, myPhone.getFreeStorage());
    }

    @Test
    public void testExpectation() {
        Assertions.assertFalse(myPhone.needsCharging());
        Mockito.when(myPhone.needsCharging()).thenReturn(true); //1
        Assertions.assertTrue(myPhone.needsCharging());
    }

    @Test
    public void shouldCallLaunchApplication() {
        myPhone.launchApplication("Tetris4D"); //wywolujemy okreslona metode przekazujac argument
        Mockito.verify(myPhone).launchApplication("Tetris4D"); //sprawdzamy czy odpowiednia metoda zostala wywolana
    }


}
/*
1 --> możemy przetłumaczyć tak: "jeśli zostanie wywołana metoda needsCharging() z obiektu o nazwie myPhone, zwróć true jako wynik działania tej metody".
 */