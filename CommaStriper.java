/*
	Aurthur:	Murali Wood
	Title:		CommaStriper
	Created:	17/10/18
	Version:	1.0
	
	Takes a number as a string and removes the commas 
	
*/

import java.util.Scanner;

public class CommaStriper
{
	public static void main (String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		
		// ----- Take A Number From The User -----
		
		System.out.print("Enter an integer between 1,000 and 999,999 :> ");
		String number = in.next();
		
		// ----- Get Length of The String -----
		
		int numberLeng = number.length();
		
		// ----- Remove Comma and Print -----
		
		if (numberLeng == 5)
		{
			String nWithoutComma = number.substring(0, 1) +  number.substring(2, 5);
			System.out.println("The number entered was " + nWithoutComma);
		}
		else if (numberLeng == 6)
		{
			String nWithoutComma = number.substring(0, 2) +  number.substring(3, 6);
			System.out.println("The number entered was " + nWithoutComma);
		}
		else if (numberLeng == 7)
		{
			String nWithoutComma = number.substring(0, 3) +  number.substring(4, 7);
			System.out.println("The number entered was " + nWithoutComma);
		}
		else
		{
			System.out.println("The number you entered was not in the correct format.");
		}
	}	
}