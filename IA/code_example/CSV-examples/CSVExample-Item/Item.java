/**
 * Item class - generic example of an entity class
 *
 * @author mdv
 */
public class Item
{

    private int serialNumber;
    private String name;
    private double price;

    public Item()
    {
    }

    public Item(int serialNumber, String name, double price)
    {
        this.serialNumber = serialNumber;
        this.name = name;
        this.price = price;
    }

    public int getSerialNumber()
    {
        return this.serialNumber;
    }

    public void setSerialNumber(int serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return this.price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

	public String getDetails()
	{
        String output = String.format("Serial Number: %04d", this.serialNumber);
        output = output + "\nItem name    : " + this.name;
        output = output + String.format("\nPrice        : $%,.2f \n", this.price);
        return output;
	}

    public String toString()
    {
        // https://www.geeksforgeeks.org/java-string-format-examples/
        // https://dzone.com/articles/java-string-format-examples
        // the formatting can also be used with System.out.printf() 
        String output = String.format("Serial Number: %04d", serialNumber) +
			String.format(" | Item name: %-20s", this.name) +
			String.format(" | Price: $%,.2f", this.price);
        return output;
    }

}
