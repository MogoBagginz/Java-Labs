/*
	Aurthur: Murali Wood
	Title: InputTester
	Date: 04/10/18
	Version: 1.0
*/

import java.util.Scanner;					// inports Scanner library

public class InputTester
{
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);	

		// ----- Printout One -----		
								
		System.out.println("\t\tMugz's AMAZING number multiplyer!!!");			
		System.out.println("Enter any whole number and we'll muliply it by one ");
		System.out.println("thousand and twenty four!!!");
		System.out.println("Enter a number of your choice here:> "); 	

		// ----- User Input -----

		int number = in.nextInt();

		// ----- Math -----												

		int multipliedNumber = number * 1024;

		// ----- Printout Two -----

		System.out.print("Your number " + number + " multiplied by 1024 is ");
		System.out.println(multipliedNumber + " ...\n\t\tFANTASTIC!!!\nThrow away your ");
		System.out.println("calculaters and give me your money.");
	}
}