public class Person
{
	private int id;
	private String name;
	private String phone;
	private static int count;
	
	public Person()
	{	count++;
	}
		
	public Person(int id, String name, String phone)
	{	this.id = id;
		this.name = name;
		this.phone = phone;
		count++;
	}
	
        public void setID(int id)
        {   this.id = id;
        }
        
	public void setName(String name)
	{	this.name = name;
	}
	
	public void setPhone(String phone)
	{	this.phone = phone;
	}
	
	public int getID()
	{	return this.id;
	}
	
	public String getName()
	{	return this.name;
	}
	
	public String getPhone()
	{	return this.phone;
	}
        
        public static int getCount()
        {   return count;
        }
	
	public String toString()
	{   String output = "";
            output += "ID   : " + this.getID();
            output += "\nName : " + this.getName();
            output += "\nPhone: " + this.getPhone() + "\n";
            return output;
	}
		
}
