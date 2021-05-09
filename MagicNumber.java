/*
	Aurthur:		Murali Wood
	Title:			MagicNumber
	Created:		01/11/18
	Version:		1.0
	
	This program takes any number and turns it into 8
*/

import java.util.Scanner;

public class MagicNumber
{
	public static void main (String[]args)
	{
		Scanner in = new Scanner(System.in);
		
		// ----- Printout 1 - Intro / Asks for Positive Integer -----
		
		System.out.print("Give me a positive integer, any positive integer... but not that one:>");
		
		// ----- Create Variables -----
		
		int originalNo = in.nextInt();
		int magicNumber = originalNo;
		
		// ----- Magical Math -----
		
		magicNumber = magicNumber - 1;
		magicNumber = magicNumber * 3;
		magicNumber = magicNumber + 12;
		magicNumber = magicNumber / 3;
		magicNumber = magicNumber + 5;
		magicNumber = magicNumber - originalNo;
		
		// ----- Final Print Out -----
		
		System.out.println("The original number is " + originalNo + ".");
		System.out.println("And the magical Magic Number is " + magicNumber + "!!!!!!!!!!!");	
	}
}