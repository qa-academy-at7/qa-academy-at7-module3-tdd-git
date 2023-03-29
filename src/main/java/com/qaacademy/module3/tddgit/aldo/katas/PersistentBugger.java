package com.qaacademy.module3.tddgit.aldo.katas;

import java.util.Arrays;

public class PersistentBugger {
    public static int persistence(final long number) {
        if (number < 10) {
            return 0;
        }

        final long newN = Arrays.stream(String.valueOf(number).split(""))
                .mapToLong(Long::valueOf)
                .reduce(1, (acc, next) -> acc * next);

        return persistence(newN) + 1;
    }
}
