
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
		if(list.size < 2) { // or .size()
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
	
	public static void main (String[] args) {
		LinkedList l = new LinkedList();
		int[] a = {1,2,3,4,5,6,7,8,9};
		for(int i : a) {
			l.append(i); // or l.add(i)
		}
		System.out.println( penu(l) );
		System.out.println( penult(l) );
	}
}

