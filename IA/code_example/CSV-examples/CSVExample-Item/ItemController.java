/**
 * ItemController class - basic example of a controller class
 * save and load methods use CSV format
 *
 * @author mdv
 */
import java.util.*;
import java.io.*;

public class ItemController
{

    // for easy access from within and outside the controller class
    public static ArrayList<Item> items = new ArrayList<Item>();

    public static void save() throws IOException
    {
        System.out.println("<<< Saving data >>>");
        File itemFile = new File("item.csv");
        FileWriter fw = new FileWriter(itemFile);
        PrintWriter out = new PrintWriter(fw);	// write mode
        out.println("Serial Number,Name,Price"); // CSV heading
        for (Item i : items)  //loop to save each element ->
        {
            out.print(i.getSerialNumber() + ",");//of the list to the file
            out.print(i.getName() + ",");
            out.println(i.getPrice());
        }
        out.close();
        System.out.println("Data file saved."); // optional
    }

    public static void load() throws IOException
    {
        System.out.println("<<< Loading data >>>");
        File itemFile = new File("item.csv");
        if (!itemFile.exists())
        {
            itemFile.createNewFile();
            System.out.println("Data file not found.");
            add(); // or go and add an item -->addItem()
        }
        FileReader fr = new FileReader(itemFile);
        BufferedReader in = new BufferedReader(fr); //read mode
        int newSerialNumber = 0;
        String newName = "";
        double newPrice = 0;
        String temp;
        items.clear();
        temp = in.readLine(); // read the heading and ignore it
        while (in.ready())  // read lines while file has content
        {
            temp = in.readLine();
            String[] line = temp.split(",");
            newSerialNumber = Integer.parseInt(line[0]);
            newName = line[1];
            newPrice = Double.parseDouble(line[2]);
            Item newItem = new Item(newSerialNumber, newName, newPrice);
            items.add(newItem);
        }
        in.close();
        System.out.println("Data file loaded.");// optional
    }

    public static void add() throws IOException
    {   // NOTE that there is no validation!!!
        int newSerialNumber = IBIO.inputInt("Serial number: ");
        String newName = IBIO.input("Item name: ");
        double newPrice = IBIO.inputDouble("Item price: $");
        Item newItem = new Item(newSerialNumber, newName, newPrice);
        items.add(newItem);
        save();
    }

    public static void list(String title)
    {
		System.out.println("*** " + title + " ***");
        for (Item i : items)
        {
            System.out.println(i);
        } 
    }
    
    public static void detailedList(String title)
    {
		System.out.println("*** " + title + " ***");
        for (Item i : items)
        {
            System.out.println(i.getDetails());
        } 
    }

    public static void main(String[] args) throws IOException
    {
        File itemFile = new File("item.csv");
        if (!itemFile.exists())
        {
            itemFile.createNewFile();
            System.out.println("Data file not found.");
            for (int i = 0; i < 3; i++)
            {
                add();
            }
        }

        load();
        list("Summary");
        System.out.println();
        detailedList("Detailed Item List");
    }

}
