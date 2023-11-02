/*
 * NodeString.java
 * data is an String
 */


public class NodeString
{
	String data;
	NodeString next; // self-referential data structure

	public boolean hasNext()
	{
		return next != null;
	}
	
	public NodeString()
	{	}
	
	public NodeString(String s)
	{
		data = s;
		next = null;
	}

}
