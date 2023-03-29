package com.qaacademy.module3.tddgit.aldo.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplesOf3Or5Test {
    @Test
    public void test() {
        assertEquals(23, new MultiplesOf3Or5().solution(10));
    }
}
