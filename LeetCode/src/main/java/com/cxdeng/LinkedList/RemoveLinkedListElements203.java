package com.cxdeng.LinkedList;

public class RemoveLinkedListElements203 {

    public static ListNode removeElements01(ListNode head, int val) {
        ListNode sentinel = new ListNode(-1, head);

        ListNode p1 = sentinel;
        ListNode p2 = sentinel.next;

        while (p2 != null) {
            if (p2.val == val) {
                p1.next = p2.next;
            } else {
                p1 = p1.next;
            }
            p2 = p1.next;
        }

        return sentinel.next;
    }


    public static ListNode removeElements02(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        if (head.val == val){
            return removeElements02(head.next, val);
        }else {
            head.next = removeElements02(head.next, val);
            return head;
        }
    }

}
