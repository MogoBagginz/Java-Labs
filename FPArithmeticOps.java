/*
	Author:		Murali Wood
	Title:		FPArithmeticOps
	Created:	11/10/18
	Version		1.0
*/

import java.util.Scanner;
import java.lang.Math;

public class FPArithmeticOps
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		// ----- Get Numbers From User -----
		
		System.out.print("Enter a double  :> ");
		double numberOne = in.nextDouble();
		System.out.print("Enter a double  :> ");
		double numberTwo = in.nextDouble();
		
		// ----- Printout Answers -----
		
		// %10 = left justify 
		
		System.out.printf("%nSum:          %10.2f", numberOne + numberTwo);
		System.out.printf("%nDifference:   %10.2f", numberOne - numberTwo);
		System.out.printf("%nProduct:      %10.2f", numberOne * numberTwo);
		System.out.printf("%nQuotient:     %10.2f", numberOne / numberTwo);
		System.out.printf("%nMean:         %10.2f", (numberOne + numberTwo) / 2);
		
		// ----- Max and Minus -----
		
		// because they are doubles use '==' instead of equals()
		
		if (numberOne == numberTwo)
		{
			System.out.print("\nNo max or minus because the two numbers are equal.");
		}
		else 
		{
			double max = Math.max(numberOne, numberTwo);
			double min = Math.min(numberOne, numberTwo);
			System.out.printf("%nMax:          %10.2f", max);
			System.out.printf("%nMin:          %10.2f", min);
		}
	}
}