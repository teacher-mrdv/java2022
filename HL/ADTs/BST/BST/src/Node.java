public class Node
{
    private Node left;
    private String data;
    private Node right;

    public Node(String data)
    {   this.data = data;
    }

    public Node getLeft()
    {   return left;
    }

    public void setLeft(Node left)
    {   this.left = left;
    }

    public String getData()
    {   return data;
    }

    public void setData(String data)
    {   this.data = data;
    }

    public Node getRight()
    {   return right;
    }

    public void setRight(Node right)
    {   this.right = right;
    }

    public String toString()
    {   return data;
    }
}
