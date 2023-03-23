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
    public void  sumOfTwoIntegers(){
        Calculator calculator=new Calculator();
        int numberA=500;
        int numberB=600;

        int expectedResult=1100;
        int actualResult=calculator.sum(numberA,numberB);
        System.out.println("expectedResult: " + expectedResult);
        System.out.println("actualResult: " + actualResult);
        Assertions.assertEquals(expectedResult,actualResult,"the sum of two integers is not correct");
    }

    @Test
    @DisplayName("Multiply two numbers integers")
    public void  multiplyTwoNumbersIntegers(){
        Calculator calculator1 = new Calculator();
        int numberC = 2;
        int numberD = 3;

        int expectedResultMul = 6;
        int actualResultMul = calculator1.multi(numberC, numberD);
        System.out.println("expectedResult: " + expectedResultMul);
        System.out.println("actualResult: " + actualResultMul);
        Assertions.assertEquals(expectedResultMul, actualResultMul, "the multiply of two integers is not correct");
    }
}
