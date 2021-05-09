/*
	Aurthur:	Murali Wood
	Title:		CompoundInterest
	Created:	13/10/18
	Version:	1.0
*/

import java.util.Scanner;

public class CompoundInterest
{
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		
		// ----- Input initial balance and interest rate -----
		
		System.out.print("\nEnter initial balance :> ");
		double initialBalance = in.nextDouble();
		
		System.out.print("Enter interest rate (%):> ");
		double interestRate = in.nextDouble();
		
		// from % to decimal
		interestRate = interestRate / 100;
		
		// ----- Math -----
		
		double balanceYr1 = initialBalance + (initialBalance * interestRate);
		double balanceYr2 = balanceYr1 + (balanceYr1 * interestRate);
		double balanceYr3 = balanceYr2 + (balanceYr2 * interestRate);
		
		// ----- Printout Results -----
		
		System.out.printf("%nEnd of Year 1:     %5.2f", balanceYr1);
		System.out.printf("%nEnd of Year 2:     %5.2f", balanceYr2);
		System.out.printf("%nEnd of Year 3:     %5.2f", balanceYr3);
	}
}