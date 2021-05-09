/*
	Author:		Murali Wood
	Title:		QuadraticEquations
	Created:	04/10/18
	Version:	1.0
*/

import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquations
{
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		
		// ----- Collect Numbers From User -----
		
		System.out.print("Enter first coefficient :>");
		double coefficientOne = in.nextInt();
		System.out.print("Enter second coefficient :>");
		double coefficientTwo = in.nextInt();
		System.out.print("Enter constant :>");
		double constant = in.nextInt();
		
		// ----- Find coefficientTwo To The Power Of Two -----
		
		double coefficientTwoPow2 = Math.pow(coefficientTwo, 2);
		
		// ----- Find Square Root -----
		
		double squareIn = coefficientTwoPow2 - 4 * coefficientOne * constant;
		
		if (squareIn < 0) // Make square in positive
		{
			squareIn = squareIn * (-1);
		}
		
		double squareOut = Math.sqrt(squareIn);
		
		// ----- Top Line of quadratic formula -----
		
		double topLineMinus = 0 - coefficientTwo - squareOut;
		double topLinePluss = 0 - coefficientTwo + squareOut;
		
		// ----- Bottom Line -----
		
		double answerMinus = topLineMinus / 2 * coefficientOne;
		double answerPluss = topLinePluss / 2 * coefficientOne;
		
		// ----- Print Solutions -----
		
		System.out.print("Solutions: ");
		System.out.println("x = " + answerMinus + " and " + answerPluss);
		
	}
}