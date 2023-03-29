package com.qaacademy.module3.tddgit.aldo.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheSmallestIntegerInTheArrayTest {
    @Test
    public void example1() {
        int expected = 11;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78, 56, 232, 12, 11, 43});
        assertEquals(expected, actual);
    }
}
