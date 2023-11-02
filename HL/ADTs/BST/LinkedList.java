/*
 * LinkedList.java
 * 
 * 
 */


public class LinkedList
{
	NodeString start;
	
	// this method creates an empty linked list
	public LinkedList() { }
	
	// this method creates a list
	// with its initial element
	public LinkedList(String data)
	{
		NodeString newNode = new NodeString(data);
		newNode.next = null;
		start = newNode;
	}
	
	public boolean isEmpty()
	{
		return start == null;
	}
	
	public void append(String data)
	{
		NodeString newNode = new NodeString(data);
		newNode.next = null;
		if( isEmpty() )
		{	
			start = newNode;
		} else {
			NodeString temp = start;
			while( temp.hasNext() ) // temp.next != null
			{	temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public void printList()
	{
		if( isEmpty() )
		{	System.out.println("List empty");
			return;
		}
		NodeString temp = start;
		System.out.print("Start -> ");
		while( temp != null )
		{
			System.out.print( temp.data + " <- ");
			temp = temp.next;
		}
		System.out.println( " NULL ");
	}
	
	public void delete(String del)
	{
		boolean found = false;
		NodeString current = start;
		NodeString prev = new NodeString();
		while(!found && current != null)
		{
			if(current.data.equalsIgnoreCase(del))
			{	found = true;
			} else {
				prev = current;
				current = current.next;
			}
		}
		if(found && current == start)
		{	start = start.next;
			return;
		}
		if(found)
		{	prev.next = current.next;
		}
		if(!found)
		{	System.out.printf("%s was not found.\n", del);
		}
	}
	
	public boolean insertAfter(String search, String insert)
	{
		boolean found = false;
		NodeString newNode = new NodeString(insert);
		if(!isEmpty())
		{	NodeString current = start;
			while( current != null)
			{	if(current.data.equalsIgnoreCase(search))
				{	found = true;
					newNode.next = current.next;
					current.next = newNode;
					return found;
				}
				current = current.next;
			}
		}
		append(insert);
		return found;
	}
	
	public boolean insertBefore(String search, String insert)
	{
		boolean found = false;
		NodeString newNode = new NodeString(insert);
		if(!isEmpty())
		{	if( search.equalsIgnoreCase(start.data) )
			{	newNode.next = start;
				start = newNode;
				return true;
			}
			NodeString previous= start;
			NodeString current = start.next;
			while( current != null)
			{	if(current.data.equalsIgnoreCase(search))
				{	found = true;
					newNode.next = current;
					previous.next = newNode;
					return found;
				}
				previous = previous.next;
				current = current.next;
			}
		}
		append(insert);
		return found;
	}
	
	/* Homework for next lesson:
	 * add an insertBefore(search, insert) method
	 */
	
	// insert s in-place (ascending order)
	public void add(String s)
	{
		NodeString newNode = new NodeString(s);
		if( start == null ) // this.isEmpty()
		{	start = newNode;
			return;
		}
		if(s.compareTo(start.data) < 0)
		{	newNode.next = start;
			start = newNode;
			return;
		}
		NodeString current = start;
		NodeString after = current.next;
		while( after != null )
		{	if(s.compareTo(current.data) > 0 && s.compareTo(after.data) < 0 )
			{	newNode.next = after;
				current.next = newNode;
			}
			current = current.next;
			after   = after.next;
		}
		// we are at the end of the linked list
		if(s.compareTo(current.data) > 0 && after == null)
		{	current.next = newNode;
		}
	}
	
}

