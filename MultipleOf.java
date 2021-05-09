/*
	Aurthur:	Murali Wood
	Title:		MultipleOf
	Created:	15.11.18
	Version:	1.0
	
	Finds if numbers are multiples of other numbers	
*/

import java.util.Scanner;

public class MultipleOf{
	public static void main(String[] args){
		int num = getNum();
		int multiple = getmultiple();
		boolean isMultiple = isMultipleOf(num, multiple);
		
		printMultiple(num, multiple, isMultiple);
	}
	
	// Get number from user
	public static int getNum(){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number :> ");
		int num = in. nextInt();
		
		return num;
	}
	
	// Get potential multiple from the user
	public static int getmultiple(){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a potential multiple :> ");
		int multiple = in. nextInt();
		
		return multiple;
	}
	
	// Test if the multiple is in fact a multiple and return a boolean result
	public static boolean isMultipleOf(int num, int multiple){
		boolean isMultiple = false;
		if ((num % multiple) == 0){
			isMultiple = true;
		}
		else;
		return isMultiple;
	}
	
	// Printout results
	public static void printMultiple(int num, int multiple, boolean isMultiple){
		if (isMultiple == true){
			System.out.printf("The number '%d' is a multiple of '%d'.", multiple, num);	
		}		
		else if (isMultiple == false){
			System.out.printf("The number '%d' is not a multiple of '%d'.", multiple, num);
		}
	}
}
