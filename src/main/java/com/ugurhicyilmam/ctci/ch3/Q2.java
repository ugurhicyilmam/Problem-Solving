package com.ugurhicyilmam.ctci.ch3;

import java.util.EmptyStackException;

final class Q2 {
    static class Stack {
        private Integer min;
        private Node top;

        void push(int value) {
            if (this.top == null) {
                this.top = new Node(value, null, null);
                this.min = value;
            } else {
                this.top = new Node(value, min, this.top);
                this.min = (value < this.min) ? value : this.min;
            }
        }

        int pop() {
            if (this.top == null) {
                throw new EmptyStackException();
            }
            Node temp = this.top;
            this.top = this.top.next;
            if (this.min == temp.value) {
                this.min = temp.prevMin;
            }
            return temp.value;
        }

        int min() {
            if (this.min == null) {
                throw new EmptyStackException();
            }
            return this.min;
        }


        class Node {
            private final int value;
            private final Integer prevMin;
            private final Node next;

            Node(int value, Integer prevMin, Node next) {
                this.value = value;
                this.prevMin = prevMin;
                this.next = next;
            }
        }
    }
}
