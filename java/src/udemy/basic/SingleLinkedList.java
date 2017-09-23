package udemy.basic;

public class SingleLinkedList {
    public Node head;

    public void prepend(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if(head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        Node current = head;
        while(current != null) {
            current.print();
            current = current.next;
        }
    }

    public void insertSorted(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if(head == null) {
            head = newNode;
        } else {
            Node current = head;
            Node prev = null;
            while(current != null && current.data < data ) {
                prev = current;
                current = current.next;
            }

            if(current == head) {
                newNode.next = head;
                head = newNode;
            } else {
                prev.next = newNode;
                newNode.next = current;
            }
        }
    }
}
