package com.cxdeng.LinkedList;

public class MergeTwoSortedLists21 {
    public ListNode mergeTwoLists01(ListNode p1, ListNode p2) {
        ListNode sentinel = new ListNode(-1, null);
        ListNode p = sentinel;

        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }

        if (p1 != null) {
            p.next = p1;
        }
        if (p2 != null) {
            p.next = p2;
        }

        return sentinel.next;
    }


    public ListNode mergeTwoLists02(ListNode p1, ListNode p2) {
        if (p1 == null) {
            return p2;
        } else if (p2 == null) {
            return p1;
        }

        if (p1.val < p2.val) {
            p1.next = mergeTwoLists02(p1.next, p2);
            return p1;
        } else {
            p2.next = mergeTwoLists02(p1, p2.next);
            return p2;
        }
    }
}
