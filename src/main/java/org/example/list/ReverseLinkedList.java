package org.example.list;
public class ReverseLinkedList {

    // Iterative approach.
    public ListNode solution1(ListNode head) {
        ListNode prev = null;  // Previous pointer
        ListNode cur = head;    // Current pointer
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    // Recursive approach
    public ListNode solution2(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode newHead = head;
        if (head.next != null) {
            newHead = solution2(head.next);
            head.next.next = head;  // The next Node should point to the previous node.
        }
        head.next = null;
        return newHead;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        ListNode head = ListNode.buildLinkedList(arr);
        ListNode.printLinkedList(head);

        ReverseLinkedList obj = new ReverseLinkedList();
        ListNode ans = obj.solution2(head);
        ListNode.printLinkedList(ans);

    }
}
