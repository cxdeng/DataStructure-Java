package com.cxdeng.LinkedList;

public class RemoveDuplicatesFromSortedList83 {
    public ListNode deleteDuplicates01(ListNode head) {

        if (head == null || head.next == null){
            return head;
        }

        ListNode p1 = head;
        ListNode p2 = head.next;

        while (p2 != null){
            if (p1.val == p2.val){
                p1.next = p2.next;
            }else {
                p1 = p1.next;
            }
            p2 = p2.next;
        }

        return head;
    }


    public ListNode deleteDuplicates02(ListNode p) {

        if (p == null || p.next == null){
            return p;
        }

        if (p.val == p.next.val){
            return deleteDuplicates02(p.next);
        } else {
            p.next = deleteDuplicates01(p.next);
            return p;
        }

    }
}
