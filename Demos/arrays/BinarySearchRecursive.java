// RECURSIVE implementation (HL)

public class BinarySearchRecursive
{
	// Parameters: array and key; returns the index of the key
	// or -1 if the key is not found in the array
	// need extra "helper" method, to feed in parameters
    public static int binarySearch(int[] a, int x)
    {
        return binarySearch(a, x, 0, a.length - 1);
    }

    // actual method with extra low and high parameters
    private static int binarySearch(int[] a, int x, int low, int high)
    {
        if (low > high)
        {	return -1;
        }
        int mid = (low + high) / 2;
        if (a[mid] == x)
        {	return mid;
        } else if (a[mid] < x)
        {	return binarySearch(a, x, mid + 1, high);
        } else // last possibility: a[mid] > x
        {	return binarySearch(a, x, low, mid - 1);
        }
    }

    public static void main(String[] args)
    {
        int[] a =
        {
            2, 8, 12, 14, 16, 19, 24, 28, 31, 33,
            39, 40, 45, 49, 51, 53, 54, 56, 57, 60,
            63, 69, 77, 82, 88, 89, 94, 96, 97
        };
        System.out.println("Array size = " + a.length);
        for (int i = 0; i < a.length; i++)
        {
            System.out.print( a[i] + " ");
        }
        System.out.println();
        System.out.println("binarySearch(a, 1) " + binarySearch(a, 1));
        System.out.println("binarySearch(a, 24) "+ binarySearch(a, 24));
        System.out.println("binarySearch(a, 88) "+ binarySearch(a, 88));
        System.out.println("binarySearch(a, 99) "+ binarySearch(a, 99));
        System.out.println();
	}
}

