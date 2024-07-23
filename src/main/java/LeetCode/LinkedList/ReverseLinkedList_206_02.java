package LeetCode.LinkedList;

public class ReverseLinkedList_206_02 {

    public ListNode reverseList(ListNode head) {
        List list1 = new List(head);
        List list2 = new List(null);

        while (true) {
            ListNode first = list1.removeFirst();
            if (first == null) {
                break;
            }

            list2.addFirst(first);
        }

        return list2.head;
    }

    static class List {
        ListNode head;

        public List(ListNode head) {
            this.head = head;
        }

        public void addFirst(ListNode firstNode) {
            firstNode.next = this.head;
            this.head = firstNode;
        }

        public ListNode removeFirst() {
            ListNode firstNode = this.head;
            if (firstNode != null) {
                this.head = firstNode.next;
            }

            return firstNode;
        }
    }
}