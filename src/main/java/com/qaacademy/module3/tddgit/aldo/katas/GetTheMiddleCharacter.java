package com.qaacademy.module3.tddgit.aldo.katas;

public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        int length = word.length();
        int middle = length / 2;
        return length % 2 == 0 ? word.substring(middle - 1, middle + 1) : word.substring(middle, middle + 1);
    }
}
