package LeetCode.LinkedList;

public class RemoveDuplicatesFromSortedList_83_02 {
    public ListNode deleteDuplicates(ListNode p) {
        if (p == null || p.next == null) {
            return p;
        }

        if (p.val == p.next.val) {
            return deleteDuplicates(p.next);
        }else {
            p.next = deleteDuplicates(p.next);
            return p;
        }
    }
}
