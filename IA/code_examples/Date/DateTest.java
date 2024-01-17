package useful;

// https://www.timeanddate.com/date/duration.html  <<< to test results

import java.util.Scanner;

public class DateTest
{

    public static void dateDiff(Date d1, Date d2)
    {
        System.out.println("Date 1 = " + d1 + "\tDate 2 = " + d2);
        /*		System.out.println(date1.compareTo(date2)); //NEGATIVE when d1 < d2
		System.out.println(date2.compareTo(date1)); //POSITIVE when d1 > d2
		System.out.println(date2.compareTo(date2)); //ZERO when equal
         */
        System.out.println(d1.differenceInDays(d2));
    }

    public static void main(String args[]) throws Exception
    {
        Date date1 = new Date(); // test empty constructor
        Date testDate = new Date(6, 9, 2016);
        Date date2 = new Date();
        Date today = new Date();
        date1.setYear(2016);
        date1.setMonth(9);
        date1.setDay(6);
        System.out.println("Today is " + today);
        System.out.print(date1);
        System.out.println(" the output should be 6/9/2016");
        System.out.println("This should be true: " + date1.equals(testDate));
        date1.setMonth(12);
        date1.setDay(27);
        try
        {
            System.out.println(">>> date2 = new Date(31, 9, 2014) should throw an invalid date exception");
            date2 = new Date(31, 9, 2014);
        } catch (Exception e)
        {	// process error here 
            System.out.println(e.getMessage());
        }
        date1.setDate(25, 12, 2016);
        date2.setDate(8, 9, 2016);
        System.out.println(">>> Date difference-Answer should be 108");
        dateDiff(date1, date2);
        date1.setDate(1, 1, 2000);
        date2.setDate(8, 9, 2016);
        System.out.println(">>> Date difference-Answer should be 6094");
        dateDiff(date1, date2);
        System.out.print(">>> Validating date 30/2/2018 (false): ");
        System.out.println(Date.isValidDate(30, 2, 2018));

        // validations using do-while only --- this cannot validate formats!
        boolean error;
        Scanner input = new Scanner(System.in);
        do
        {
            error = false;
            System.out.print("Input a date (DD/MM/YYYY) <testing String to Date> ");
            String dateString1 = input.nextLine();
            if(Date.isValidDate(dateString1))
            {   Date inputDate1 = Date.stringToDate(dateString1);
                System.out.println(inputDate1);
            } else {
                error = true;
                System.out.println("Invalid date <testing Date.isValidDate(String)>");
            }
        } while (error);
        
        // validation using do-while loop and exceptions --- optimal and complete validation
        Date inputDate2 = new Date();
        do
        {
            error = false;
            try
            {
                System.out.print("Input a date (DD/MM/YYYY) <testing Date(String) constructor> ");
                String dateString2 = input.nextLine();
                inputDate2 = new Date(dateString2);
            } catch (Exception e)
            {
                System.out.println(e.getMessage());
                error = true;
            }
        } while (error);
        System.out.println(inputDate2);
        input.close();
    }
}
