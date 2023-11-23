public class LinkedList
{
	private Node head;
	// note that adding a tail node would make adding/appending nodes much easier, but let's do it the hard way, shall we?

	public LinkedList() // constructor
	{	head = null;
	}

	public boolean isEmpty()
	{
		boolean output = false;
		if( head == null )
		{	output = true;
		}
		return output;
	}

	public boolean contains(int id)
	{
		boolean found = false;
		Node temp = head;
		int look = 0;
		while( temp != null ) // while still elements in list
		{	look = temp.getData().getID();
			if( look == id )
			{	found = true;
				break;
			}
			temp = temp.getNext(); // move to next node
		}
		return found;
	}

	public boolean contains(Person person)
	{
		Node temp = head;
		int look = 0;
		while( temp != null ) // while still elements in list
		{	look = temp.getData().getID();
			if( look == person.getID() )
			{	return true;
			}
			temp = temp.getNext(); // move to next node
		}
		return false;
	}

	public void add(Person element)
	{	Node newNode = new Node(element);
		if( isEmpty() == true ) // first case: empty list
		{	head = newNode;
		}
		else // second case: list not empty
		{	Node temp = head;	// traversal until last node
			while( temp.getNext() != null ) // or while(temp.hasNext())
			{	temp = temp.getNext(); // temp = temp.next;
			}
			temp.setNext(newNode);
		}
	}

	public boolean remove(int lookup)
	{	if( isEmpty() )
		{	System.out.println("List empty. Nothing to remove.");
			return false;
		}
		boolean found = false;
		Node previous, current;
		if( head.getData().getID() == lookup )
		{	head = head.getNext();
			found = true;
		}
		else
		{	previous = head;
			current = head.getNext();
			while( current != null )
			{	if( current.getData().getID() == lookup )
				{	previous.setNext(current.getNext());
					found = true;
				}
				previous = previous.getNext();
				current = current.getNext();
			}
		}
		return found;
	}

	public String toString()	// polymorphism
	{	String output = "";		// prints the whole list
		Node temp = head;
		while( temp != null )
		{	output += temp.toString() + "\n";
			temp = temp.getNext();
		}
		//output = output + "\n";
		return output;
	}

/*	EXPERIMENTAL code
	public void selectionSort()
	{
		for( Node node1 = head; node1!=null; node1 = node1.getNext() )
		{	Node min = node1;
			for( Node node2 = node1.getNext(); node2!=null; node2 = node2.getNext() )
			{	if( min.getData().compareTo( node2.getData() ) > 0 )
				{	min = node2;
				}
				Node temp = new Node( node1.getData() );
				node1.setData( min.getData() );
				min.setData( temp.getData() );
			}
		}
	}

	public void bubbleSort()
	{	boolean swapped = true;
		while(swapped)
		{	swapped = false;
			Node node1 = head;
			while(node1.getNext() != null)
			{	Node node2 = node1.getNext(); //  if node1>node2
				if( node1.getData().compareTo( node2.getData() ) > 0 )
				{	Node temp = new Node( node1.getData() );
					node1.setData( node2.getData() );
					node2.setData( temp.getData() );
					swapped = true;
				} // end if
				node1 = node1.getNext();
			} // end for
		} // end while
	}
*/
}

/*
		if(!found)
		{	System.out.println(search + " not found in list.");
		}
		else
		{	System.out.println(search + " deleted from list.");
		}
*/
