public class LinkedList
{
    Node start;
    int size;

    public LinkedList()
    {
        start = null;
        size = 0;
    } // creates an empty LL

    public LinkedList(int data) // creates a LL with a starting node
    {
        Node newNode = new Node(data);
        newNode.next = null;
        start = newNode;
        size = 1;
    }

    public boolean isEmpty()
    {
        return start == null;
    }

    public void append(int data)
    {
        Node newNode = new Node(data);
        if (isEmpty())
        {
            start = newNode;
            size = 1;
            return;
        }
        Node temp = start;
        while (temp.hasNext()) // or while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }

    public boolean delete(int dataToDelete)
    {
        if (isEmpty())
        {
            System.out.println("Error-linked list is empty");
            return false;
        }
        if (start.data == dataToDelete)
        {
            start = start.next;
            size--;
            return true;
        }
        Node prev = start;
        Node current = start.next;
        while (current != null)
        {
            if (current.data == dataToDelete)
            {
                prev.next = current.next;
                size--;
                return true;
            }
            prev = prev.next;
            current = current.next;
        }
        return false;
    }

    public int deleteAt(int place)
    {
        if (isEmpty())
        {
            System.out.println("Error-linked list is empty");
            return 0;
        }
        Node temp = start;
        int counter = 0;
        int delData = 0;
        place = Math.abs(place); // no negatives
        /* redundant! why?
        if( place == 0 )
        {
            delData = start.data;
            start = start.next;
            size--;
            return delData;
        }
        */
        while(counter < size)
        {
            if(counter == place)
            {
                delData = temp.data;
                temp = temp.next;
                size--;
                break;
            }
            temp = temp.next;
            counter++;
        }
        return delData;
    }

    public void printLinkedList()
    {
        Node temp = start;
        System.out.print("start");
        while (temp != null)
        {
            System.out.print(" -> " + temp.data);
            temp = temp.next;
        }
        System.out.println(" -> null\tsize: " + size);
    }

    private void insertAt(int data, int place)
    {
        Node newNode = new Node(data);
        if (isEmpty())
        {
            start = newNode;
            size = 1;
            return;
        }
        Node temp = start;
        int counter = 1;
        while (counter < place)
        {
            temp = temp.next;
            counter++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void insertBefore(int data, int place)
    {
        insertAt(data, place - 1);
    }

    public void insertAfter(int data, int place)
    {
        insertAt(data, place);
    }

    // insert after a value in the LL
    public void insert(Node newNode, Node key)
    {
        Node temp = start;
        while(temp.next != null)
        {
            if(temp.data == key.data)
            {
                break;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

}
