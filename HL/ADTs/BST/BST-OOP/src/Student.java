public class Student
{
	private int id;
	private String name;
	
	public Student()
	{ }
	
	public Student(int id, String name)
	{	this.id = id;
		this.name = name;
	}
	
	public String getName()
	{	return this.name;
	}
	
	public int getID()
	{	return this.id;
	}
	
	public void setName(String name)
	{	this.name = name;
	}
	
	public void setID(int id)
	{	this.id = id;
	}

	public String toString()
	{	String output = this.getID() + ": " + this.getName();
		return output;
	}
        
}
