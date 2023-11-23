import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    BTNode root;

    public BinaryTree() { }

    public BinaryTree(int data) {
        System.out.println(data + " inserted as the root node.");
        this.root = new BTNode(data);
    }

    public BinaryTree(BTNode r) {
        System.out.println(r.data + " inserted as the root node.");
        this.root = r;
    }

    public void add(int data) {
        if (root == null) {
            System.out.println(data + " inserted as the root node.");
            root = new BTNode(data);
        } else {
            Queue<BTNode> queue = new LinkedList<>();   // Java...
            queue.add(root);                    // add = enqueue

            while (!queue.isEmpty()) {
                BTNode tempNode = queue.poll(); // poll = dequeue

                if (tempNode.left == null) {
                    System.out.println(data + " inserted to the left of " + tempNode.data);
                    tempNode.left = new BTNode(data);
                    break;
                } else
                    queue.add(tempNode.left);

                if (tempNode.right == null) {
                    System.out.println(data + " inserted to the right of " + tempNode.data);
                    tempNode.right = new BTNode(data);
                    break;
                } else
                    queue.add(tempNode.right);
            }
        }
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
