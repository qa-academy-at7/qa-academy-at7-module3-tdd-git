package com.qaacademy.module3.tddgit.aldo.katas;

import java.util.stream.IntStream;

public class MissingLetter {
    public static char findMissingLetter(char[] array) {
        return IntStream.range(0, array.length - 1)
                .filter(i -> array[i + 1] != array[i] + 1)
                .mapToObj(i -> (char) (array[i] + 1))
                .findAny().orElseThrow(IllegalArgumentException::new);
    }
}
