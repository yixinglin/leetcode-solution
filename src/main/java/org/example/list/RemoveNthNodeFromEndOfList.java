package org.example.list;

import java.util.List;

public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode left = dummy, right = head;
        while(n > 0) {
            right = right.next;
            n--;
        }

        while(right != null) {
            right = right.next;
            left = left.next;
        }

        left.next = left.next.next;
        return dummy.next;
    }

    public ListNode myFirstIdea(ListNode head, int n) {
        ListNode cur = head;
        ListNode prev = null;
        int i = 0;
        while(cur != null) {
            cur = cur.next;
            i++;
        }
        int len = i;
        int nt = len - n;
        if (nt == 0) {
            return head.next;
        } else if(nt <0) {
            return head;
        }

        cur = head;
        i=0;
        while(cur != null) {
            if (i > 0 && i == nt) {
                prev.next = cur.next;
                break;
            }
            prev = cur;
            cur = cur.next;
            i++;
        }

        return head;
    }

    public static void main(String[] args) {
        RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
        ListNode head,ans;
        head = ListNode.buildLinkedList(new int[] {1,2,3,4,5});
        ans = removeNthNodeFromEndOfList.removeNthFromEnd(head, 2);
        ListNode.printLinkedList(ans);
        head = ListNode.buildLinkedList(new int[] {1, 2});
        ans = removeNthNodeFromEndOfList.removeNthFromEnd(head, 1);
        ListNode.printLinkedList(ans);
        head = ListNode.buildLinkedList(new int[] {1});
        ans = removeNthNodeFromEndOfList.removeNthFromEnd(head, 1);
        ListNode.printLinkedList(ans);

    }
}
