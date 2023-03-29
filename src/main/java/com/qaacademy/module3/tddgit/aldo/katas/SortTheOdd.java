package com.qaacademy.module3.tddgit.aldo.katas;

import java.util.Arrays;
import java.util.Iterator;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        Iterator<Integer> iterator = Arrays.stream(array).filter(n -> n % 2 != 0).sorted().iterator();
        return Arrays.stream(array).map(n -> n % 2 == 0 ? n : iterator.next()).toArray();
    }
}
