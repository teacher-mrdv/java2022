/*
 * Node.java
 * data is an integer
 */


public class Node
{
	int data;
	Node next; // self-referential data structure

	public boolean hasNext()
	{
		return next != null;
	}
	
	public Node()
	{	}
	
	public Node(int n)
	{
		data = n;
		next = null;
	}


	public static void main(String[] args)
	{
		Node test = new Node(7);
		System.out.println( test );
		System.out.println( test.hasNext() );
		System.out.println( test.data );
		System.out.println( test.next );
		Node test2 = new Node();
		System.out.println( test2.hasNext() );
		System.out.println( test2.data );
		System.out.println( test2.next );
		test2.data = 4;
		System.out.println( test2.data );
		System.out.println( test2 );
		test.next = test2;
		System.out.println( test.hasNext() );
		System.out.println( test2.hasNext() );
		System.out.println( test.next );
		
	}


}

/* OUTPUT

Node@626b2d4a
false
7
null
false
0
null
4
Node@cac736f
true
false
Node@cac736f

*/
