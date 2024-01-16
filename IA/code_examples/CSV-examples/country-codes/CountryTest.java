import java.util.*;
import java.io.*;

public class CountryTest
{
	public static ArrayList<Country> countries = new ArrayList<Country>();

	public static void loadCountries() throws IOException
	{	// class worksheets, notes and tests
		countries.clear();
		File file = new File("country-codes.txt");
		FileReader fr = new FileReader(file);
		BufferedReader read = new BufferedReader(fr);
		String line = "";
		while( read.ready() )
		{
			line = read.readLine();
			String[] temp = line.split(",");
			String name = temp[0];
			String prefix = temp[1];
			System.out.println(name + " : " + prefix);
			Country newCountry = new Country(name, prefix);
			countries.add(newCountry);
		}
		read.close();
	}

	public static String getPrefixFromName(String name)
	{	name = name.toLowerCase();
		String temp = "";
		for(Country c: countries)
		{	temp = c.getName().toLowerCase();
			if(temp.contains(name))
			{	return c.getPrefix();
			}
		}
		return "Country prefix not found";
	}

	public static String getNameFromPrefix(String prefix)
	{	for(Country c: countries)
		{	if(c.getPrefix().equals(prefix))
			{	return c.getName();
			}
		}
		return "Country name not found";
	}

	public static void listCountries()
	{	for(Country c: countries)
		{	System.out.println( c );
		}
	}

	static String input(String prompt) // IBIO
	{	String	inputLine = "";
		System.out.print(prompt);
		try
		{	inputLine = (new java.io.BufferedReader(
							new java.io.InputStreamReader(System.in))).readLine();}
		catch (Exception e)
		{	String	err = e.toString();
			System.out.println(err);
			inputLine = "";
		}
		return	inputLine;
	}
	
	public static void main(String[] args) throws IOException
	{	loadCountries(); // must include in your code before you can use
						//  getPrefixFromName() and getNameFromPrefix()
		//listCountries();
		for(int i = 0; i < 2; i++)
		{
			String country = input("Enter country name: ");
			System.out.println( country + "\t" + getPrefixFromName( country ) );
			String prefix = input("Enter prefix: ");
			System.out.println( prefix + "\t" + getNameFromPrefix( prefix ) );
		}
	}
}

