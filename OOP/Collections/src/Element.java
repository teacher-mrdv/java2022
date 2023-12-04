/*
 * Element class
 * component element of a collection
 * this is done at pseudocode level, but
 * it's good for testing and practice
 * 
 * Wrapper classes: Integer, Character, Double, etc.
 */


public class Element
{
	private Object data; // can also be a number, String, array, etc.
	private Element next;// for numbers use the wrapper classes
	
	public Element() { }
	
	public Element(Object data)
	{	this.data = data;
		this.next = null;
	}
	
	public boolean hasNext()
	{	return this.next != null;
	}
	
	public Element getNext()
	{	return this.next;
	}
	
	public Object getData()
	{	return this.data;
	}
	
	public void setNext(Element e)
	{	this.next = e;
	}
	
	public void setData(Object data)
	{	this.data = data;
	}
	
	public String toString()
	{	return this.data.toString();
	}
	
}

