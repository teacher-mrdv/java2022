/*
 * Linked list with Person object
 */
public class LinkedListTest
{
	public static void addPerson(LinkedList l)
	{
		int id;
		boolean idExists = true;
		do
		{	id = inputInt("Enter ID: ");
			idExists = l.contains(id);
			if( !idExists )
			{
				String name = input("Enter name: ");
				String phone = input("Phone number: ");
				Person newPerson = new Person(id, name, phone);
				l.add(newPerson);
			}
			else
			{	System.out.println(id + " already exists - please reenter.");
			}
		} while( idExists );
		// explore the rest of the methods of LinkedList!
	}

	public static void main (String args[])
	{
		LinkedList list = new LinkedList();
		// some data to test your methods
        Person newPerson = new Person(10000, "Barry", "+44 9874 1236");
        list.add(newPerson);
        newPerson = new Person(10001, "Iris", "+65 8574 6231");
        list.add(newPerson);
        newPerson = new Person(10010, "Wally", "+44 2583 4654");
        list.add(newPerson);
        newPerson = new Person(10011, "Joe", "+65 8534 7812");
        list.add(newPerson);

		addPerson(list);
		System.out.println(list);

		/* HW: add the following methods:
			a main menu with options to:
			* look for a person's record and show it
				and then offer options to:
				-edit a person's information (NOT THE ID)
				-delete the person's record
				[if there is another record with a similar name, display it ( name.startsWith(lookup) ) ]
		 	* list all records (line 40)
			look at our old project 1 for examples
		*/


	}

	//
	// IBIO methods for simplified input of data ============================
	//
    static String input(String prompt)
    {	String inputLine = "";
        System.out.print(prompt);
        try
        {inputLine = (new java.io.BufferedReader(
                    new java.io.InputStreamReader(System.in))).readLine();}
        catch (Exception e)
        { String err = e.toString();
            System.out.println(err);
            inputLine = "";
        }
        return inputLine;
    }

    static String inputString(String prompt)
    {	return input(prompt);
    }

    static String input()
    {	return input("");
    }

    static int inputInt()
    {	return inputInt(""); }

    static double inputDouble()
    {	return inputDouble(""); }

    static char inputChar(String prompt)
    {	char result=(char)0;
        try{result=input(prompt).charAt(0);}
        catch (Exception e){result = (char)0;}
        return result;
    }

    static byte inputByte(String prompt)
    {	byte result=0;
        try{result=Byte.valueOf(input(prompt).trim()).byteValue();}
        catch (Exception e){result = 0;}
        return result;
    }

    static int inputInt(String prompt)
    {	int result=0;
        try{result=Integer.valueOf(
                input(prompt).trim()).intValue();}
        catch (Exception e){result = 0;}
        return result;
    }

    static long inputLong(String prompt)
    {	long result=0;
        try{result=Long.valueOf(input(prompt).trim()).longValue();}
        catch (Exception e){result = 0;}
        return result;
    }

    static double inputDouble(String prompt)
    {	double result=0;
        try{result=Double.valueOf(
                input(prompt).trim()).doubleValue();}
        catch (Exception e){result = 0;}
        return result;
    }

    static boolean inputBoolean(String prompt)
    {	boolean result=false;
        try{result=Boolean.valueOf(
                input(prompt).trim()).booleanValue();}
        catch (Exception e){result = false;}
        return result;
    }


}

