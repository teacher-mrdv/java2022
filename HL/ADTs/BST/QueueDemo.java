
public class QueueDemo
{

	public static void main (String[] args)
	{
		Queue q = new Queue();
		if( q.isEmpty() )
		{	System.out.println( "Queue is empty" );
		} else {
			System.out.println( q.dequeue() );
		}
		System.out.println( "\n\n" );

		String word;
		do {
			word = IBIO.input("Enter a word: ");
			if(word.length() > 0)
			{	q.enqueue(word);
				q.printQueue();
			}
		} while( word.length() > 0 );

		while( !q.isEmpty() )
		{	System.out.println( " >>> Dequeueing: " + q.dequeue() );
			q.printQueue();
		}
	}
}
