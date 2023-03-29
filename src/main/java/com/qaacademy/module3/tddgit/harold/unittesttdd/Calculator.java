package com.qaacademy.module3.tddgit.harold.unittesttdd;

public class Calculator {
    public int sum(int numberA, int numberB) {
        return numberA + numberB;
    }

    public int multi(int numberA, int numberB) {
        return numberA * numberB;
    }

    public int sum(int[] num) {
        int result = 0;
        for (int a : num) {
            result += a;
        }
        return result;
    }

    public int multi(int[] num) {
        int result = 1;
        for (int a : num) {
            result *= a;
        }
        return result;
    }

    public int subtract(int numberA, int numberB) {
        return numberA - numberB;
    }

    public int divide(int numberA, int numberB) {
        int result = 0;
        if (numberB == 0) {
            System.out.println("it is not possible to divide");
        } else {
            result = numberA / numberB;
        }
        return result;
    }

    public double divideRealNumber(double numberA, double numberB) {
        double result = 0.0;
        if (numberB == 0.0) {
            System.out.println("it is not possible to divide");
        } else {
            result = numberA / numberB;
        }
        return result;
    }
}
