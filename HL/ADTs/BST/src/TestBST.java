public class TestBST
{
    public static void main(String[] args)
    {
        System.out.println(">>> section 02");
        // Let's instantiate our BST (which will be empty as the...
        // empty constructor has been invoked)
        BinarySearchTree myBST01 = new BinarySearchTree();
        myBST01.insert("Neven");
        myBST01.insert("Thomas");
        myBST01.insert("Yeyun");
        myBST01.insert("Danya");
        myBST01.insert("Eshan");
        myBST01.insert("Maithli");
        myBST01.insert("Pahal");
        System.out.println("Searching BST for Pahal: "+ myBST01.search("Pahal"));
        System.out.println("Searching BST for Alan: "+ myBST01.search("Alan"));
        System.out.println("\nTRAVERSALS\nPreOrder: ");
        myBST01.preOrder();
        System.out.println("\n\nInOrder: ");
        myBST01.inOrder();
        System.out.println("\n\nPostOrder: ");
        myBST01.postOrder();

        System.out.println("\n\n");
        System.out.println(">>> section 02");
        // here we instantiate a BST immediately with its root
        BinarySearchTree myBST02 = new BinarySearchTree("Mikkel");
        myBST02.insert("Chegwin");
        myBST02.insert("Yaj");
        myBST02.insert("Armaan");
        myBST02.insert("Walter");
        myBST02.insert("Yaj");
        System.out.println("Searching BST for Yaj: "+ myBST02.search("Yaj"));
        System.out.println("Searching BST for Bruce: "+ myBST02.search("Bruce"));
        System.out.println("\nTRAVERSALS\nPreOrder: ");
        myBST02.preOrder();
        System.out.println("\n\nInOrder: ");
        myBST02.inOrder();
        System.out.println("\n\nPostOrder: ");
        myBST02.postOrder();
    }
}

/*
>>>> Expected output <<<<

TRAVERSALS
PreOrder:
Neven Danya Eshan Maithli Thomas Pahal Yeyun

InOrder:
Danya Eshan Maithli Neven Pahal Thomas Yeyun

PostOrder:
Maithli Eshan Danya Pahal Yeyun Thomas Neven

TRAVERSALS
PreOrder:
Mikkel Chegwin Armaan Yaj Walter

InOrder:
Armaan Chegwin Mikkel Walter Yaj

PostOrder:
Armaan Chegwin Walter Yaj Mikkel
 */