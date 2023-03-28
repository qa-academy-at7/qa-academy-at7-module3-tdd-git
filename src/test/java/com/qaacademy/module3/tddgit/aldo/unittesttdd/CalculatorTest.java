package com.qaacademy.module3.tddgit.aldo.unittesttdd;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;

@DisplayName("Calculator")
@Tag("UnitTest")
public final class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    public static void setupAll() {
        System.out.println("BeforeAll - setup");
    }

    @BeforeEach
    public void setup() {
        // Given
        System.out.println("BeforeEach - setup");
        calculator = new Calculator();
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
    @DisplayName("Sum of than two integers")
    public void sumOfThanTwoIntegers() {
        List<Integer> numbers = List.of(5, 6, 4, 7, 1);

        // When
        int expectedResult = 23;
        int actualResult = calculator.sum(numbers);

        // Then
        System.out.println("expectedResult : ".concat(String.valueOf(expectedResult)));
        System.out.println("actualResult : ".concat(String.valueOf(actualResult)));
        Assertions.assertEquals(expectedResult, actualResult, "The sum of more than two integers in not correct.");
    }


    @Test
    @DisplayName("multiply more than two numbers integers")
    public void multiplyMoreThanTwoNumbersIntegers() {
        List<Integer> numbers = List.of(3, 4, 2, 2, 1);

        int expectedResult = 48;
        int actualResult = calculator.multiply(numbers);

        System.out.println("expectedResult : ".concat(String.valueOf(expectedResult)));
        System.out.println("actualResult : ".concat(String.valueOf(actualResult)));
        Assertions.assertEquals(expectedResult, actualResult, "The multiply of more than two integers in not correct.");
    }


    @Test
    @DisplayName("Subtract two whole numbers")
    public void subtractTwoWholeNumbers() {
        int numberA = 800;
        int numberB = 600;
        int expectedResult = 200;
        int actualResult = calculator.subtract(numberA, numberB);
        System.out.println("expectedResult : ".concat(String.valueOf(expectedResult)));
        System.out.println("actualResult : ".concat(String.valueOf(actualResult)));
        Assertions.assertEquals(expectedResult, actualResult, "The subtract of two integers is not correct.");
    }


    @Test
    @DisplayName("Divide two numbers integers")
    public void divideTwoNumbersIntegers() {
        int numberA = 800;
        int numberB = 300;
        int expectedResult = 2;
        int actualResult = calculator.divide(numberA, numberB);
        System.out.println("expectedResult : ".concat(String.valueOf(expectedResult)));
        System.out.println("actualResult : ".concat(String.valueOf(actualResult)));
        Assertions.assertEquals(expectedResult, actualResult, "The divide of two integers is not correct.");
    }

    @Test
    @DisplayName("Divide two real numbers")
    public void divideTwoRealNumbers() {
        double numberA = 800;
        double numberB = 300;
        double expectedResult = 2.6666666666666665;
        double actualResult = calculator.divide(numberA, numberB);
        System.out.println("expectedResult : ".concat(String.valueOf(expectedResult)));
        System.out.println("actualResult : ".concat(String.valueOf(actualResult)));
        Assertions.assertEquals(expectedResult, actualResult, "The divide of two real numbers is not correct.");
    }
}
