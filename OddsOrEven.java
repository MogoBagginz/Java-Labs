/*
	Aurthur:	Murali Wood
	Title:		OddsOrEven
	Created:	02.11.18
	Version:	1.0
	
	When a user enters a positive integer the program tell you if it is odd or even
	
*/

import java.util.Scanner;

public class OddsOrEven
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		// ----- Printout 1 - Ask for number / explaining the (-1) escape code -----
		
		System.out.print("To exit at any time, Enter '-1'.\nEnter number: > ");
		
		// ----- Assign Variables -----
		
		int num = in.nextInt();
		boolean even = true;
			
		while ((num < -1) || (num > -1))
		{	
			// if even
			if ((num % 2) == 0)
			{
				even = true;
			}
			// if odd
			else
			{
				even = false;
			}
			
			// ----- Printout 2 - If It Is Odd Or Even -----
			
			if (even == true)
			{
				System.out.println("The number you entered is even.");
			}
			else
			{
				System.out.println("The Number you entered is odd.");
			}	
			
			// ----- Printout 3 - Enter number before repeating -----
			
			System.out.print("You can try again but if you want. /n Enter number: > ");
			num = in.nextInt();
		
		}
	}
}