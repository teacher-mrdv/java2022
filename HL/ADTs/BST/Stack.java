/*
 * Stack.java
 *
 * Class to define the structure and behaviour of
 * a linked stack abstract data structure/type
 *
 */


public class Stack
{
	Node top;

	public boolean isEmpty()
	{	// top == null is a boolean expression that will return TRUE or FALSE. This is an shortcut of if..else
		return top == null;
	}

	public void push(int n)
	{
		Node newNode = new Node(); // create a node to push
		newNode.data = n;  // place the data in the new node
		if( isEmpty() )
		{
			top = newNode;
		} else
		{
			newNode.next = top;
			top = newNode;
		}
	}

	// Classwork: write the pop method:
	public int pop()
	{
		if( !isEmpty() )
		{	int n = top.data;
			top = top.next;
			return n;
		}
		return 0;
	}

	/*********************************************************************
	*	HOMEWORK: complete the printStack() method in the Stack class      *
	*	so that the code shows the contents of a stack, LIFO, but without  *
	*	destroying/popping the stack contents.                             *
	*********************************************************************/

	public void printStack()
	{
		if( isEmpty() )
		{	System.out.println("Stack is empty.");
			return;
		}
		Node temp = top;
		System.out.println("\nTop");
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}

		System.out.println("null\n");
	}

}
