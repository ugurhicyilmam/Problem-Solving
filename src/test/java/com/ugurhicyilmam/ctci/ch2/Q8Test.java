package com.ugurhicyilmam.ctci.ch2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q8Test {
    @Test
    public void beginningOfLoop() throws Exception {
        LinkedListNode head = new LinkedListNode(0);
        LinkedListNode node1 = new LinkedListNode(0);
        LinkedListNode node2 = new LinkedListNode(0);
        LinkedListNode node3 = new LinkedListNode(0);
        LinkedListNode node4 = new LinkedListNode(0);
        LinkedListNode loopHead = new LinkedListNode(0);
        LinkedListNode node5 = new LinkedListNode(0);
        LinkedListNode node6 = new LinkedListNode(0);
        LinkedListNode node7 = new LinkedListNode(0);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(loopHead);
        loopHead.setNext(node5);
        node5.setNext(node6);
        node6.setNext(node7);
        node7.setNext(loopHead);

        LinkedListNode detectedLoop = Q8.beginningOfLoop(head);

        Assert.assertEquals(loopHead, detectedLoop);
    }

}