package com.ugurhicyilmam.ctci.ch2;

import org.junit.Test;

import static com.ugurhicyilmam.ctci.ch2.TestUtil.getList;
import static org.junit.Assert.*;

public class Q2Test {
    @Test
    public void test_kthToLast_When3rd() throws Exception {
        LinkedListNode head = getList(10);

        LinkedListNode element = Q2.kthToLast(head, 3);

        assertEquals(6, element.getValue());
    }

    @Test
    public void test_kthToLast_When5th() throws Exception {
        LinkedListNode head = getList(10);

        LinkedListNode element = Q2.kthToLast(head, 5);

        assertEquals(4, element.getValue());
    }


    @Test
    public void test_kthToLast_WhenFirst() throws Exception {
        LinkedListNode head = getList(10);

        LinkedListNode element = Q2.kthToLast(head, 9);

        assertEquals(0, element.getValue());
    }
}