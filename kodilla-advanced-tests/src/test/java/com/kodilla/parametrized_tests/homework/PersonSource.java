package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSource {
    static Stream<Arguments> provideDataForTestingGetBMI () {
        return Stream.of(
                Arguments.of(new Person(1.8,90), "Overweight"),
                Arguments.of(new Person(1.8, 80), "Normal (healthy weight)"),
                Arguments.of(new Person(1.7, 50), "Underweight"),
                Arguments.of(new Person(1.7, 40), "Very severely underweight"),
                Arguments.of(new Person(1.7, 46), "Severely underweight"),
                Arguments.of(new Person(1.81, 105), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.81, 130), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.81, 135), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.81, 152), "Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.81, 170), "Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.81, 250), "Obese Class VI (Hyper Obese)")
        );
    }
}
