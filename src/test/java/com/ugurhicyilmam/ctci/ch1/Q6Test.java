package com.ugurhicyilmam.ctci.ch1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q6Test {
    @Test
    public void test_compress() throws Exception {
        assertEquals("a2b1c5a3", Q6.compress("aabcccccaaa"));
        assertEquals("a", Q6.compress("a"));
        assertEquals("aa", Q6.compress("aa"));
        assertEquals("a3", Q6.compress("aaa"));
    }
}
