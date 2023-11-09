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

    /* optional
    public void setStart(Node start) {
        this.start = start;
    }
    */
    public void add(Student s) // add a new Student object to the linked list
    {
        if(this.isEmpty()) {
            this.setStart(s);
        }

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
