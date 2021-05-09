/*
	Aurthur: 	Murali Wood
	Title:		TimeInterval
	Created:	13/10/18
	Version:	1.0
*/

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.duration;

public class TimeInterval
{
	public static void main(String[] args) throws ParseException
	{
		Scanner in = new Scanner(System.in);
		
		// Sets up time format
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH.mm.ss"); 
		
		// ----- Printout One Title -----
		
		System.out.println("Time Interval Calculator");
		System.out.println("************************");
		
		// ----- Take Time One from user -----
		
		System.out.print("Enter the start time in 24 hour format (HH.mm.ss):> ");
		String dateOne = in.next();
		// Converts and formats string to date variable
		Date timeOne = dateFormat.parse(dateOne);
		System.out.println("The starting time is " + dateFormat.format(timeOne));
		
		// ----- Take Time Two from user -----
		
		System.out.print("Enter the ending time in 24 hour format (HH.mm.ss):> ");
		String dateTwo = in.next();
		// Converts and formats string to date variable
		Date timeTwo = dateFormat.parse(dateTwo);
		System.out.println("The ending time is " + dateFormat.format(timeTwo));
		
		// ----- Find First, Last Time and Equal times -----
		
		if (timeOne.compareTo(timeTwo) < 0)
		{
			// timeOne is before timeTwo
			System.out.println("timeOne is before timeTwo");
			
		}
		else if (timeOne.compareTo(timeTwo) > 0)
		{
			// timeOne is after timeTwo
			System.out.println("timeOne is after timeTwo");
		}
		else if (timeOne.compareTo(timeTwo) == 0)
		{
			// timeOne is equal to Time Two
			System.out.println("timeOne is equal to timeTwo");
		}
	}
}