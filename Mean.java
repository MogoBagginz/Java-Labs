/*
	Aurthur:	Murali Wood
	Title:		Mean
	Created:	12/10/18
	Version:	1.0
*/

import java.util.Scanner;

public class Mean
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		// ----- Take Numbers From User -----
		
		System.out.print("Enter first number :> ");
		int first = in.nextInt();
		System.out.print("Enter second number :> ");
		int second = in.nextInt();
		System.out.print("Enter third number :> ");
		int third = in.nextInt();
		System.out.print("Enter fourth number :> ");
		int fourth = in.nextInt();
		System.out.print("Enter fifth number :> ");
		int fifth = in.nextInt();
		
		// ----- Math -----
		
		int sum = first + second + third + fourth + fifth;
		int mean = sum / 5;
		
		// ----- Printout -----
		
		System.out.printf("The numbers entered were %d %d %d %d and %d%n", 
						   first, second, third, fourth, fifth);
		System.out.printf("Sum:         %d + %d + %d + %d + %d = %d%n", 
						   first, second, third, fourth, fifth, sum);
		System.out.printf("Mean:        %d %n", mean);
	}
}