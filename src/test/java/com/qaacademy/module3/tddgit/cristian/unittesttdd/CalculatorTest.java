package com.qaacademy.module3.tddgit.cristian.unittesttdd;

import org.junit.jupiter.api.*;

@DisplayName("Calculator")
@Tag("UniTest")
public final class CalculatorTest {

    @BeforeAll
    public static void setUpAll(){
        System.out.println("BeforeAll - setup");
    }

    @BeforeEach
    public void setup(){
        System.out.println("BeforeEach - setup");
    }

    @AfterAll
    public static void teardownAll(){
        System.out.println("AfterAll - teardown");
    }

    @AfterEach
    public void teardown(){
        System.out.println("AfterEach - teardown");
    }


    @Test
    @DisplayName("Sum of two integer numbers")
    public void sumOfTwoIntegers(){
        Calculator calculator = new Calculator();

        int numberA = 500;
        int numberB = 600;
        int expectedResult = 1100;
        int actualResult = calculator.sum(numberA,numberB);
        System.out.println("Expected result: ".concat(String.valueOf(expectedResult)));
        System.out.println("Actual result: ".concat(String.valueOf(actualResult)));

        Assertions.assertEquals(expectedResult,actualResult, "The sum of two integers is not correct");
    }

    @Test
    @DisplayName("Multiply two integer numbers")
    public void multiplyOfTwoIntegers(){
        Calculator calculator = new Calculator();

        int numberA = 12;
        int numberB = 5;
        int expectedResult = 60;
        int actualResult = calculator.mul(numberA,numberB);
        System.out.println("Expected result: ".concat(String.valueOf(expectedResult)));
        System.out.println("Actual result: ".concat(String.valueOf(actualResult)));

        Assertions.assertEquals(expectedResult,actualResult, "The multiply of two integers is not correct");
    }
}