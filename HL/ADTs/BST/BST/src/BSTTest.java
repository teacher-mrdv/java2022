public class BSTTest
{
    public static void main(String[] args)
    {
        BinarySearchTree bst = new BinarySearchTree("Lisa");
        bst.add("Adam"); bst.add("Barbie");
        bst.add("Zed"); bst.add("Norman");
        bst.inOrder();

    }
}
