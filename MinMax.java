/*
	Aurthur:		Murali Wood
	Title:			MinMax
	Created:		01.11.18
	Version:		1.0

	Determines highest and lowest number out of 2 or three numbers.
	
*/

import java.util.Scanner;

public class MinMax
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		// ----- Assign Variables -----
		
		int max = 0;
		int min = 0;
		
		// ----- Printout 1 - Take Numbers From User -----
		
		System.out.print("Give us a number :>");
		int num1 = in.nextInt();
		System.out.print("Go on then ... and another one :>");
		int num2 = in.nextInt();
		System.out.print("Please, please, please. Just one more number :>");
		int num3 = in.nextInt();
		
		
		// Find highest number
		if ((num1 > num2) && (num1 > num3))
		{
			max = num1;
			//Find lowest number
			if (num2 > num3)
			{	
				min = num3;
			}
			else
			{
				min = num2;
			}
		}
		else if ((num2 > num1) && (num2 > num3))
		{
			max = num2;
			//Find lowest number
			if (num1 > num3)
			{
				min = num3;		
			}
			else
			{
				min = num1;
			}
		}
		else if ((num3 > num1) && (num3 > num2))
		{
			max = num3;
			//Find lowest number
			if (num1 > num2)
			{
				min = num2;
			}
			else
			{
				min = num1;
			}
		}
		
		// ------ Final Printout -----
		
		System.out.println("The biggest number is " + max);
		System.out.println("And The smallest number is " + min);
	}
}