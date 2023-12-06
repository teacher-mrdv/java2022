import java.util.*;

public class CollectionDemo
{
	
	public static void main (String[] args)
	{
		Collection list = new Collection();
		list.add("Joe");
		list.add("Adam");
		list.add("James");
		list.add("Bob");
		System.out.println("Collections SL Demo");
		System.out.println(list + "\n");
		list.add("Matthew");

		// let's calculate the size of our collection
		list.resetNext();
		int size = 0;
		while( list.hasNext() )
		{	System.out.print( list.getNext() + " ");
			size++;
		}
		// now we copy it to an array so that we may sort it
		System.out.println("\nsize of the collection = " + size);
		Object[] names = new String[size];
		list.resetNext();
		for(int i = 0; i < size; i++)
		{	names[i] = list.getNext();
		}
		System.out.println("Collection to array");
		// don't use these shortcuts in exams, use a loop to traverse
		// through the array and the bubble or selection sort
		// to sort arrays. Useful to show you that the Arrays class
		// has static toString and sort methods to help
		// print and sort, though! This is useful for testing-
		Arrays.sort(names);
		System.out.println( Arrays.toString(names) );
		// how would you create another collection and populate it...
		// with the sorted names from the array?

	}
}

