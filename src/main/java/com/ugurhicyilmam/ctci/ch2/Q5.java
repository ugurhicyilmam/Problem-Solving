package com.ugurhicyilmam.ctci.ch2;

class Q5 {

    private Q5() {

    }

    static LinkedListNode sumLists(LinkedListNode list1, LinkedListNode list2) {

        LinkedListNode resultHead = null;
        LinkedListNode result = null;
        LinkedListNode list1Current = list1;
        LinkedListNode list2Current = list2;
        long residual = 0;
        while (list1Current != null || list2Current != null) {
            long value1 = 0;
            long value2 = 0;
            if (list1Current != null) {
                value1 = list1Current.getValue();
                list1Current = list1Current.getNext();
            }
            if (list2Current != null) {
                value2 = list2Current.getValue();
                list2Current = list2Current.getNext();
            }

            long sum = value1 + value2 + residual;

            residual = sum / 10;

            LinkedListNode node = new LinkedListNode(sum % 10);

            if(result == null) {
                resultHead = node;
                result = node;
            } else {
                result.setNext(node);
                result = node;
            }
        }

        if (residual > 0) {
            result.setNext(new LinkedListNode(residual));
        }

        return resultHead;
    }
}
