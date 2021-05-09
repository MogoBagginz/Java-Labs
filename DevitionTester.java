/*
	Aurthur:	Murali Wood
	Tite:		DevitionTester
	Created:	12/10/2018
	Verstion:	1.0
*/

import java.util.Scanner;

public class DevitionTester
{
	public static void main(String[] args)
	{
		// ----- Assign Scanner -----
		
		Scanner in = new Scanner(System.in);
		
		// ----- Take Input From User -----
		
		System.out.print("\nEnter first number :>");
		int numberOne = in.nextInt();
		System.out.print("\nEnter second number :>");
		int numberTwo = in.nextInt();
		
		// ----- Change Ints To Minus ----- 
		
		int minusNOne = numberOne * (-1);
		int minusNTwo = numberTwo * (-1);
		
		// ----- Convert Ints To Doubles -----
		
		double numberOneDouble = (double)numberOne;
		double numberTwoDouble = (double)numberTwo;
		
		// ----- Change Doubles To Minus -----
		
		double minusNOneDouble = numberOneDouble * (-1);
		double minusNTwoDouble = numberTwoDouble * (-1);
		
		// ----- Printout One (Integer Results) -----
		
		System.out.println("\nInteger Divition");
		System.out.printf("\nQuotient %2d  / %2d  = %2d   Remainder %2d  %% %2d  = %2d", 
						   numberOne, numberTwo, (numberOne / numberTwo), 
						   numberOne, numberTwo, (numberOne % numberTwo));
		System.out.printf("%n         %2d  / %2d  = %2d             %2d  %% %2d  = %2d", 
						   numberOne, minusNTwo, (numberOne / minusNTwo), 
						   numberOne, minusNTwo, (numberOne % minusNTwo));
		System.out.printf("%n         %2d  / %2d  = %2d             %2d  %% %2d  = %2d", 
						   minusNOne, numberTwo, (minusNOne / numberTwo), 
						   minusNOne, numberTwo, (minusNOne % numberTwo));
		System.out.printf("%n         %2d  / %2d  = %2d             %2d  %% %2d  = %2d", 
						   minusNOne, minusNTwo, (minusNOne / minusNTwo), 
						   minusNOne, minusNTwo, (minusNOne % minusNTwo));
		
		// ----- Printout Two (Double Results) -----
		
		System.out.println("\n\nFloating Point Devition (No Remainder)");
		System.out.printf("\nQuotient %5.2f  / %5.2f  = %5.2f", 
						   numberOneDouble, numberTwoDouble, (numberOneDouble / numberTwoDouble), 
						   numberOneDouble, numberTwoDouble, (numberOneDouble % numberTwoDouble));
		System.out.printf("%n         %5.2f  / %5.2f  = %5.2f", 
						   numberOneDouble, minusNTwoDouble, (numberOneDouble / minusNTwoDouble), 
						   numberOneDouble, minusNTwoDouble, (numberOneDouble % minusNTwoDouble));
		System.out.printf("%n         %5.2f  / %5.2f  = %5.2f", 
						   minusNOneDouble, numberTwoDouble, (minusNOneDouble / numberTwoDouble), 
						   minusNOneDouble, numberTwoDouble, (minusNOneDouble % numberTwoDouble));
		System.out.printf("%n         %5.2f  / %5.2f  = %5.2f", 
						   minusNOneDouble, minusNTwoDouble, (minusNOneDouble / minusNTwoDouble), 
						   minusNOneDouble, minusNTwoDouble, (minusNOneDouble % minusNTwoDouble));
	}
}