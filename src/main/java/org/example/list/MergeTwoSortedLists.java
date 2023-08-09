package org.example.list;

public class MergeTwoSortedLists {

    public ListNode solution(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        while(list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else  {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if (list1 == null) {
            tail.next = list2;
        } else if (list2 == null) {
            tail.next = list1;
        }
        return dummy.next;
    }


    public static void main(String[] args) {
        ListNode head1 = ListNode.buildLinkedList(new int[]{1,2,4});
        ListNode head2 = ListNode.buildLinkedList(new int[]{1,3,4, 5});

        ListNode ans = new MergeTwoSortedLists().solution(head1, head2);
        ListNode.printLinkedList(ans);
    }
}
