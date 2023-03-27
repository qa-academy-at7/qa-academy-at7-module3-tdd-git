package com.qaacademy.module3.tddgit.stefany.unittesttdd;

public class Calculator {
    public int sum(int numberA, int numberB) {

        return numberA + numberB;
    }

    public int multiply(int numberA, int numberB) {

        return numberA * numberB;
    }

    public int sumNumbersList(int[] listNumbers) {
        int result = 0;
        for(int i=0; i<listNumbers.length; i++){
            result += listNumbers[i];
        }
        return result;
    }

    public int multiplyNumbersList(int[] listNumbers) {
        int result = 1;
        for(int i=0; i<listNumbers.length; i++){
            result *= listNumbers[i];
        }
        return result;
    }

    public int subtraction(int numberA, int numberB) {
        return numberA-numberB;
    }

    public int divisionIntegers(int numberA, int numberB) {
        return numberA/numberB;
    }

    public double divisionRealNumbers(double numberA, double numberB) {
        return  numberA/numberB;
    }
}
