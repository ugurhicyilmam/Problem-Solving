package com.ugurhicyilmam.ctci.ch3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q3Test {
    @Test
    public void pop() throws Exception {
        Q3 stack = new Q3(2);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    public void popAt() throws Exception {
        Q3 stack = new Q3(2);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        assertEquals(2, stack.popAt(0));
        assertEquals(4, stack.popAt(1));
        assertEquals(6, stack.popAt(2));

        assertEquals(5, stack.pop());
        assertEquals(3, stack.pop());
        assertEquals(1, stack.pop());
    }

}