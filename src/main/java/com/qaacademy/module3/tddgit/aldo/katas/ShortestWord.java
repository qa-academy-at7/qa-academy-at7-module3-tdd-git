package com.qaacademy.module3.tddgit.aldo.katas;

import java.util.Arrays;

public class ShortestWord {
    public static int findShort(String s) {
        return Arrays.stream(s.split(" ")).mapToInt(String::length).min().orElse(-1);
    }
}
