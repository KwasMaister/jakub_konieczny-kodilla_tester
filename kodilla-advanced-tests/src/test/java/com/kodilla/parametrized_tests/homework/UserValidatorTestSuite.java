package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"a", "B", "aa", "1", "9C", "a%a", "aaa.bbb.ccc.$$$"})
    public void blednaNazwaUzytkownika(String username){
        boolean result = userValidator.validateUsername(username);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"aaa", "Bb.", "123", "00000", "aaa111", "AAA", "AAA.", "123_Aa", "-._"})
    public void prawidlowaNazwaUzytkownika(String username){
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void nazwaUzytkownikaNull(String username){
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"123", "abc", "abcd@wp.pl1", "abcd.@wp.pl", "ab2d.kuba@wp.1", "123@123.123", "Ab-123c@aBc-abC"})
    public void blednyAdresMailowy (String email){
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"ab2d.kuba@wp.pl", "123@123.pl", "abc@abc.abc", "Abc@aBc.abC", "Ab-123c@aBc-.abC"})
    public void poprawnyAdresMailowy (String email){
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @NullSource
    public void adresMailowyNull (String email){
        assertFalse(userValidator.validateEmail(email));
    }

}