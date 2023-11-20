public class BTNode {
    int data;
    BTNode right;
    BTNode left; // self-reference (Node has another node inside of it)

    // empty constructor creates an empty node
    public BTNode() { }

    // custom constructor that creates and initialises a node
    public BTNode(int d)
    {
        data = d;
    }

    // is the node linked to another node or does it point to null?

    public String toString()
    {
        return this.data + "";
    }
}
