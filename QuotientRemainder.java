/*
	Aurthur:	Murali Wood
	Title:		QuotientRemainder
	Created:	12/10/18
	Version:	1.0
*/

import java.util.Scanner;

public class QuotientRemainder
{
	public static void main(String[] args)
	{
		// ----- Declare Scanner -----
		Scanner in = new Scanner(System.in);
		
		// ------ Printout One -----
		
		System.out.println("Quotient and Remainder");
		System.out.println("**********************");
		
		// ----- Take User Inputs -----
		
		System.out.print("Enter dividend :>");
		int dividend = in.nextInt();

		System.out.print("Enter divisor :>");
		int divisor = in.nextInt();
		
		if (divisor == 0)
		{
			System.out.print("Divisor must not be zero.\nEnter divisor:>");	
			divisor = in.nextInt();
		}
		// ----- Arithmetic One -----
		
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		
		// ----- Final Printout -----
		
		System.out.println("Quotient = " + quotient + "           Remainder = " + remainder);
		
	}
}