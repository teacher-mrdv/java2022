/*
 * Element class v2.0
 *
 * component element of a collection
 * this is done at pseudocode level, but
 * it's good for testing and practice
 *
 * HL note: This is the same as our Node classes in Grade 11 ADTs
 *
 * Wrapper classes: Integer, Character, Double, etc.
 *
 * You may want to look into Java Generics for a cleaner
 * and more proper implementation that avoids using the
 * Object superclass to create an element (Node) that may contain
 * any type of data (as long as it's an object and not a primitive)
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

