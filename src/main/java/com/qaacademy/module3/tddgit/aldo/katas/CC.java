package com.qaacademy.module3.tddgit.aldo.katas;

public class CC {
    public static int charCount(String str, char c) {
        return (int) str.toLowerCase().chars().filter(ch -> ch == Character.toLowerCase(c)).count();
    }
}
