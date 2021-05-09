/*
	Author:		Murali Wood
	Title:		Numbers
	Created:	04/10/18
	Version:	1.0
*/

public class Numbers
{
	public static void main(String[] arsg)
	{
		
		// ----- Declare and Assign Variables -----
		
		int num1 = 2;
		int num2 = 4;
		int num3 = 6;
		
		// ----- Printout One ----- 
		
		System.out.println("Original:\nNumber 1 = " + num1);
		System.out.println("\tNumber 2 = " + num2);
		System.out.println("\tNumber 3 = " + num3);

		// ----- Arithmetic One -----
		
		num1 = num2 * num3; 
		num1 = num1 - 1;	
		
		// ----- Printout Two -----
		
		System.out.println("Adapted:\nNumber 1 = " + num1);
		System.out.println("\tNumber 2 = " + num2);
		System.out.println("\tNumber 3 = " + num3);
		
		// ----- Arithmetic Two -----
		
		int answer = num1 / 5;
		
		// ----- Final Printout -----
		
		System.out.println("Answer: " + answer);
	}
}