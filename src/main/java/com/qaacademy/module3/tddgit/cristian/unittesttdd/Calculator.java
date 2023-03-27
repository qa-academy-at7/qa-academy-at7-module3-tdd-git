package com.qaacademy.module3.tddgit.cristian.unittesttdd;

public class Calculator {
    public int sum(int numberA, int numberB) {
        return numberA+numberB;
    }

    public int mul(int numberA, int numberB) {
        return numberA*numberB;
    }

    public int mulMultiple(int[] numbers) {
        int result = 1;
        for(int x: numbers){
            result *= x;
        }
        return result;
    }

    public int subtract(int numberA, int numberB) {
        return numberA-numberB;
    }

    public int divide(int numberA, int numberB) {
        return numberA/numberB;
    }

    public double divideReal(double numberA, double numberB) {
        return numberA/numberB;
    }
}
