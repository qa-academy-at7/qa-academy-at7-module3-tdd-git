package com.qaacademy.module3.tddgit.aldo.katas;

import java.util.Arrays;

public class CamelCaseMethod {
    public static String camelCase(String str) {
        return Arrays.stream(str.split("\\s+"))
                .filter(s -> !s.isEmpty())
                .map(s ->
                        String.valueOf(Character.toUpperCase(s.charAt(0)))
                                .concat(s.substring(1).toLowerCase()))
                .reduce("", String::concat);
    }
}
