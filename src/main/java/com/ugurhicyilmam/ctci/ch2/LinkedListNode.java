package com.ugurhicyilmam.ctci.ch2;

class LinkedListNode {
    private LinkedListNode next;
    private long value;

    LinkedListNode(long value) {
        this.value = value;
    }

    LinkedListNode getNext() {
        return next;
    }

    void setNext(LinkedListNode next) {
        this.next = next;
    }

    long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}