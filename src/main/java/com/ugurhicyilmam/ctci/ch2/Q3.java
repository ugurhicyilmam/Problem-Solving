package com.ugurhicyilmam.ctci.ch2;

final class Q3 {

    private Q3() {

    }

    static void deleteNode(LinkedListNode node) {
        node.setValue(node.getNext().getValue());
        node.setNext(node.getNext().getNext());
    }
}
