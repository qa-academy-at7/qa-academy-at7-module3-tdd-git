package com.qaacademy.module3.tddgit.harold.unittesttdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Calculator")
@Tag("Unitest")
public class CalculatorTest {
    @Test
    @DisplayName("Sum of two integers")
    public void sumOfTwoIntegers() {
        Calculator calculator = new Calculator();
        int numberA = 500;
        int numberB = 600;

        int expectedResult = 1100;
        int actualResult = calculator.sum(numberA, numberB);
        System.out.println("expectedResult: ".concat(String.valueOf(expectedResult)));
        System.out.println("actualResult: ".concat(String.valueOf(actualResult)));
        Assertions.assertEquals(expectedResult, actualResult, "the sum of two integers is not correct");
    }

    @Test
    @DisplayName("Multiply two numbers integers")
    public void multiplyTwoNumbersIntegers() {
        Calculator calculator = new Calculator();
        int numberA = 2;
        int numberB = 3;

        int expectedResult = 6;
        int actualResult = calculator.multi(numberA, numberB);
        System.out.println("expectedResult: ".concat(String.valueOf(expectedResult)));
        System.out.println("actualResult: ".concat(String.valueOf(actualResult)));
        Assertions.assertEquals(expectedResult, actualResult, "the multiply of two integers is not correct");
    }

    @Test
    @DisplayName("Sum of than two integers")
    public void sumOfThanTwoIntegers() {
        Calculator calculator = new Calculator();
        int[] num = {2, 4, 7, 8, 3, 2};
        int expectedResult = 26;
        int actualResult = calculator.sum(num);
        System.out.println("expectedResult: ".concat(String.valueOf(expectedResult)));
        System.out.println("actualResult: ".concat(String.valueOf(actualResult)));
        Assertions.assertEquals(expectedResult, actualResult, "the sum of than two integers is not correct");
    }

    @Test
    @DisplayName("multiply more than two numbers integers")
    public void multiplyMoreThanTwoNumbersIntegers() {
        Calculator calculator = new Calculator();
        int[] num = {2, 4, 7};
        int expectedResult = 56;
        int actualResult = calculator.multi(num);
        System.out.println("expectedResult: ".concat(String.valueOf(expectedResult)));
        System.out.println("actualResult: ".concat(String.valueOf(actualResult)));
        Assertions.assertEquals(expectedResult, actualResult, "the multiply more than two numbers integers is not correct");
    }

    @Test
    @DisplayName("Subtract two whole numbers")
    public void subtractTwoWholeNumbers() {
        Calculator calculator = new Calculator();
        int numberA = 10;
        int numberB = 5;

        int expectedResult = 5;
        int actualResult = calculator.subtract(numberA, numberB);
        System.out.println("expectedResult: ".concat(String.valueOf(expectedResult)));
        System.out.println("actualResult: ".concat(String.valueOf(actualResult)));
        Assertions.assertEquals(expectedResult, actualResult, "the subtract two whole numbers is not correct");
    }

    @Test
    @DisplayName("Divide two numbers integers")
    public void divideTwoNumbersIntegers() {
        Calculator calculator = new Calculator();
        int numberA = 10;
        int numberB = 2;

        int expectedResult = 5;
        int actualResult = calculator.divide(numberA, numberB);
        System.out.println("expectedResult: ".concat(String.valueOf(expectedResult)));
        System.out.println("actualResult: ".concat(String.valueOf(actualResult)));
        Assertions.assertEquals(expectedResult, actualResult, "the Divide two numbers integers is not correct");
    }

    @Test
    @DisplayName("Divide two real numbers")
    public void divideTwoRealNumbers() {
        Calculator calculator = new Calculator();
        double numberA = 10.5;
        double numberB = 2;

        double expectedResult = 5.25;
        double actualResult = calculator.divideRealNumber(numberA, numberB);
        System.out.println("expectedResult: ".concat(String.valueOf(expectedResult)));
        System.out.println("actualResult: ".concat(String.valueOf(actualResult)));
        Assertions.assertEquals(expectedResult, actualResult, "the Divide two numbers integers is not correct");
    }

}
