/*
    Linked list class, fully encapsulated and containing an object as data
    Requires Node.java
 */
public class LinkedList
{
    private Node start;
    //private Node end; // optional

    public LinkedList(Student s)
    {
        start = new Node(s);
    }

    public LinkedList(Node start)
    {
        this.start = start;
    }

    public boolean isEmpty()
    {
        return start == null;
    }

    public Node getStart() {
        return start;
    }

    public void setStart(Node s) {
        this.start = s;
    }

    /* optional
    public void setStart(Node start) {
        this.start = start;
    }
    */
    public void add(Student s) // add a new Student object to the linked list
    {
        if(this.isEmpty()) {
            this.setStart(s);
            return;
        }
        Node temp = start; // or this.getStart()
        while(temp.getNext() != null)       // or, while(temp.hasNext())
        {
            temp.setNext(temp.getNext());   // non-encapsulated version: temp=temp.next;
        }
        temp.setNext(new Node(s));

    }
    public String toString()
    {
        String output = start.getData().toString();
        Node temp = start;
        while (temp != null)
        {
            System.out.print(", " + temp.getData().toString());
            temp = temp.getNext();
        }
        return output;
    }
}
