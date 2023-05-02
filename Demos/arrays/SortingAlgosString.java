/*
 * Sorting algos in Java
 * String version
 */


public class SortingAlgosString
{
	public static void printArray(String[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.printf( "[%d]%s  ",i , a[i]);
		}
		System.out.println();
	}

	public static String[] clone(String[] a)
	{
		String[] x = new String[a.length];
		for(int i = 0; i < a.length; i++)
		{	x[i] = a[i];
		}
		return x;
	}

	public static void selectionSort(String[] a)
	{
		int c = 0;
		int currentIndex = 0;
		while( currentIndex < a.length - 1 )
		{
			int smallestIndex = currentIndex;
			String smallestValue = a[smallestIndex];
			int checkIndex	  = smallestIndex + 1;
			while( checkIndex < a.length )
			{
				c++;
				if(a[checkIndex].compareTo(smallestValue) < 0)
				{
					smallestIndex = checkIndex;
					smallestValue = a[checkIndex];
				}
				checkIndex++;
			}
			a[smallestIndex] = a[currentIndex];
			a[currentIndex] = smallestValue;
			currentIndex++;
			System.out.print("\t");
			printArray(a);
		}
		System.out.println("Number of comparisons made: " + c);
	}

	public static void bubbleSort(String[] a)
	{
		// finish this for homework. Refer to sorting_algos_SL.pdf
		boolean swapped = true;
		int c = 0; // counting how how many times the sorting algo. works (compares elements inside the array)
		int sorted = 0; // how many elements we have sorted/bubbled up
		while (swapped) // we use swapped to check if we have to make any changes (swaps) in the array
		{
			swapped = false; // assume no swaps are made
			for(int i = 0; i < a.length-1-sorted; i++) // go through the unsorted part of the array (a pass)
			{
				c++;
				if(a[i].compareTo(a[i+1]) > 0) // if the elements are not in order (ascending)
				{
					String temp = a[i]; // swap the two elements
					a[i]=a[i+1];
					a[i+1]=temp;
					swapped=true; // and keep track of the fact that we've done a swap
				}
				System.out.print("\t"); printArray(a); // optional, shows how the array changes with each swap
			}
			sorted++; // after each pass, one more element will be sorted
		}
		System.out.println("Number of comparisons made: " + c);
	}

public static void bubbleSort2(String[] a)
	{
		int c = 0; // counting how how many times the sorting algo. works (compares elements inside the array)
		int sorted = 0; // how many elements we have sorted/bubbled up
		for(int j = 0; j < a.length; j++)
		{
			for(int i = 0; i < a.length-1-sorted; i++) // go through the unsorted part of the array (a pass)
			{
				c++;
				if(a[i].compareTo(a[i+1]) > 0) // if the elements are not in order (ascending)
				{
					String temp = a[i]; // swap the two elements
					a[i]=a[i+1];
					a[i+1]=temp;
				}
				System.out.print("\t"); printArray(a); // optional, shows how the array changes with each swap
			}
			sorted++; // after each pass, one more element will be sorted
		}
		System.out.println("Number of comparisons made: " + c);
	}
	
	public static void bubbleSort3(String[] a)
	{
		// finish this for homework. Refer to sorting_algos_SL.pdf
		boolean swapped = true;
		int c = 0; // counting how how many times the sorting algo. works (compares elements inside the array)
		for(int j = 0; j < a.length; j++)
		{
			for(int i = 0; i < a.length-1; i++) // go through the unsorted part of the array (a pass)
			{
				c++;
				if(a[i].compareTo(a[i+1]) > 0) // if the elements are not in order (ascending)
				{
					String temp = a[i]; // swap the two elements
					a[i]=a[i+1];
					a[i+1]=temp;
					swapped=true; // and keep track of the fact that we've done a swap
				}
				System.out.print("\t"); printArray(a); // optional, shows how the array changes with each swap
			}
		}
		System.out.println("Number of comparisons made: " + c);
	}

	// a couple of ways to visualise the insertion sort:
	// https://youtu.be/OGzPmgsI-pQ
	// https://youtu.be/JU767SDMDvA
	public static void insertionSort(String[] array)
	{	int c = 0;
		int len = array.length;
		for(int i = 1; i < array.length; i++)
		{
			String temp = array[i];
			int j = i-1;
			while(j >= 0 && array[j].compareTo(temp) > 0)
			{	c++;
				array[j+1] = array[j];
				j--;
				System.out.print("\t>>> ");	printArray(array);
			}
			array[j+1] = temp;
		}
		System.out.println("Comparisons: " + c);
	}

	public static void main (String[] args)
	{
		//String[] original = { "12", "7", "14", "9", "5", "3" };
		String[] original = { "Anne", "Cynthia", "Kyle", "Lisa", "Maggie", "Zeke" };
		String[] selection = clone(original);
		String[] bubble = clone(original);
		String[] bubble2 = clone(original);
		String[] bubble3 = clone(original);
		String[] insert = clone(original);
		System.out.println("\nOriginal array:");
		printArray(original);
		System.out.println("\nSelection sort:");
		selectionSort(selection);
		System.out.println("\nFinal result:");
		printArray(selection);
		System.out.println("\nBubble sort:");
		bubbleSort(bubble);
		System.out.println("\nFinal result:");
		printArray(bubble);
		System.out.println("\nBubble2 sort:");
		bubbleSort(bubble2);
		System.out.println("\nFinal result:");
		printArray(bubble2);
		System.out.println("\nBubble3 sort:");
		bubbleSort(bubble3);
		System.out.println("\nFinal result:");
		printArray(bubble3);
		System.out.println("\nInsertion sort:");
		insertionSort(insert);
		System.out.println("\nFinal result:");
		printArray(insert);
	}
}
