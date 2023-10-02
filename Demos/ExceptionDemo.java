public class ExceptionDemo
{
    public static void main(String args[])
    {	boolean run = true;
        while(run)
        {
            try
            {
                int num = inputNumber();
                IBIO.output("that was correct");
                run = false;
            } catch (Exception e)
			{	IBIO.output(e.getMessage());
				run = true;
			}
        }
	}
	
	//===================================================
	
	public static int inputNumber() throws Exception
	{
		int num = IBIO.inputInt("enter a number between 40 and 50 ");
		if (num < 40)
			throw new Exception("number too small");
		else if (num > 50)
			throw new Exception("number too big");
		return num;
	}

}
