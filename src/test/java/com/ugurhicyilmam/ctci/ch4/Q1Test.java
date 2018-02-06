package com.ugurhicyilmam.ctci.ch4;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q1Test {
    @Test
    public void pathExists_WhenExists() throws Exception {
        Node node1 = new Node("");
        Node node2 = new Node("");
        Node node3 = new Node("");
        Node node4 = new Node("");
        Node node5 = new Node("");
        Node node6 = new Node("");
        node1.addNode(node2);
        node2.addNode(node3);
        node3.addNode(node4);
        node4.addNode(node5);
        node4.addNode(node6);
        assertTrue(Q1.pathExists(node1, node6));
    }

    @Test
    public void pathExists_WhenNotExists() throws Exception {
        Node node1 = new Node("");
        Node node2 = new Node("");
        Node node3 = new Node("");
        Node node4 = new Node("");
        Node node5 = new Node("");
        Node node6 = new Node("");
        node1.addNode(node2);
        node2.addNode(node3);
        node4.addNode(node3);
        node4.addNode(node5);
        node4.addNode(node6);
        assertFalse(Q1.pathExists(node1, node6));
    }

    @Test
    public void pathExists_WhenSame() throws Exception {
        Node node1 = new Node("");
        assertTrue(Q1.pathExists(node1, node1));
    }

}