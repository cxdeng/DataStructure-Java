package LeetCode.LinkedList;

public class MergeTwoSortedLists_21_01 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p1 = list1;
        ListNode p2 = list2;

        ListNode sentinel = new ListNode(-1, null);
        ListNode p = sentinel;

        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                p.next = p1;
                p1 = p1.next;
            }else {
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }

        if (p1 == null){
            p.next = p2;
        }else {
            p.next = p1;
        }

        return sentinel.next;
    }
}
