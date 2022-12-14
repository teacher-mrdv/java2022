
public class Chapter6Example
{
	// methods: divide and conquer!
	// this method makes a String of <howMany> asterisks ( a line of <howMany> *s )
	static String stars(int howMany)
	{
		String output = ""; // empty string
		for(int i = 0; i < howMany; i++)
		{
			output = output + "*";
		}
		return output;
	}
	
	public static void main (String[] args)
	{
		String s;
		System.out.println( "Remember: A declared but uninitialised String is NULL" );
		int n = IBIO.inputInt("Square size: ");
		System.out.println("The clever way");
		System.out.println();
		
		for(int i = 0; i < n; i++)
		{
			System.out.println( stars(n) );
		}
		
		System.out.println();
		System.out.println("Not so clever way");
		System.out.println();
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{	System.out.print( "*" );
			}
			System.out.println();
		}
		
		
		
	}
	
	
}

