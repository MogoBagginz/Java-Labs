/*
	Aurthur:	Murali Wood
	Title:		MinMax3
	Created:	13.11.18
	Version:	1.0
	
	This program finds the largest and smallest integer out of three integers.
*/

import java.util.Scanner;

public class MinMax3{
	public static void main(String[] args){
		
		// ----- Take Numbers From The User -----
		
		int num1 = getInteger();
		int num2 = getInteger();
		int num3 = getInteger();
		
		// ----- Retrieve The Min Max Values -----
		
		int max = max3(num1, num2, num3);
		int min = min3(num1, num2, num3);
		
		// ----- Printout - Results -----
		
		printMaxMin(max, min);
	}
	
	// Prompts t`he used for a integer
	public static int getInteger(){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num = in.nextInt();
		return num;
	}
	
	// Finds the LARGEST integer
	public static int max3(int n1, int n2, int n3){
		int max = 0;
		if ((n1 > n2) && (n1 > n3)){
			max = n1;
		}
		else if ((n2 > n1) && (n2 > n3)){
			max = n2;
		}
		else if ((n3 > n1) && (n3 > n2)){
			max = n3;
		}
		else;
		return max;
	}
	
	// Finds the SMALLEST integer 
	public static int min3(int n1, int n2, int n3){
		int min = 0;
		if ((n1 < n2) && (n1 < n3)){
			min = n1;
		}
		else if ((n2 < n1) && (n2 < n3)){
			min = n2;
		}
		else if ((n3 < n1) && (n3 < n2)){
			min = n3;
		}
		else;
		return min;
	}
	
	// Prints the min and max numbers
	public static void printMaxMin(int n1, int n2){
		System.out.println("\nYou entered three integers.");
		System.out.printf("The Largest value is %d%n", n1);
		System.out.printf("The Smallest value is %d", n2);
	}
}