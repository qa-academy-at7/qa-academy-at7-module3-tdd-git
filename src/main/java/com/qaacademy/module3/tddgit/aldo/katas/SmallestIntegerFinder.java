package com.qaacademy.module3.tddgit.aldo.katas;

import java.util.stream.IntStream;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        return IntStream.of(args).min().orElse(-1);
    }
}
