package com.qaacademy.module3.tddgit.aldo.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheMissingLetterTest {
    @Test
    public void exampleTests() {
        assertEquals('e', MissingLetter.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', MissingLetter.findMissingLetter(new char[] { 'O','Q','R','S' }));
    }
}
