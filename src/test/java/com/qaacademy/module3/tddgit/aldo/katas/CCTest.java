package com.qaacademy.module3.tddgit.aldo.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CCTest {
    @Test
    public void testSomething() {
        assertEquals(4, CC.charCount("fizzbuzz", 'z'));
        assertEquals(4, CC.charCount("FIZZBUZZ", 'z'));
    }
}
