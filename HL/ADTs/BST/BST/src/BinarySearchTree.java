public class BinarySearchTree
{
    private Node root;

    public BinarySearchTree(String data)
    {   this.root = new Node(data);
        System.out.println("--> Inserted " + data + " as the root");
    }

    public BinarySearchTree(Node root)
    {   this.root = root;
    }

    //public BinarySearchTree() { }  // we don't want empty BSTs
    // bc we don't want to check for empty BSTs

    public boolean isEmpty() // just in case
    {   return root == null;
    }

    public Node getRoot()
    {   return root;
    }

    public void setRoot(Node root)
    {   this.root = root;
    }

    public void add(String data)
    {   add(this.root, data);
    }

    public void add(Node node, String data)
    {
        if (data.compareToIgnoreCase(node.getData()) < 0)
        {   if (node.getLeft() != null)
            {   add(node.getLeft(), data);
            } else
            {   System.out.println("--> Inserted " + data +
                        " to the left of " + node.getData());
                node.setLeft(new Node(data));
            }
        } else if (data.compareToIgnoreCase(node.getData()) > 0)
        {   if (node.getRight() != null)
            {   add(node.getRight(), data);
            } else
            {   System.out.println("--> Inserted " + data +
                        " to the right of " + node.getData());
                node.setRight(new Node(data));
            }
        }
    }

    public void inOrder()
    {	if(!this.isEmpty())
			inOrder(this.root);
    }

    public void inOrder(Node root)
    {
        if(root.getLeft() != null)
        {   inOrder(root.getLeft());
        }
        System.out.print(root + " ");
        if(root.getRight() != null)
        {   inOrder(root.getRight());
        }
    }

	public void preOrder()
	{	if(!this.isEmpty())
			preOrder(this.root);
	}

    public void preOrder(Node root)
    {
        System.out.print(root + " ");
		if(root.getLeft() != null)
        {   preOrder(root.getLeft());
        }

        if(root.getRight() != null)
        {   preOrder(root.getRight());
        }
    }

	public void postOrder()
	{	if(!this.isEmpty())
			postOrder(this.root);
	}
    
    public void postOrder(Node root)
    {
		if(root.getLeft() != null)
        {   postOrder(root.getLeft());
        }

        if(root.getRight() != null)
        {   postOrder(root.getRight());
        }

        System.out.print(root + " ");
    }

}
