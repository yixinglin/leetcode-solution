package org.example.list;
public class ListNode {
    int val;
    ListNode next;

    ListNode() {

    }

    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode buildLinkedList(int[] arr) {
        ListNode head = new ListNode();
        ListNode curNode = head;
        for (int i = 0; i < arr.length; i++) {
            curNode.val = arr[i];
            if (i == arr.length-1) {
                curNode.next = null;
            } else {
                curNode.next = new ListNode();
            }
            curNode = curNode.next;
        }
        return head;
    }

    public static void printLinkedList(ListNode head) {
        ListNode curNode = head;
        while (curNode != null) {
            System.out.print(curNode.val + " ");
            curNode  = curNode.next;
        }
        System.out.println();
    }
  }

