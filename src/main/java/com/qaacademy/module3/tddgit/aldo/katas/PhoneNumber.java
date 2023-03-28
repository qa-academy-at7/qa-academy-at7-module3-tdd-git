package com.qaacademy.module3.tddgit.aldo.katas;

public class PhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        String formatter = "(xxx) xxx-xxxx";
        for (int number : numbers) {
            formatter = formatter.replaceFirst("x", String.valueOf(number));
        }

        return formatter;
    }
}
