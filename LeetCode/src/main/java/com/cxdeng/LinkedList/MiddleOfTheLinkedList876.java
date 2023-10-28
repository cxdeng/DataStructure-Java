package com.cxdeng.LinkedList;

public class MiddleOfTheLinkedList876 {
    public ListNode middleNode(ListNode head) {
        ListNode low = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            low = low.next;
            fast = fast.next.next;
        }

        return low;
    }
}
