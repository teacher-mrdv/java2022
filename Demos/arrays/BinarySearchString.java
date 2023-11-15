// ITERATIVE implementation (SL)

public class BinarySearchString
{
	// Parameters: array and key; returns the index of the key
	// or -1 if the key is not found in the array
    public static int binarySearch(String[] as, String key)
    {
        int low = 0;
        int high = as.length - 1;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if ( as[mid].equalsIgnoreCase(key) )
            {	return mid;
            } else if (as[mid].compareToIgnoreCase(key) < 0)
            {	low = mid + 1;
            } else
            {	high = mid - 1;
            }
        }
        return -1;
    }



    public static void main(String[] args)
    {
        String[] a =
        { "Diya", "Emi H", "Eva", "Ling", "Nina", "Sneha", "Veronica ", "Wally" };
        System.out.println("Array size = " + a.length);
        for (int i = 0; i < a.length; i++)
        {
            System.out.print( a[i] + " ");
        }
        System.out.println();
        System.out.println("binarySearch(a, \"eva\")  " + binarySearch(a, "eva"));
        System.out.println("binarySearch(a, \"Mary\") "+ binarySearch(a, "Mary"));
        System.out.println("binarySearch(a, \"LiNG\") "+ binarySearch(a, "LiNG"));
        System.out.println("binarySearch(a, \"EVE\")  "+ binarySearch(a, "EVE"));
        System.out.println();
	}
}

