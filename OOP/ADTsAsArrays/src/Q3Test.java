/*
 * Q3 Practical SL paper 1-based programming test
 * mdv/2024
 *
 */


public class Q3Test
{
    static String[] names = { "Adams, Lana", "Allen, Mary", "Baker, Lilly", "Brown, Lea", "Fox, Tea", "Labar, Tanya", "Lee, Mae", "Miller, Ann", "Palmer, Ella", "Wood, Sarah" };
    static double[] scores= { 7.8, 6.5, 5.4, 9.2, 6.2, 8.5, 8.8, 5.1, 6.4, 9.1 };

    public static void printArrays()
    {
        for(int i = 0; i<names.length; i++)
        {
            System.out.println(names[i] + " had a score of " + scores[i]);
        }
    }

    public static double average()
    {
        double sum =0;
        int k = scores.length;
        for(int j = 0; j < scores.length; j++)
        {
            sum = sum + scores[j];
        }
        return sum / k;

    }

    public static int aboveAverageScore()
    {
        int c = 0;
        int k = 0;
        double average = average();
        while(k<scores.length)
        {
            if(scores[k]>average)
            {
                c = c+1;
            }
            k++;
        }
        return c;
    }

    public static int binarySearch(String gymnastName)
    {	// return -1 if not found
        int low = 0;
        int high = names.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int compareResult = gymnastName.compareTo(names[mid]);

            if (compareResult == 0) {
                return mid;
            } else if (compareResult < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main (String[] args)
    {
        printArrays();
        System.out.println("Average score []: " + average() );
        System.out.println("Number of gymnasts above average []: " + aboveAverageScore() );
        System.out.println("Adams, Lana's score is [7.8]: " + scores[binarySearch("Adams, Lana")] );
        System.out.println("Allen, Mary's score is [6.5]: " + scores[binarySearch("Allen, Mary")] );
        System.out.println("Wood, Sarah's score is [9.1]: " + scores[binarySearch("Wood, Sarah")] );
        System.out.print("Peterson, Tina's score is [name not found]: ");
        if(binarySearch("Peterson, Tina") == -1 )
        {
            System.out.print("name not found");
        } else {
            System.out.print(scores[binarySearch("Peterson, Tina")]);
        }

    }
}

