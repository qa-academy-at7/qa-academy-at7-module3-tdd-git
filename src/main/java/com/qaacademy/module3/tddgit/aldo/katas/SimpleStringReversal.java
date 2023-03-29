package com.qaacademy.module3.tddgit.aldo.katas;

import java.util.stream.IntStream;

public class SimpleStringReversal {
    public static String solve(String s) {
        StringBuilder str = new StringBuilder(s.replaceAll(" ", "")).reverse();
        IntStream.range(0, s.length())
                .filter(i -> s.charAt(i) == ' ')
                .forEach(j -> str.insert(j, ' '));
        return str.toString();
    }
}
