/*
Singly-linked list node
 */

public class Node {
    private Node next;
    private Student data;

    public Node(Student data) {
        this.next = null; // redundant
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Student getData() {
        return data;
    }

    public void setData(Student data) {
        this.data = data;
    }

    public String toString() {
        return this.getData().toString();
    }
}
