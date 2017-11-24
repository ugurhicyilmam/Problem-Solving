package com.ugurhicyilmam.ctci.ch2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Q5Test {

    @Test
    public void test1_sumLists() throws Exception {
        LinkedListNode list1Head = new LinkedListNode(1);
        LinkedListNode list1Node1 = new LinkedListNode(2);
        LinkedListNode list1Node2 = new LinkedListNode(3);
        list1Head.setNext(list1Node1);
        list1Node1.setNext(list1Node2);

        LinkedListNode list2Head = new LinkedListNode(1);
        LinkedListNode list2Node1 = new LinkedListNode(2);
        LinkedListNode list2Node2 = new LinkedListNode(3);
        list2Head.setNext(list2Node1);
        list2Node1.setNext(list2Node2);

        LinkedListNode result = Q5.sumLists(list1Head, list2Head);

        assertEquals(2, result.getValue());
        assertEquals(4, result.getNext().getValue());
        assertEquals(6, result.getNext().getNext().getValue());
    }

    @Test
    public void test2_sumLists() throws Exception {
        LinkedListNode list1Head = new LinkedListNode(5);
        LinkedListNode list1Node1 = new LinkedListNode(5);
        LinkedListNode list1Node2 = new LinkedListNode(5);
        list1Head.setNext(list1Node1);
        list1Node1.setNext(list1Node2);

        LinkedListNode list2Head = new LinkedListNode(5);
        LinkedListNode list2Node1 = new LinkedListNode(5);
        LinkedListNode list2Node2 = new LinkedListNode(5);
        list2Head.setNext(list2Node1);
        list2Node1.setNext(list2Node2);

        LinkedListNode result = Q5.sumLists(list1Head, list2Head);

        assertEquals(0, result.getValue());
        assertEquals(1, result.getNext().getValue());
        assertEquals(1, result.getNext().getNext().getValue());
        assertEquals(1, result.getNext().getNext().getNext().getValue());
    }

    @Test
    public void test3_sumLists() throws Exception {
        LinkedListNode list1Head = new LinkedListNode(5);
        LinkedListNode list1Node1 = new LinkedListNode(5);
        list1Head.setNext(list1Node1);

        LinkedListNode list2Head = new LinkedListNode(5);
        LinkedListNode list2Node1 = new LinkedListNode(5);
        LinkedListNode list2Node2 = new LinkedListNode(5);
        list2Head.setNext(list2Node1);
        list2Node1.setNext(list2Node2);

        LinkedListNode result = Q5.sumLists(list1Head, list2Head);

        assertEquals(0, result.getValue());
        assertEquals(1, result.getNext().getValue());
        assertEquals(6, result.getNext().getNext().getValue());
    }

    @Test
    public void test4_sumLists() throws Exception {
        LinkedListNode list1Head = new LinkedListNode(1);

        LinkedListNode result = Q5.sumLists(list1Head, null);

        assertEquals(1, result.getValue());
    }

    @Test
    public void test5_sumLists() throws Exception {

        LinkedListNode result = Q5.sumLists(null, null);

        assertNull(result);
    }

}