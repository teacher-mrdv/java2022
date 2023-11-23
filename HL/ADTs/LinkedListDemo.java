public class LinkedListDemo
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList(5);
        list.append(7);
        list.append(3);
        list.printLinkedList();
        list.insert(new Node(9), new Node(3)); list.printLinkedList();
        list.insert(new Node(6), new Node(5)); list.printLinkedList();
        list.insert(new Node(8), new Node(7)); list.printLinkedList();
        list.insert(new Node(0), new Node(999)); list.printLinkedList();
        list.delete(3); list.printLinkedList();
        list.delete(5); list.printLinkedList();
        list.delete(0); list.printLinkedList();

        System.out.println();
        LinkedList list2 = new LinkedList();
        list2.append(1);
        list2.append(5);
        list2.append(2);
        list2.append(7);
        list2.append(0);
        list2.printLinkedList();

        list2.delete(1); list2.printLinkedList();
        list2.delete(2); list2.printLinkedList();
        list2.delete(0); list2.printLinkedList();

        list2.insertBefore(1,2); list2.printLinkedList();
        list2.insertAfter(2,2); list2.printLinkedList();
        list2.delete(1); list2.printLinkedList();
    }
}

