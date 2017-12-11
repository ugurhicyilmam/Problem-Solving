package com.ugurhicyilmam.ctci.ch2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Q6Test {
    @Test
    public void isPalindromeWhenTrue() throws Exception {
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode node1 = new LinkedListNode(2);
        LinkedListNode node2 = new LinkedListNode(3);
        LinkedListNode node3 = new LinkedListNode(2);
        LinkedListNode node4 = new LinkedListNode(1);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        assertTrue(Q6.isPalindrome(head));
    }


    @Test
    public void isPalindromeWhenFalse() throws Exception {
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode node1 = new LinkedListNode(2);
        LinkedListNode node2 = new LinkedListNode(3);
        LinkedListNode node3 = new LinkedListNode(4);
        LinkedListNode node4 = new LinkedListNode(5);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        assertFalse(Q6.isPalindrome(head));
    }

    @Test
    public void isPalindromeWhenSingle() throws Exception {
        LinkedListNode head = new LinkedListNode(1);

        assertTrue(Q6.isPalindrome(head));
    }

    @Test
    public void isPalindromeWhenNull() throws Exception {
        assertTrue(Q6.isPalindrome(null));
    }
}