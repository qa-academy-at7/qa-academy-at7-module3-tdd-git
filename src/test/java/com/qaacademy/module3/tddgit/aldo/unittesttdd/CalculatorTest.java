package com.qaacademy.module3.tddgit.aldo.unittesttdd;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Calculator")
@Tag("UnitTest")
public final class CalculatorTest {

    @BeforeAll
    public static void setupAll() {
        System.out.println("BeforeAll - setup");
    }

    @BeforeEach
    public void setup() {
        System.out.println("BeforeEach - setup");
    }

    @AfterAll
    public static void teardownAll() {
        System.out.println("AfterAll - teardown");
    }

    @AfterEach
    public void teardown() {
        System.out.println("AfterEach - teardown");
    }


    @Test
    @DisplayName("Sum of two integers")
    public void sumOfTwoIntegers() {
        // Given
        Calculator calculator = new Calculator();

        // When
        int numberA = 500;
        int numberB = 600;
        int expectedResult = 1100;
        int actualResult = calculator.sum(numberA, numberB);

        // Then
        System.out.println("expectedResult : ".concat(String.valueOf(expectedResult)));
        System.out.println("actualResult : ".concat(String.valueOf(actualResult)));
        Assertions.assertEquals(expectedResult, actualResult, "The sum of two integers is not correct");
    }


    @Test
    @DisplayName("Multiply two numbers integers")
    public void multiplyTwoNumberIntegers() {
        // Given
        Calculator calculator = new Calculator();

        // When
        int numberA = 3;
        int numberB = 5;
        int expectedResult = 15;
        int actualResult = calculator.multiply(numberA, numberB);

        // Then
        System.out.println("expectedResult : ".concat(String.valueOf(expectedResult)));
        System.out.println("actualResult : ".concat(String.valueOf(actualResult)));
        Assertions.assertEquals(expectedResult, actualResult, "Multiply two integers is not correct");
    }

    @Test
    @DisplayName("Sum more than two integers")
    public  void sumMoreThanTwoIntegers(){

    }

    /*
    @Test
    @DisplayName("multiply more than two numbers integers")
     */

    /*
    @Test
    @DisplayName("Subtract two whole numbers")
     */

    /*
    @Test
    @DisplayName("Divide two numbers integers")
     */

    /*
    @Test
    @DisplayName("Divide two real numbers")
     */
}
