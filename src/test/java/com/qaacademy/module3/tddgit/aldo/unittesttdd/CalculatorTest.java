package com.qaacademy.module3.tddgit.aldo.unittesttdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Calculator")
@Tag("UnitTest")
public final class CalculatorTest {

    @Test
    @DisplayName("Sum of two integers")
    public void sumOfTwoIntegers() {
        Calculator calculator = new Calculator();

        int numberA = 500;
        int numberB = 600;
        int expectedResult = 1100;
        int actualResult = calculator.sum(numberA, numberB);

        System.out.println("expectedResult : ".concat(String.valueOf(expectedResult)));
        System.out.println("actualResult : ".concat(String.valueOf(actualResult)));
        Assertions.assertEquals(expectedResult, actualResult, "The sum of two integers is not correct");
    }
}
