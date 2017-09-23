import sort.InsertionSort;
import udemy.basic.DoubleLinkedList;
import udemy.basic.LinkedListUtils;
import udemy.basic.Node;
import udemy.basic.SingleLinkedList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insertFirst(3);
        dll.insertFirst(4);
        dll.insertLast(8);
        dll.insertFirst(45);
        //dll.display();
        dll.deleteFirst();
        //dll.display();
        dll.deleteKey(8);
        dll.deleteKey(4);
        //dll.display();

        LinkedListUtils listUtils = new LinkedListUtils();

        SingleLinkedList sl1 = new SingleLinkedList();
        SingleLinkedList sl2 = new SingleLinkedList();
        sl1.insertSorted(6);
        sl1.insertSorted(5);
        sl1.insertSorted(4);
        sl1.insertSorted(3);
        sl2.insertSorted(2);
        sl2.insertSorted(48);
        sl2.insertSorted(2);

        //sl1.display();
        //sl2.display();

        Node merged = listUtils.mergeLinkedLists(sl1.head, sl2.head);
        SingleLinkedList sl3 = new SingleLinkedList();
        sl3.head = merged;
        sl3.display();
    }
}
