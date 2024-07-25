package LeetCode.LinkedList;

public class MergeTwoSortedLists_21_02 {
    public ListNode mergeTwoLists(ListNode p1, ListNode p2) {
        if (p1 == null) {
            return p2;
        }

        if (p2 == null) {
            return p1;
        }

        if (p1.val <= p2.val) {
            p1.next = mergeTwoLists(p1.next, p2);
            return p1;
        } else {
            p2.next = mergeTwoLists(p1, p2.next);
            return p2;
        }
    }
}
