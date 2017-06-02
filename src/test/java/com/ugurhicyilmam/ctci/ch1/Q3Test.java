package com.ugurhicyilmam.ctci.ch1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q3Test {
    @Test
    public void test_urlify() throws Exception {
        assertEquals("Mr%20John%20Smith", Q3.urlify("Mr John Smith"));
        assertEquals("hello%20%20world", Q3.urlify("hello  world"));
        assertEquals("Mr%20John%20Smith", Q3.urlify("Mr John Smith      "));
        assertEquals("", Q3.urlify("      "));
        assertEquals("", Q3.urlify(null));
    }

}