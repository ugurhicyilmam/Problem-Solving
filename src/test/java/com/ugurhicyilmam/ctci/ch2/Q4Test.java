package com.ugurhicyilmam.ctci.ch2;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class Q4Test {

    @Test
    public void test1_createPartition() throws Exception {
        LinkedListNode head = new LinkedListNode(14);
        LinkedListNode k = new LinkedListNode(10);
        LinkedListNode node = new LinkedListNode(4);
        head.setNext(k);
        k.setNext(node);

        LinkedListNode partitioned = Q4.createPartitions(head, 10);

        assertNotNull(partitioned);
        assertTrue(10 > partitioned.getValue());
        assertFalse(10 > partitioned.getNext().getValue());
        assertFalse(10 > partitioned.getNext().getNext().getValue());
    }

    @Test
    public void test2_createPartition() throws Exception {
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode k = new LinkedListNode(2);
        LinkedListNode node = new LinkedListNode(3);
        head.setNext(k);
        k.setNext(node);

        LinkedListNode partitioned = Q4.createPartitions(head, 3);

        assertNotNull(partitioned);
        assertTrue(3 > partitioned.getValue());
        assertTrue(3 > partitioned.getNext().getValue());
        assertFalse(3 > partitioned.getNext().getNext().getValue());
    }

    @Test
    public void test3_createPartitionWhenNull() throws Exception {

        LinkedListNode partitioned = Q4.createPartitions(null, 10);

        assertNull(partitioned);
    }

    @Test
    public void test4_createPartitionWhenSingle() throws Exception {
        LinkedListNode head = new LinkedListNode(1);

        LinkedListNode partitioned = Q4.createPartitions(head, 10);

        assertNotNull(partitioned);
        assertEquals(1, partitioned.getValue());
    }

    @Test
    public void test4_preserveIntegrity() throws Exception {
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode k = new LinkedListNode(2);
        LinkedListNode node = new LinkedListNode(3);
        head.setNext(k);
        k.setNext(node);

        LinkedListNode partitioned = Q4.createPartitions(head, 3);

        assertNotNull(partitioned);

        Set<Long> values = new HashSet<>();
        values.add(partitioned.getValue());
        values.add(partitioned.getNext().getValue());
        values.add(partitioned.getNext().getNext().getValue());

        assertEquals(3, values.size());
    }

}
