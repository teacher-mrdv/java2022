/*
 * Node class, version 1.0o
 * this class defines what a node is
 * data contained inside the node is type Person in this case
 * by Marcos Drien 19.09.2016
 */

public class Node
{
	private Person data;  // data contents of the node
	private Node next; // link or pointer to the next node

	public Node() // empty constructor
	{ }

	public Node(Person person) // instantiate and initialise a new node
	{			// note: this constructor instantiates a SINGLE node only
		data = person;     // put the data inside the node
		next = null; // it's a single, lonely node, so there is no next node
	}				// (node.next points to null)

	public Person getData()
	{	return data;
	}

	public void setData(Person person)
	{	data = person;
	}

	public Node getNext()
	{	return next;
	}

	public void setNext(Node n)
	{	next = n;
	}

	public String toString() // to print the data of the node only
	{
		return data.toString(); // here we call toString from Person
	}



}

