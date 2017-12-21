package com.ugurhicyilmam.ctci.ch2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q7Test {

    @Test
    public void findIntersectionNode() throws Exception {
        LinkedListNode list1Head = new LinkedListNode(0);
        LinkedListNode list1Node1  = new LinkedListNode(0);
        LinkedListNode list1Node2  = new LinkedListNode(0);
        LinkedListNode list1Node3  = new LinkedListNode(0);
        LinkedListNode list1Node4  = new LinkedListNode(0);
        LinkedListNode list1Node5  = new LinkedListNode(0);
        list1Head.setNext(list1Node1);
        list1Node1.setNext(list1Node2);
        list1Node2.setNext(list1Node3);
        list1Node3.setNext(list1Node4);
        list1Node4.setNext(list1Node5);

        LinkedListNode list2Head = new LinkedListNode(0);
        LinkedListNode list2Node1  = new LinkedListNode(0);
        LinkedListNode list2Node2  = new LinkedListNode(0);
        list2Head.setNext(list2Node1);
        list2Node1.setNext(list2Node2);
        list2Node2.setNext(list1Node4);

        LinkedListNode interceptionNode = Q7.findIntersectionNode(list1Head, list2Head);

        Assert.assertEquals(list1Node4, interceptionNode);
    }

}