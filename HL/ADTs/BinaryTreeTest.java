public class BinaryTreeTest {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(1);
        bt.add(2); bt.add(3); bt.add(4);
        bt.add(5); bt.add(6); bt.add(7);
        System.out.println("\n\nPreOrder:");
        bt.preOrder();
        System.out.println("\n\nInOrder:");
        bt.inOrder();
        System.out.println("\n\nPostOrder:");
        bt.postOrder();
    }
}
