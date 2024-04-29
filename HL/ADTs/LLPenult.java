
public class LLPenult {
	
	public static int penu(LinkedList list) {
		if(list.size < 2) { // or .size()
			return 0; // or null, depending on the Node data's data type
		}
		Node temp = list.start; // .getStart() or .resetNext()
		for(int i = 0; i < list.size-2; i++) {
			temp = temp.next; // .getNext();
		}
		return temp.data; // .getData();
	}
	
	public static int penult(LinkedList list) {
		if(list.start == null || list.start.next == null) {
			// there's no penultimate in a LL with no or 1 element only
			return 0; // or null, depending on the Node data's data type
		}
		Node penu = list.start;
		Node temp = penu.next; // .getStart() or .resetNext()
		while(temp.next != null) {
			penu = penu.next;
			temp = temp.next; // .getNext();
		}
		return penu.data; // .getData();
	}
	
	/*
	public Visitor getPenultimate(LinkedList guests) {
		if( guests.getStart() == null || guests.getStart().getNext() == null) {
			return null;
		}
		Node penu = guests.getStart();	// assuming the Node's data is a Visitor object
		Node temp = penu.getNext();
		while(temp.getNext() != null) {	// or while( temp.hasNext() ) {
			penu = penu.getNext();
			temp = temp.getNext();
		}
		return penu.getData();
	}
	*/
	
	public static void main (String[] args) {
		System.out.println( "Linked list: penultimate element challenge" );
		LinkedList l = new LinkedList();
		int[] a = {1,2,3,4,5,6,7,8,9};
		for(int i : a) {
			l.append(i); // or l.add(i)
		}
		l.printLinkedList();
		System.out.println( penu(l) );
		System.out.println( penult(l) );
	}
}

