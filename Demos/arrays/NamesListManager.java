/*
 * NamesListManager.java
 * 
 * Complete the methods below, following the instructions in the comments.
 * Good luck
 * 
 * Desired Output:
	Start -->
			[ 0 elements in array ]
	 >>> Adding Bob to array
	Start -->  Bob
			[ 1 elements in array ]
	 >>> Adding Gale to array
	Start -->  Bob  Gale
			[ 2 elements in array ]
	 >>> Adding Ed to array
	Start -->  Bob  Gale  Ed
			[ 3 elements in array ]
	 >>> Adding Faye to array
	Start -->  Bob  Gale  Ed  Faye
			[ 4 elements in array ]
	 >>> Adding Ives to array
	Start -->  Bob  Gale  Ed  Faye  Ives
			[ 5 elements in array ]
	 >>> Adding Chuck to array
	Start -->  Bob  Gale  Ed  Faye  Ives  Chuck
			[ 6 elements in array ]
	 >>> Adding Abe to array
	Start -->  Bob  Gale  Ed  Faye  Ives  Chuck  Abe
			[ 7 elements in array ]
	 >>> Adding Dean to array
	Start -->  Bob  Gale  Ed  Faye  Ives  Chuck  Abe  Dean
			[ 8 elements in array ]
	 >>> Adding StarLord to array
	Start -->  Bob  Gale  Ed  Faye  Ives  Chuck  Abe  Dean  StarLord
			[ 9 elements in array ]
	 >>> Adding Groot to array
	Start -->  Bob  Gale  Ed  Faye  Ives  Chuck  Abe  Dean  StarLord  Groot
			[ 10 elements in array ]
	 >>> Adding Steve to array
	Error - array full
	Start -->  Bob  Gale  Ed  Faye  Ives  Chuck  Abe  Dean  StarLord  Groot
			[ 10 elements in array ]
	 >>> Adding Max to array
	Error - array full
	Start -->  Bob  Gale  Ed  Faye  Ives  Chuck  Abe  Dean  StarLord  Groot
			[ 10 elements in array ]

	search for Anne: -1

	search for Dean: 7

	remove(array, "bob"):
	Start -->  Gale  Ed  Faye  Ives  Chuck  Abe  Dean  StarLord  Groot
			[ 9 elements in array ]

	remove(array, "Abe"):
	Start -->  Gale  Ed  Faye  Ives  Chuck  Dean  StarLord  Groot
			[ 8 elements in array ]

	remove(array, "groot"):
	Start -->  Gale  Ed  Faye  Ives  Chuck  Dean  StarLord
			[ 7 elements in array ]

	remove(array, "James"):
	James not found.

	insert(array, "Diana", 0);
	Start -->  Gale  Ed  Faye  Ives  Chuck  Dean  StarLord  StarLord
			[ 8 elements in array ]
	Start -->  Gale  Ed  Faye  Ives  Chuck  Dean  Dean  StarLord
			[ 8 elements in array ]
	Start -->  Gale  Ed  Faye  Ives  Chuck  Chuck  Dean  StarLord
			[ 8 elements in array ]
	Start -->  Gale  Ed  Faye  Ives  Ives  Chuck  Dean  StarLord
			[ 8 elements in array ]
	Start -->  Gale  Ed  Faye  Faye  Ives  Chuck  Dean  StarLord
			[ 8 elements in array ]
	Start -->  Gale  Ed  Ed  Faye  Ives  Chuck  Dean  StarLord
			[ 8 elements in array ]
	Start -->  Gale  Gale  Ed  Faye  Ives  Chuck  Dean  StarLord
			[ 8 elements in array ]
	Start -->  Diana  Gale  Ed  Faye  Ives  Chuck  Dean  StarLord
			[ 8 elements in array ]

	insert(array, "Bruce", 4);
	Start -->  Diana  Gale  Ed  Faye  Ives  Chuck  Dean  StarLord  StarLord
			[ 9 elements in array ]
	Start -->  Diana  Gale  Ed  Faye  Ives  Chuck  Dean  Dean  StarLord
			[ 9 elements in array ]
	Start -->  Diana  Gale  Ed  Faye  Ives  Chuck  Chuck  Dean  StarLord
			[ 9 elements in array ]
	Start -->  Diana  Gale  Ed  Faye  Ives  Ives  Chuck  Dean  StarLord
			[ 9 elements in array ]
	Start -->  Diana  Gale  Ed  Faye  Bruce  Ives  Chuck  Dean  StarLord
			[ 9 elements in array ]

	insert(array, "Alfred", 9);
	Start -->  Diana  Gale  Ed  Faye  Bruce  Ives  Chuck  Dean  StarLord  Alfred
			[ 10 elements in array ]
 * 
 */



public class NamesListManager
{
	private final static int MAXSIZE = 10;
	private static int lastIndex = 0;
	
	public static boolean isFull(String[] a)
	{
		return lastIndex == a.length;
	/*	if (lastIndex == a.length)
	 *		return true;
	 *	else
	 *		return false;
	 */
	}
	
	public static void printArray(String[] a)
	{
		System.out.print( "Start -->");
		// i < a.length to display all array contents, even
		// unused/unpopulated/discarded elements.
		for(int i = 0; i < lastIndex; i++)
		{
			System.out.print( "  " + a[i]);
		}
		System.out.printf("\n\t[ %d elements in array ]\n", lastIndex);
	}
	
	public static void add(String[] a, String data)
	{
		// this method will add data (a String) at the end of the array (the first free index)
		if( !isFull(a) )
		{	a[lastIndex] = data;
			lastIndex++;
		} else {
			System.out.println(data + " cannot be added. Array full.");
		}
		printArray(a);
	}
	
	public static int search(String[] a, String data)
	{
		// this method will return the index where the data (a String) is found, or -1 if not found
		for(int i = 0; i < lastIndex; i++)
		{	if( a[i].equalsIgnoreCase(data) )
			{	return i;
			}
		}
		return -1;
	}
	
	public static void remove(String[] a, String data)
	{
		int indexToRemove = search(a, data);
		if( indexToRemove == -1)
		{	System.out.printf("%s not found.\n", data);
		} else {
			for(int i = indexToRemove; i < lastIndex - 1; i++)
			{
				a[i] = a[i+1];
			}
			lastIndex--;
			printArray(a);
		}
	}
	
	public static void insert(String[] a, String data, int index)
	{
		if( isFull(a) == true )
			System.out.println("Error - array full");
		else {
			lastIndex++;
			for(int i = lastIndex-1; i > index; i--)
			{	a[i] = a[i-1];
				printArray(a);
			}
			a[index] = data;
		}
		printArray(a);
	}
	
	public static void main(String[] args)
	{
		String[] array = new String[MAXSIZE];
		printArray(array);
		String[] original = { "Bob", "Gale", "Ed", "Faye", "Ives", "Chuck", "Abe", "Dean", "StarLord", "Groot", "Steve", "Max" };
		for(String x : original)
		{	
			System.out.printf(" >>> Adding %s to array\n", x);
			add(array, x);
		}
		
		System.out.println("\nsearch for Anne: " + search(array, "Anne") );
		System.out.println("\nsearch for Dean: " + search(array, "Dean") );
		System.out.println("\nremove(array, \"bob\"):");
		remove(array, "bob");
		System.out.println("\nremove(array, \"Abe\"):");
		remove(array, "Abe");
		System.out.println("\nremove(array, \"groot\"):");
		remove(array, "groot");
		System.out.println("\nremove(array, \"James\"):");
		remove(array, "James");
		System.out.println("\ninsert(array, \"Diana\", 0);");
		insert(array, "Diana", 0);
		System.out.println("\ninsert(array, \"Bruce\", 4);");
		insert(array, "Bruce", 4);
		System.out.println("\ninsert(array, \"Alfred\", 9);");
		insert(array, "Alfred", 9);

	}
}

