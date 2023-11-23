/*
 *
 * Use this class to test your Queue.java class
 * mrdv 2023
 * 
 * https://www.baeldung.com/java-printstream-printf
 * https://www.digitalocean.com/community/tutorials/java-printf-method
 * 
 */

public class QueueTest
{
	
	public static void main (String[] args)
	{
		Queue q = new Queue();
		// input integers until 0 is input
		// display the queue as it gets populated
		int input;
		//int queueSize = 0;
		System.out.println("Creating a queue:");
		do
		{
			input = IBIO.inputInt("enter an integer (0 ends): ");
			if( input != 0 )
			{	//queueSize++;
				q.enQueue(input);
				q.printQueue();
			}
		} while( input != 0 );
		int queueSize = q.size;
		// Is there a better way of keeping track and getting the size of the queue?
		System.out.println("\nCopying the queue into an array:");
		int[] array = new int[queueSize];
		for(int i = 0; i < queueSize; i++)
		{	array[i] = q.deQueue();
			q.printQueue();
			printArray(array);
		}
	}
	
	public static void printArray(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.println( i + " : " + a[i] );
		}
	}
}

/* EXPECTED OUTPUT

Creating a queue:
enter an integer (0 ends): 1
Head  <- 1 <- Tail
enter an integer (0 ends): 6
Head  <- 1 <- 6 <- Tail
enter an integer (0 ends): 2
Head  <- 1 <- 6 <- 2 <- Tail
enter an integer (0 ends): 3
Head  <- 1 <- 6 <- 2 <- 3 <- Tail
enter an integer (0 ends): 7
Head  <- 1 <- 6 <- 2 <- 3 <- 7 <- Tail
enter an integer (0 ends): 0

Copying the queue into an array:
Head  <- 6 <- 2 <- 3 <- 7 <- Tail
0 : 1
1 : 0
2 : 0
3 : 0
4 : 0
Head  <- 2 <- 3 <- 7 <- Tail
0 : 1
1 : 6
2 : 0
3 : 0
4 : 0
Head  <- 3 <- 7 <- Tail
0 : 1
1 : 6
2 : 2
3 : 0
4 : 0
Head  <- 7 <- Tail
0 : 1
1 : 6
2 : 2
3 : 3
4 : 0
Queue is empty
0 : 1
1 : 6
2 : 2
3 : 3
4 : 7

*/
