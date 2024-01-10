public class Country
{
	private String name;
	private String prefix;
		
	public Country(String name, String prefix)
	{	this.name = name;
		this.prefix = prefix;
	}
	
	public Country()
	{	}
	
    public String getName()
    {	return name;
    }

    public String getPrefix()
    {	return prefix;
    }

    public void setName(String name)
    {	this.name = name;
    }

    public void setPrefix(String prefix)
    {	this.prefix = prefix;
    }
    
    public String toString()
    {	return this.name + " " + this.prefix;
	}
}

