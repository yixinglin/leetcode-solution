package org.example.list;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LinkedListCycle {


    // Fast-slow pointers
    public boolean solution(ListNode head) {
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;   // Fast pointer is shifted by 2
            slow = slow.next;       // Slow pointers is shifted by 1
            if(fast == slow) {      // There is a loop if the fast pointer meets the slow pointer.
                return true;
            }
        }
        return false;
    }

    // HashSet solution.
    public boolean myFirstIdea(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        ListNode cur = head;
        while(cur != null) {
            if (visited.contains(cur)) {
                return true;
            }
            visited.add(cur);
            cur = cur.next;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,0,-4};
        ListNode head = LinkedListCycle.buildLinkedList(arr, 1);
        // ListNode.printLinkedList(head);
        LinkedListCycle obj = new LinkedListCycle();
        System.out.println(obj.myFirstIdea(head));
        System.out.println(obj.solution(head));
    }

    public static ListNode buildLinkedList(int[] arr, int pos) {
        ListNode head = new ListNode();
        ListNode curNode = head;
        ListNode cyc = null;
        for (int i = 0; i < arr.length; i++) {
            curNode.val = arr[i];
            if (i == pos) {
                cyc = curNode;
            }

            if (i == arr.length-1) {
                curNode.next = cyc;
            } else {
                curNode.next = new ListNode();
            }
            curNode = curNode.next;
        }
        return head;
    }


}
