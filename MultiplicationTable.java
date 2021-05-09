/*
	Author:		Murali Wood
	Title:		MultiplicationTable
	Created:	05/10/18
	Version:	1.0
*/

import java.util.Scanner;

public class MultiplicationTable
{
	public static void main(String[] args)
	{
		
		// ---- Ask For Input ----
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter any number and we will generate ");				// ask for user input of a number
		System.out.print("the times table for that number.\nInsert number:> ");	
		
		// ---- Take Input -----
		
		int number = in.nextInt();												// assign user input to variable number
		System.out.println("You have selected " + number + " for your custom times table.\n"); // tell user their number
		
		// ---- Create Table -----
		
		int count = 1;					// multiply the inputed number by this
		while(count < 20)
		{
			int multipliedNumber = number * count;	//
			System.out.println(" " + count + " x " + number + " = " + multipliedNumber);
			count = count + 1;
		}
		System.out.println("\nAll done!!");
	}

}