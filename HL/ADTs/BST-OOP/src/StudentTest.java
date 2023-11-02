import java.io.*;
import java.util.*;

public class StudentTest
{
	public static BNode treeID;
	public static BNode treeName;

	public static void insertByID(BNode node, Student data)
	{
		if(treeID == null)
		{
			System.out.println(data + " inserted as root");
			treeID = new BNode(data);
		} else if( data.getID() < node.getData().getID() )
		{
			if(node.getLeft() != null)
			{	insertByID(node.getLeft(), data);
			} else
			{
				System.out.println("< " + data + " inserted to the left of " +
					node.getData());
				node.setLeft( new BNode(data) );
			}
		} else if( data.getID() > node.getData().getID() )
		{
			if (node.getRight() != null)
			{
				insertByID(node.getRight(), data);
			} else
			{
				System.out.println( "> " + data + " inserted to the right of " +
						node.getData() );
				node.setRight(new BNode(data));
			}
		}
    }

	public static void insertByName(BNode node, Student data)
	{
		if(treeName == null)
		{
			System.out.println(data + " inserted as root");
			treeName = new BNode(data);
		} else if( data.getName().compareToIgnoreCase(node.getData().getName()) < 0 )
		{
			if(node.getLeft() != null)
			{	insertByName(node.getLeft(), data);
			} else
			{
				System.out.println("< " + data + " inserted to the left of " +
						node.getData());
				node.setLeft( new BNode(data) );
			}
		} else if( data.getName().compareToIgnoreCase(node.getData().getName()) > 0 )
		{
			if (node.getRight() != null)
			{
				insertByID(node.getRight(), data);
			} else
			{
				System.out.println( "> " + data + " inserted to the right of " +
						node.getData() );
				node.setRight(new BNode(data));
			}
		}
    }

	public static void preOrder(BNode node)
	{
		if(node != null)
		{
			System.out.println(node.getData());
			preOrder( node.getLeft() );
			preOrder( node.getRight() );
		}
	}

	public static void inOrder(BNode node)
	{
		if(node != null)
		{
			inOrder( node.getLeft() );
			System.out.println(node.getData());
			inOrder( node.getRight() );
		}
	}

	public static void postOrder(BNode node)
	{
		if(node != null)
		{
			postOrder( node.getLeft() );
			postOrder( node.getRight() );
			System.out.println(node.getData());
		}
	}

    public static void descending(BNode node)
    {
		if(node != null)
		{
			descending( node.getRight() );
			System.out.println(node.getData());
			postOrder( node.getLeft() );
		}
    }


	public static void main (String args[]) throws IOException
	{
		System.out.println();
        load();  // load student list from disk and insert by ID
        System.out.println();
        load2(); // load student list from disk and insert by name
		System.out.println("\nBST by ID ========");
		System.out.println("*pre-order:");
        preOrder(treeID);
        System.out.println("\n*in-order:");
        inOrder(treeID);
        System.out.println("\n*post-order:");
        postOrder(treeID);
        System.out.println("\n*descending order:");
		descending(treeID);

		System.out.println("\nBST by Name ======");
		System.out.println("*pre-order:");
        preOrder(treeName);
        System.out.println("\n*in-order:");
        inOrder(treeName);
        System.out.println("\n*post-order:");
        postOrder(treeName);
        System.out.println("\n*descending order:");
        descending(treeName);
	}


	public static void load() throws IOException
	{
		int id;
		String name;
        Student newNode;
		File file = new File("student_data.txt");
		Scanner in = new Scanner(file);
        while( in.hasNext() )
        {	String temp = in.nextLine();
			String[]line = temp.split(",");
			id = Integer.parseInt(line[0]);
        	name = line[1];
			newNode = new Student(id, name);
			insertByID(treeID, newNode);
        } // end while
        in.close();
        //System.out.println("Data loaded from file.\n");
	}

	public static void load2() throws IOException
	{
		int id;
		String name;
        Student newNode;
		File file = new File("student_data.txt");
		Scanner in = new Scanner(file);
        while( in.hasNext() )
        {	String temp = in.nextLine();
			String[]line = temp.split(",");
			id = Integer.parseInt(line[0]);
        	name = line[1];
			newNode = new Student(id, name);
			insertByName(treeName, newNode);
        } // end while
        in.close();
        //System.out.println("Data loaded from file.\n");
	}

}
