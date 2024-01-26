/*
 * This class will output a Xmas tree
 * of variable size
 * This version is fully modular...
 *  ...implementing the algorithm as a method
 * Note that methods may call other methods
 * to create an ingenious solution
 * 
 */
 
public class XmasTree2
{

	// this method returns a String of <howMany> asterisks ( a line of <howMany> *s )
	static String stars(int howMany)
	{
		String output = ""; // empty string
		for(int i = 0; i < howMany; i++)
		{
			output = output + "*";
		}
		return output;
	}

	// this method returns a String of <howMany> spaces
	static String spaces(int howMany)
	{
		String output = ""; // empty string
		for(int i = 0; i < howMany; i++)
		{
			output = output + " ";
		}
		return output;
	}

	static void XmasTree(int size)
	{
		// top of the tree
		for(int i = 1; i <= size; i++)
		{
			System.out.println( spaces(size-i) +
				stars(i) + stars(i-1) );
		}
		// trunk of the tree
		for(int i = 1; i <= size/2; i++)
		{
			System.out.println( spaces(size-1) +
				"*" );
		}
	}

	public static void main(String[] args)
	{
		int s = IBIO.inputInt("Xmas tree size? ");
		System.out.println( "\n" );
		XmasTree(s);
	}
	
	
}

