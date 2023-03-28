package com.qaacademy.module3.tddgit.aldo.katas;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        List<Integer> numbersList = Stream.of(numbers.split(" ")).map(Integer::parseInt).toList();
        return String.format("%d %d", Collections.max(numbersList), Collections.min(numbersList));
    }
}
