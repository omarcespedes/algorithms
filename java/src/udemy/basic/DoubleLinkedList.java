package udemy.basic;

public class DoubleLinkedList {
    Node last;
    Node first;

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()) {
            last = newNode;
        } else {
            first.previous = newNode;
            newNode.next = first;
        }
        first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
        }

        last = newNode;
    }

    public Node deleteFirst() {
        Node temp = first;
        if(isEmpty()) {
            return null;
        }

        if(first.next == null) { //only element in the list
            first = null;
            last = null;
        } else {
            first = first.next;
            first.next.previous = null;
        }

        return temp;
    }

    public boolean deleteKey(int key) {
        Node current = first;

        while(current.data != key) {
            if(current == null) {
                return false;
            }
            current = current.next;
        }

        if(current == first) {
            first = current.next;
        } else {
            current.previous.next = current.next;
        }

        if(current == last) {
            last = current.previous;
        } else {
            current.next.previous = current.previous;
        }

        return true;
    }

    public void display() {
        Node current = first;
        System.out.println("[ ");
        while(current != null) {
            current.print();
            current = current.next;
        }
        System.out.println("]");
    }
}
