/*
	Author:		Murali Wood
	Title:		PowersOfTwo
	Created:	04/10/18
	Version:	1.0
*/

import java.lang.Math;

public class PowersOfTwo
{
	public static void main(String[] args)
	{
		
		// ----- Assign Variables -----
		
		int number = 0;
		
		// ----- Printout Table Headers -----
		
			System.out.println(" n          2^n");
			System.out.println("***         ***");
			
		// ----- Printout Table Contents -----  
			
		while(number < 17)
		{
	
			double answer = Math.pow(2, number);
			int answerInt = (int) answer;

			System.out.format(" %d    %,8d%n", number, answerInt);
			number = number + 1;
		}
	}
}