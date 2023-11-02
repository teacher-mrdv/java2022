
public class StackDemo
{

	public static void main (String[] args)
	{
		Stack s = new Stack();
		s.push(3);
		System.out.println( s.isEmpty() );
		s.push(5);
		System.out.println( s.top.data );
		s.push(7);
		System.out.println( s.top.data );

		System.out.println( s.pop() );
		System.out.println( s.pop() );
		System.out.println( s.pop() );
		System.out.println( s.isEmpty() );
		if(s.isEmpty() )
		{	System.out.println( "Stack is empty" );
		} else {
			System.out.println( s.pop() );
		}
		System.out.println( "\n\n" );

		Stack reverse = new Stack();
		int n;
		do {
			n = IBIO.inputInt("Enter a + number: ");
			if(n > 0)
			{	reverse.push(n);
				reverse.printStack();
			}
		} while( n > 0 );

		while( !reverse.isEmpty() )
		{	System.out.println( " >>> Popping: " + reverse.pop() );
			reverse.printStack();
		}
	}
}
