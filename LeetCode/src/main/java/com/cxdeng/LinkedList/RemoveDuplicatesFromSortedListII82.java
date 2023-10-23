package com.cxdeng.LinkedList;

public class RemoveDuplicatesFromSortedListII82 {

    public ListNode deleteDuplicates01(ListNode p) {
        if (p == null || p.next == null) {
            return p;
        }

        if (p.val == p.next.val) {
            ListNode node = p.next.next;

            while (node != null && p.val == node.val) {
                node = node.next;
            }
            return deleteDuplicates01(node);
        } else {
            p.next = deleteDuplicates01(p.next);
            return p;
        }
    }


    public ListNode deleteDuplicates02(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode sentinel = new ListNode(-1, head);
        ListNode p1 = sentinel;
        ListNode p2, p3;

        while ((p2 = p1.next) != null && (p3 = p2.next) != null) {
            if (p2.val == p3.val) {
                while (p3 != null && p3.val == p2.val){
                    p3 = p3.next;
                }

                p1.next = p3;
            }else  {
                p1 = p1.next;
            }
        }

        return sentinel.next;
    }

}
