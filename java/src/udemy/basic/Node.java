package udemy.basic;

public class Node {
    public int data;
    public char charData;
    public Node next = null;
    public Node previous = null;

    public void print() {
        System.out.println("{ " + data + " }");
    }
}
