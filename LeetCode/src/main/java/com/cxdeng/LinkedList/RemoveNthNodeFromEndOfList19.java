package com.cxdeng.LinkedList;

public class RemoveNthNodeFromEndOfList19 {

    public ListNode removeNthFromEnd01(ListNode head, int n) {
        ListNode sentinel = new ListNode(-1, head);
        recursion(sentinel, n);

        return sentinel.next;
    }

    private int recursion(ListNode p, int n) {
        if (p == null) {
            return 0;
        }

        // 返回下一个节点的倒数位置
        int nth = recursion(p.next, n);
        if (nth == n) {
            p.next = p.next.next;
        }

        return nth + 1;
    }


    public ListNode removeNthFromEnd02(ListNode head, int n) {
        ListNode sentinel = new ListNode(-1, head);
        ListNode p1 = sentinel;
        ListNode p2 = sentinel;

        for (int i = 0; i < n + 1; i++) {
            p2 = p2.next;
        }

        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        p1.next = p1.next.next;

        return sentinel.next;
    }

}
