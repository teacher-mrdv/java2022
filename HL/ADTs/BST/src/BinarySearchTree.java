// WIP!!!

public class BinarySearchTree {
    // note: data is NOT hidden (yet)
    Node root;  // point of access and instance variable/attribute/field

    public BinarySearchTree() { // triple-overloaded constructor
    }

    public BinarySearchTree(String data) {
        Node newNode = new Node(data);
        this.root = newNode;
        System.out.println("BST root created with data: " + data);
    }

    public BinarySearchTree(Node root) {
        System.out.println("BST root created with data: " + root.key);
        this.root = root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    /*  helper method! useful as the main insertion algo. is recursive :)
        also, it helps us just pass a String to add to the BST and it
        creates the new node and passes it to the real insert method below.
     */
    public void insert(String data) {
        Node temp = new Node(data);
        // if the BST is empty, insert the new node (temp) as the root
        if (this.isEmpty()) {
            root = temp;
            System.out.println("BST root created with data: " + data);
        } else {
            insert(root, temp);
        }
    }

    public void insert(Node node, Node insertion) {
        if (insertion.key.compareToIgnoreCase(node.key) > 0) {
            if (node.right == null) {
                System.out.println("Adding " + insertion + " to the RIGHT of " + node);
                node.right = insertion;
            } else {
                insert(node.right, insertion);
            }
        }
        if (insertion.key.compareToIgnoreCase(node.key) < 0) {
            if (node.left == null) {
                System.out.println("Adding " + insertion + " to the LEFT of " + node);
                node.left = insertion;
            } else {
                insert(node.left, insertion);
            }
        }
    }

    /*  another helper method! useful as the search algo. is recursive :)
        also, it helps us just pass a String to search for and
        calls the actual search method, which is recursive and therefore
        needs a node and the data to search as parameters-
     */
    public boolean search(String data) {
        return search(root, data);
    }

    public boolean search(Node node, String data) {
        if (node == null) // base case 1 - not found
            return false;
        if (data.equalsIgnoreCase(node.key)) // base case 2 - found!
            return true;
        else if (data.compareToIgnoreCase(node.key) > 0)
            return search(node.right, data);
        else //if(data.compareToIgnoreCase(node.key) < 0)
            return search(node.left, data);
    }

    public void preOrder() {
        if( this.isEmpty() )
            System.out.println(">>> The tree is empty <<<");
        else
            preOrder(root);
    }

    public void preOrder(Node node) {
        if(node == null) {
            //System.out.println("<null>");
            return;
        }
        
    }

    public void inOrder() {
        if( this.isEmpty() )
            System.out.println(">>> The tree is empty <<<");
        else
            inOrder(root);
    }

    public void inOrder(Node node) {
        if(node == null) {
            //System.out.println("<null>");
            return;
        }

    }

    public void postOrder() {
        if( this.isEmpty() )
            System.out.println(">>> The tree is empty <<<");
        else
            postOrder(root);
    }

    public void postOrder(Node node) {
        if(node == null) {
            //System.out.println("<null>");
            return;
        }

    }

}
