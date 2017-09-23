package udemy.basic;

import java.util.LinkedList;

public class LinkedListUtils {
    public int getSizeOf(Node node) {
        if(node == null) {
            return 0;
        }
        int count = 1;
        while(node.next != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    public Node reverse(Node head) {
        Node current = head;
        Node next;
        Node prev = null;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    int compareStrings(Node str1, Node str2) {
        Node current1 = str1;
        Node current2 = str2;

        while(current1 != null && current2 != null && current1.charData == current2.charData) {
            current1 = current1.next;
            current2 = current2.next;
        }

        if(current1 == null && current2 == null) {
            return 0;
        } else if(current1 != null && current2 != null) {
            return current1.charData > current2.charData? 1 : -1;
        } else if(current1 == null) {
            return -1;
        } else  {
            return 1;
        }
    }

    public Node mergeLinkedLists(Node firstList, Node secondList) {
        Node current1 = firstList;
        Node next1;
        Node current2 = secondList;
        Node next2;

        while (current1 != null && current2 != null) {
            next1 = current1.next;
            next2 = current2.next;
            current1.next = current2;
            current2.next = next1;

            current1 = next1;
            current2 = next2;
        }

        return firstList;
    }
}
