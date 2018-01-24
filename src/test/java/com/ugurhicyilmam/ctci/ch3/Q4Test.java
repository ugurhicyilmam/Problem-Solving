package com.ugurhicyilmam.ctci.ch3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q4Test {

    @Test
    public void enqueueAndDequeue() throws Exception {
        Q4 queue = new Q4();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
    }

    @Test
    public void dequeue_failWhenEmpty() throws Exception {
        Q4 queue = new Q4();

        try {
            queue.dequeue();
            Assert.fail("should throw Q4.EmptyQueueException");
        } catch (Q4.EmptyQueueException ignore) {
        }
    }

}