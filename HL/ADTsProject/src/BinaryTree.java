public class BinaryTree {
    BTNode root;

    public BinaryTree() { }

    public BinaryTree(int data) {
        this.root = new BTNode(data);
    }

    public BinaryTree(BTNode r) {
        this.root = r;
    }

    private void addRecursive(BTNode current, int value) {
        if(current.left != null) {
            addRecursive(current.left, value);
        } else if(current.right != null) {
            addRecursive(current.right, value);
        } else {
            current = new BTNode(value);
        }
    }

    public void add(int value) {
        addRecursive(this.root, value);
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void inOrder()
    {	if(!this.isEmpty())
            inOrder(this.root);
    }

    public void inOrder(BTNode node)
    {
        if (node != null) {
            inOrder(node.left);
            System.out.print(" " + node.data);
            inOrder(node.right);
        }
    }

    public void preOrder()
    {	if(!this.isEmpty())
            preOrder(this.root);
    }

    public void preOrder(BTNode node)
    {
        if (node != null) {
            System.out.print(" " + node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder()
    {	if(!this.isEmpty())
            postOrder(this.root);
    }

    public void postOrder(BTNode node)
    {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
}