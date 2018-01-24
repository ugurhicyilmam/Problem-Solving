package com.ugurhicyilmam.ctci.ch3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q5Test {
    @Test
    public void sort() throws Exception {
        Q5 stack = new Q5(4);
        stack.push(1);
        stack.push(5);
        stack.push(4);
        stack.push(2);

        stack.sort();

        assertEquals(1, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(4, stack.pop());
        assertEquals(5, stack.pop());
    }

}