package com.qaacademy.module3.tddgit.aldo.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleStringReversalTest {
    @Test
    public void basicTests(){
        assertEquals("srawedoc",SimpleStringReversal.solve("codewars"));
        assertEquals("edoc ruoy",SimpleStringReversal.solve("your code"));
        assertEquals("skco redo cruoy",SimpleStringReversal.solve("your code rocks"));
    }
}
