/*
 * Collection class
 * 
 * Collection of elements - implementation of
 * chapter 4 collections [pseudocode level]
 * for practice and testing
 * 
 * note that a counter may be added as a member/attribute
 * to keep track of the size of the collection
 * 
 */
 
public class Collection
{
	Element start;
	Element current;
	// an Element end; could be added to keep track of the last item
	
	public Collection()
	{	this.start = null;
		this.current = null;
	}
	
	public boolean isEmpty()
	{	return start == null;
	}

	public boolean hasNext()
	{	return current != null;
	}

	public void add(Object data)
	// can also be a number, object, array, etc. instead of String
	{
		Element newElement = new Element(data);
		if( this.isEmpty() ) // add first element
		{	start = newElement;
			current = start;
		} else
		{	current = start;
			while(current.hasNext())
			{	current = current.getNext();
			}
			current.setNext(newElement);
			//current = current.getNext();
		}
	}
	
	public Object getNext()
	{	Object data = current.getData();
		current = current.getNext();
		return data;
	}
	
	public Object getData()
	{	return this.getNext();
	}
	
	public void resetNext()
	{	this.current = this.start;
	}
	
	public String toString()
	{	String output = "[ ";
		this.resetNext();
		while( this.current != null )
		{	String e = this.getNext().toString();
			output = output + e + "  ";
		}
		return output + "]";
	}
	
	public void print()
	{	this.resetNext();
		while( this.current.hasNext() )
		{	System.out.println(this.getNext().toString());
		}
		this.resetNext();
	}
}

