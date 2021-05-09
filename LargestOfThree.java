/*
	Aurthur:	Murali Wood
	Title:		LargestOfThree
	Created:	09.11.18
	Version:	1.0
	
	Finds the largest of the numbers.
*/

import java.util.Scanner;

public class LargestOfThree{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		boolean equal = true;
		
		while (equal == true){
			
			// ----- Take Three Numbers Form The User -----
			
			System.out.print("Enter three different numbers :>");
			int num1 = in.nextInt();
			System.out.print("                              :>");
			int num2 = in.nextInt();
			System.out.print("                              :>");
			int num3 = in.nextInt();
			
			
			// ----- Check For Equality -----
			
			if ((num1 == num2) || (num1 == num3) || (num2 == num3) ){
				System.out.print("The numbers are equal, try again:>");
			}
			
			// ----- Printout The Answer -----
			
			else{
				equal = false;
				System.out.print("Max = " + max3(num1, num2, num3) + "\nMin = " + min3(num1, num2, num3));
			}
		}
	}
	
	// Returns the LARGAST number
	public static int max3(int n1, int n2, int n3){
		
		int max = 0;
		
		// if num1 is the LARGEST
		if ((n1 > n2) && (n1 > n2)){
			max = n1;
		}
		// if num2 is the LARGEST
		else if ((n2 > n1) && (n2 > n3)){
			max = n2;
		}
		// if num3 is the LARGEST
		else if ((n3 > n1) && (n3 > n2)){
			max = n3;
		}
		else;
		
		return max;
	}
	
	// Returns the SMALLEST number
	public static int min3(int n1, int n2, int n3){
	
		int min = 0;
		
		// if num1 is the SMALLEST
		if ((n1 < n2) && (n1 < n3)){
			min = n1;
		}
		// if num2 is the SMALLEST
		else if ((n2 < n1) && (n2 < n3)){
			min = n2;
		}
		// if num3 is the SMALLEST
		else if ((n3 < n1) && (n3 < n2)){
			min = n3;
		}
		else;
		
		return min;
	}
}