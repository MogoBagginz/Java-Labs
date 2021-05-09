/*
	Author:	Murali Wood
	Title:	IntegerBreaker
	Created:	11/10/18
	Version:	1.0
*/

import java.util.Scanner;

public class IntegerBreaker
{
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		
		// ----- Ask For Number -----
		
		System.out.println("Enter a positive integer that is 6 characters long :> ");
		String number = in.nextLine();
		
		// ----- Assign Variable To Each Number
		
		char number0 = number.charAt(0);
		char number1 = number.charAt(1);
		char number2 = number.charAt(2);
		char number3 = number.charAt(3);
		char number4 = number.charAt(4);
		char number5 = number.charAt(5);
		
		// ----- Print Answers -----
		
		System.out.println("Here we go ... ");
		System.out.printf("%c %c %c %c %c %c", number0, number1, number2, number3, number4, number5);

	}
}