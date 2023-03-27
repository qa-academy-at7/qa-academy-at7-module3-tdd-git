package com.qaacademy.module3.tddgit.stefany.unittesttdd;

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
        Calculator calculator = new Calculator();

        int numberA = 3;
        int numberB = 5;
        int expectedResult = 15;
        int actualResult = calculator.multiply(numberA, numberB);

        System.out.println("expectedResult : ".concat(String.valueOf(expectedResult)));
        System.out.println("actualResult : ".concat(String.valueOf(actualResult)));
        Assertions.assertEquals(expectedResult, actualResult, "Multiply two integers is not correct");
    }

    @Test
    @DisplayName("Sum more than two integers")
    public  void sumMoreThanTwoIntegers(){
        Calculator calculator = new Calculator();

        int[] listNumbers = {12,14,5};
        int expectedResult = 31;
        int actualResult = calculator.sumNumbersList(listNumbers);

        System.out.println("expectedResult : ".concat(String.valueOf(expectedResult)));
        System.out.println("actualResult : ".concat(String.valueOf(actualResult)));
        Assertions.assertEquals(expectedResult, actualResult, "The sum of more than two integers is not correct");
    }

    @Test
    @DisplayName("multiply more than two numbers integers")
    public  void multiplyMoreThanTwoIntegers(){
        Calculator calculator = new Calculator();

        int[] listNumbers = {3,4,2};
        int expectedResult = 24;
        int actualResult = calculator.multiplyNumbersList(listNumbers);

        System.out.println("expectedResult : ".concat(String.valueOf(expectedResult)));
        System.out.println("actualResult : ".concat(String.valueOf(actualResult)));
        Assertions.assertEquals(expectedResult, actualResult, "Multiply more than two integers is not correct");
    }

    @Test
    @DisplayName("Subtract two whole numbers")
    public void subtractTwoNumberIntegers() {
        Calculator calculator = new Calculator();

        int numberA = 15;
        int numberB = 5;
        int expectedResult = 10;
        int actualResult = calculator.subtraction(numberA, numberB);

        System.out.println("expectedResult : ".concat(String.valueOf(expectedResult)));
        System.out.println("actualResult : ".concat(String.valueOf(actualResult)));
        Assertions.assertEquals(expectedResult, actualResult, "The subtraction of two integers is not correct");
    }

    @Test
    @DisplayName("Divide two numbers integers")
    public void divideTwoNumberIntegers() {
        Calculator calculator = new Calculator();

        int numberA = 15;
        int numberB = 5;
        int expectedResult = 3;
        int actualResult = calculator.divisionIntegers(numberA, numberB);

        System.out.println("expectedResult : ".concat(String.valueOf(expectedResult)));
        System.out.println("actualResult : ".concat(String.valueOf(actualResult)));
        Assertions.assertEquals(expectedResult, actualResult, "The division of two integers is not correct");
    }

    @Test
    @DisplayName("Divide two real numbers")
    public void divideTwoRealNumbers() {
        Calculator calculator = new Calculator();

        double numberA = 15d;
        double numberB = 4d;
        double expectedResult = 3.75d;
        double actualResult = calculator.divisionRealNumbers(numberA, numberB);

        System.out.println("expectedResult : ".concat(String.valueOf(expectedResult)));
        System.out.println("actualResult : ".concat(String.valueOf(actualResult)));
        Assertions.assertEquals(expectedResult, actualResult, "The division of two integers is not correct");
    }
}
