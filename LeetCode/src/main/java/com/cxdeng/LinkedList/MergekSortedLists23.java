package com.cxdeng.LinkedList;

public class MergekSortedLists23 {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }

        return split(lists, 0, lists.length - 1);
    }

    private ListNode mergeTwoLists(ListNode p1, ListNode p2) {
        if (p1 == null) {
            return p2;
        } else if (p2 == null) {
            return p1;
        }

        if (p1.val < p2.val) {
            p1.next = mergeTwoLists(p1.next, p2);
            return p1;
        } else {
            p2.next = mergeTwoLists(p1, p2.next);
            return p2;
        }
    }

    /**
     * 返回合并后的链表
     *
     * @param lists 合并前的链表
     * @param left  左边界
     * @param right 右边界
     * @return 返回合并后的链表
     */
    private ListNode split(ListNode[] lists, int left, int right) {

        // 数组内只有一个元素时
        if (left == right) {
            return lists[left];
        }

        int mid = (left + right) >>> 1;
        ListNode leftLists = split(lists, left, mid);
        ListNode rightLists = split(lists, mid + 1, right);

        return mergeTwoLists(leftLists, rightLists);
    }
}
