/*
 * LinkedListDemo.java
 * 
 * 
 * 
 */


public class LinkedListDemo
{
	
	public static void main (String[] args)
	{
		LinkedList list1 = new LinkedList();
		System.out.println( "list1.isEmpty() = " + list1.isEmpty() );
		System.out.println("\nAppending elements to a linked list: ");
		System.out.println("\tOllie, Lisa, Mary, Peter, Bruce, Jane");
		list1.append("Ollie"); list1.printList();
		list1.append("Lisa"); list1.printList();
		list1.append("Mary"); list1.printList();
		list1.append("Peter"); list1.printList();
		list1.append("Bruce"); list1.printList();
		list1.append("Jane"); list1.printList();
		System.out.println("\nDeleting elements of a linked list: Mary, Ollie, Jane");
		list1.delete("Mary"); list1.printList();
		list1.delete("Ollie"); list1.printList();
		list1.delete("Jane"); list1.printList();
		
		System.out.println("\nInsertions before and after");
		System.out.println("list1.insertAfter(\"Bruce\", \"Diana\") -Insert Diana after Bruce-: " +
							list1.insertAfter("Bruce", "Diana")); list1.printList();
		list1.insertAfter("Lisa", "Ada"); list1.printList();
		list1.insertAfter("Peter", "Otto"); list1.printList();
		list1.insertAfter("Kyle", "Nova"); list1.printList();
		System.out.println("list1.insertAfter(\"Eva\", \"Adan\") -insert Adan after Eva, but Eva isn't in the list (insertAfter returns false): " +	list1.insertAfter("Eva", "Adan")); list1.printList();
		list1.insertBefore("Lisa", "Leia"); list1.printList();
		list1.insertBefore("Otto", "Norman"); list1.printList();
		list1.insertBefore("Nova", "Reynor"); list1.printList();
		System.out.println("list1.insertBefore(\"Kyle\", \"Cartman\") -insert Cartman before Kyle, but Kyle isn't in the list (insertBefore returns false): " +	list1.insertBefore("Kyle", "Cartman")); list1.printList();
		/*
		 * Below we test the add method, which is an insert-in-place
		 * (similar to an insertion sort) algorithm to add items
		 * in their right place to build a linked list in ascending order.
		 */
		System.out.println("\nAdd/Insert in-place (insertion sort-like add String to a linked list)");
		System.out.println("Please refer to the code, lines 48 onwards");
		LinkedList sortedList = new LinkedList();
		System.out.println( sortedList.isEmpty() );
		sortedList.add("Ollie"); sortedList.printList();
		sortedList.add("Lisa"); sortedList.printList();
		sortedList.add("Mary"); sortedList.printList();
		sortedList.add("Peter"); sortedList.printList();
		sortedList.add("Bruce"); sortedList.printList();
		sortedList.add("Jane"); sortedList.printList();
		sortedList.add("Zeke"); sortedList.printList();
		sortedList.add("Ada"); sortedList.printList();
	}
}

