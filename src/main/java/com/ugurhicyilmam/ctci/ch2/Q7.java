package com.ugurhicyilmam.ctci.ch2;

class Q7 {
    private Q7() {
    }

    static LinkedListNode findIntersectionNode(LinkedListNode list1, LinkedListNode list2) {
        if (list1 == null || list2 == null) {
            return null;
        }

        long list1Size = listSize(list1);
        long list2Size = listSize(list2);
        long difference = Math.abs(list1Size - list2Size);

        LinkedListNode longer = (list1Size > list2Size) ? list1 : list2;
        LinkedListNode shorter = (longer == list1) ? list2 : list1;

        for (int i = 0; i < difference; i++) {
            if (longer == null) {
                return null;
            }
            longer = longer.getNext();
        }

        while (longer != null && shorter != null) {
            if (longer == shorter) {
                return longer;
            }
            longer = longer.getNext();
            shorter = shorter.getNext();
        }
        return null;
    }

    private static long listSize(LinkedListNode list) {
        long size = 0;
        if (list == null) {
            return size;
        }

        LinkedListNode currentNode = list;

        while (currentNode != null) {
            size++;
            currentNode = currentNode.getNext();
        }
        return size + 1;
    }
}
