/*
	Aurthur:	Murali Wood
	Title:		EvensAndOdds
	Created:	09.11.18
	Version:	1.0
*/

import	java.util.Scanner;

public class EvensAndOdds{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		// ----- Take Number From User -----
		
		System.out.print("Enter a number :> ");
		int num = in.nextInt();
		
		// ----- Printout Results -----
		
		if (isEven(num) == true){
			System.out.println("That's one even number you've got there!!!");
		}
		else if (isOdd(num) == true){
			System.out.println("That's one odd number you've got there!!! ");
		}
		else;
	}
	
	// ----- ISEVEN -----
	public static boolean isEven(int n){
		boolean even = false;
		
		if ((n % 2) == 0){
			even = true;
		}
		else;
		
		return even;
	}

	// ----- ISODD -----
	public static boolean isOdd(int n){
		boolean odd = false;
		
		if ((n % 2) != 0){
			odd = true;
		}
		else;
		
		return odd;
	}
}
