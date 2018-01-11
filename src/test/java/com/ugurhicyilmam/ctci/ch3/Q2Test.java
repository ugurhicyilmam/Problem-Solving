package com.ugurhicyilmam.ctci.ch3;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Q2Test {

    @Test
    public void calculateCorrectMin() throws Exception {
        Q2.Stack stack = new Q2.Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        assertEquals(1, stack.min());
        assertEquals(4, stack.pop());
        assertEquals(1, stack.min());
        assertEquals(3, stack.pop());
        assertEquals(1, stack.min());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.min());
        assertEquals(1, stack.pop());

        try {
            assertEquals(1, stack.min());
            fail("EmptyStackException should be thrown");
        } catch (EmptyStackException ignored) {
        }
    }

    @Test
    public void calculateCorrectMinReversed() throws Exception {
        Q2.Stack stack = new Q2.Stack();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        assertEquals(1, stack.min());
        assertEquals(1, stack.pop());
        assertEquals(2, stack.min());
        assertEquals(2, stack.pop());
        assertEquals(3, stack.min());
        assertEquals(3, stack.pop());
        assertEquals(4, stack.min());
        assertEquals(4, stack.pop());

        try {
            assertEquals(4, stack.min());
            fail("EmptyStackException should be thrown");
        } catch (EmptyStackException ignored) {
        }
    }

}