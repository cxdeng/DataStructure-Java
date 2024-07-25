package LeetCode.LinkedList;

public class RemoveDuplicatesFromSortedList_82_01 {
    public ListNode deleteDuplicates(ListNode p) {
        if (p == null || p.next == null) {
            return p;
        }

        if (p.val == p.next.val) {
            ListNode cur = p.next.next;
            while (cur != null && cur.val == p.val) {
                cur = cur.next;
            }
            return deleteDuplicates(cur);
        } else {
            p.next = deleteDuplicates(p.next);
            return p;
        }
    }
}
