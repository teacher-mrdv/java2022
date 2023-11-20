public class BSTTest
{
    public static void main(String[] args)
    {
        BinarySearchTree bst = new BinarySearchTree("Lisa");
        bst.add("Adam"); bst.add("Barbie");
        bst.add("Zed"); bst.add("Norman");
		System.out.println("\n\ninOrder:");
		bst.inOrder();
		System.out.println("\npreOrder:");
		bst.preOrder();
		System.out.println("\npostOrder:");
		bst.postOrder();
    }
}
