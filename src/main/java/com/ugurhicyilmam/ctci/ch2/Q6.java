package com.ugurhicyilmam.ctci.ch2;

class Q6 {

    private static LinkedListNode runner;

    private Q6() {

    }

    static boolean isPalindrome(LinkedListNode head) {
        runner = head;
        return isPalindromeUtil(head);
    }

    private static boolean isPalindromeUtil(LinkedListNode node) {


        if (node == null) {
            return true;
        }

        boolean isPalindrome = isPalindromeUtil(node.getNext());

        if (!isPalindrome) {
            return false;
        }

        isPalindrome = (node.getValue() == runner.getValue());

        runner = runner.getNext();

        return isPalindrome;
    }


}
