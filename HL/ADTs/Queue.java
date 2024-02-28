/*
 * ADT: queue skeleton -- FIFO
 * Complete the following methods:
 * 	enqueue, dequeue, isEmpty, printQueue
 *
 * Requirements for this challenge:
 *  IBIO.java, Node.java, QueueDemo.java
 */

public class Queue
{
    Node head = null;
    Node tail = null;
    int size = 0;

    public boolean isEmpty()
    {
        return head == null;
        // no need to check for the tail
    }

    public void enQueue(Node newNode)
    {
        if( isEmpty() )
        {
            head = newNode;
        } else
        {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public Node deQueue()
    {
        if (!isEmpty())
        {
			Node deQueued = head;
            head  = head.next;
            size--;
            return deQueued;
        } else
        {
            System.out.println("Queue is empty.");
            return null;
        }
    }

    public void printQueue()
    {
        Node temp = head;
        System.out.print("head -> ");
        while (temp != null)
        {
            if(temp.next == null) System.out.print("tail -> ");
            System.out.print(temp.data);
            System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println("NULL. Size = " + size);
    }


}
