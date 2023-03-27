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

    @Test
    @DisplayName("Multiply of more than two integers")
    public void multiplyOfMultipleIntegers() {
        Calculator calculator = new Calculator();

        int[] numbers = {1,2,3,4};
        int expectedResult = 24;
        int actualResult = calculator.mulMultiple(numbers);

        System.out.println("expectedResult : ".concat(String.valueOf(expectedResult)));
        System.out.println("actualResult : ".concat(String.valueOf(actualResult)));
        Assertions.assertEquals(expectedResult, actualResult, "The multiplication of multiple integers is not correct");
    }

    /*
    @Test
    @DisplayName("Subtract two whole numbers")
     */
    @Test
    @DisplayName("Subtraction of two integers")
    public void subtractIntegers() {
        Calculator calculator = new Calculator();

        int numberA = 10;
        int numberB = 15;
        int expectedResult = -5;
        int actualResult = calculator.subtract(numberA,numberB);

        System.out.println("expectedResult : ".concat(String.valueOf(expectedResult)));
        System.out.println("actualResult : ".concat(String.valueOf(actualResult)));
        Assertions.assertEquals(expectedResult, actualResult, "The subtract of two integers is not correct");
    }


    /*
    @Test
    @DisplayName("Divide two numbers integers")
     */
    @Test
    @DisplayName("Division of two integers")
    public void divideIntegers() {
        Calculator calculator = new Calculator();

        int numberA = 25;
        int numberB = 2;
        int expectedResult = 12;
        int actualResult = calculator.divide(numberA,numberB);

        System.out.println("expectedResult : ".concat(String.valueOf(expectedResult)));
        System.out.println("actualResult : ".concat(String.valueOf(actualResult)));
        Assertions.assertEquals(expectedResult, actualResult, "The division of two integers is not correct");
    }

    /*
    @Test
    @DisplayName("Divide two real numbers")
     */
    @Test
    @DisplayName("Division of two integers")
    public void divideRealNumbers() {
        Calculator calculator = new Calculator();

        double numberA = -50.5;
        double numberB = -2;
        double expectedResult = 25.25;
        double actualResult = calculator.divideReal(numberA,numberB);

        System.out.println("expectedResult : ".concat(String.valueOf(expectedResult)));
        System.out.println("actualResult : ".concat(String.valueOf(actualResult)));
        Assertions.assertEquals(expectedResult, actualResult, "The division of two real numbers is not correct");
    }
}
