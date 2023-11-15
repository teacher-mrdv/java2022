// ITERATIVE implementation (SL)

public class BinarySearch
{
	// Parameters: array and key; returns the index of the key
	// or -1 if the key is not found in the array
    public static int binarySearch(int[] a, int key)
    {
        int low = 0;
        int high = a.length - 1;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (a[mid] == key)
            {	return mid;
            } else if (a[mid] < key)
            {	low = mid + 1;
            } else
            {	high = mid - 1;
            }
        }
        return -1;
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
        System.out.println("binarySearch(a, 1)  " + binarySearch(a, 1));
        System.out.println("binarySearch(a, 24) "+ binarySearch(a, 24));
        System.out.println("binarySearch(a, 88) "+ binarySearch(a, 88));
        System.out.println("binarySearch(a, 99) "+ binarySearch(a, 99));
        System.out.println();
	}
}

