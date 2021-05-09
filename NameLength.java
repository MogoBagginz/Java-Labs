/*
	Aurthur: 	Murali Wood
	Title:		NameLength
	Created:	16/10/18
	Version:	1.1
	
	This program takes the users first and second name and prints the combined length.
	
*/

import java.util.Scanner;

public class NameLength
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		// ----- Take Name From User -----
		
		System.out.print("Enter your forename :> ");
		
		String forename = in.next();
		
		System.out.print("Enter your surname :> ");
		
		// concatenates the inputs
		String wholeName = forename + " " + in.next(); 
		
		// ----- Printout Full Name And Length -----
		
		System.out.println("Hello " + wholeName);
		
		System.out.println("The length of your name is " + wholeName.length());
	}
}