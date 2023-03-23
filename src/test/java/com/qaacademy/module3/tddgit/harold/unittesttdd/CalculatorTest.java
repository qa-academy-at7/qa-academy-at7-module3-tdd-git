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
}
