/*
	Binary search tree node
 */
public class BNode
{
	private BNode left;
	private BNode right;
	private Student data;		// 'data' TYPE has to be changed

	public BNode(Student data)	// 'data' TYPE has to be changed
	{
		this.data  = data;
		this.left  = null;
		this.right = null;
	}

	public BNode getLeft()
	{
		return left;
	}

	public void setLeft(BNode left)
	{
		this.left = left;
	}

	public BNode getRight()
	{
		return right;
	}

	public void setRight(BNode right)
	{
		this.right = right;
	}

	public Student getData()
	{
		return data;
	}

	public void setData(Student data)
	{
		this.data = data;
	}

	public String toString()
	{
		return data.toString();
	}

}

