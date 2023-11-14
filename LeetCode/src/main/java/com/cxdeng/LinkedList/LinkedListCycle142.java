package com.cxdeng.LinkedList;

public class LinkedListCycle142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode low = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            low = low.next;

            if (fast == low){
                low = head;
                while (fast != low){
                    fast = fast.next;
                    low = low.next;
                }

                return low;
            }
        }

        return null;
    }
}
