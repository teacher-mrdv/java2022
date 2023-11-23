import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

// SL = collection; HL = Linked list
public class JavaLinkedListDemo
{

    public static void bubbleSort(String[] a)
    {
        int c = 0;
        int i = a.length;
        boolean swapped = true;
        while(swapped)
        {
            swapped = false;
            for(int j = 0; j < i-1; j++)
            {
                c++;
                if(a[j].compareToIgnoreCase(a[j+1]) > 0 )
                {
                    String temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }
            }
            i--;
            //System.out.print("\t"); printArray(a);
        }
        //System.out.println("comparisons = " + c);
    }


    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        for(int i = 0; i < 5; i++)
        {
            System.out.print("Enter a string = ");
            String s = in.nextLine();
            list.add(s);
        }
        //System.out.println(list.size());
        int size = 0;
        // in IB JETS, list.hasNext()
        Iterator<String> iterator = list.iterator();
        while( iterator.hasNext() )
        {
            //  = list.getNext()
            iterator.next();
            size++;
        }
        System.out.println("List size = " + size);
        String[] sArray = new String[size];
        for(int i = 0; i < size; i++)
        {
            sArray[i] = list.remove();
        }
        bubbleSort(sArray);
        for(int i = 0; i < size; i++)
        {
            list.add(sArray[i]);
        }
        System.out.println(list);

    }
}
