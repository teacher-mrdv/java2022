/*
 * Queue.java
 *
 * Class to define the structure and behaviour of
 * a linked queue abstract data structure/type
 *
 */


public class Queue
{
	NodeString head; // first element in the queue
	NodeString tail; // last  element in the queue

	public boolean isEmpty()
	{
		return head == null;
	}

	public void enqueue(String s)
	{
		NodeString newNode = new NodeString(s);
		if( isEmpty() == true )
		{
			head = newNode;
			tail = newNode;
		} else
		{
			tail.next = newNode;
			tail = newNode;
		}
	}

	// Classwork: write the pop method:
	public String dequeue()
	{
		if( !isEmpty() )
		{	String s = head.data;
			head = head.next;
			return s;
		}
		return null;
	}

	/*********************************************************************
	*	HOMEWORK: complete the printQueue() method in this class         *
	*	so that the code shows the contents of a queue, FIFO, but without*
	*	destroying the queue contents.                                   *
	*********************************************************************/

	public void printQueue()
	{
		if( isEmpty() )
		{	System.out.println("Queue is empty.");
			return;
		}
		NodeString temp = head;
		System.out.print("Head -> ");
		while(temp != null)
		{
			System.out.print(temp.data + " <- ");
			temp = temp.next;
		}
		System.out.println(" Tail");
	}

}
