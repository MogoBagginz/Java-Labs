/*
	Aurthur:		Murali Wood
	Title:			GradingByComputer
	Created:		02.11.18
	Version:		1.0
	
	Converts Test scores to phonetic class E.G 45% = E
	
*/

import java.util.Scanner;

public class GradingByComputer{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		// ----- Take Mark From User -----
		
		System.out.print("Enter mark :>");
		int mark =  in.nextInt();
		
		// ----- Create Variables -----
		
		// set to the null character
		char grade = '\0';
		
		// ----- Assign Letter To grade -----
		
		if ((mark >= 0) && (mark < 40)){
			grade = 'F';
		}
		else if ((mark >= 40) && (mark <60)){
			grade = 'E';
		}
		else if ((mark >= 60) && (mark < 70)){
			grade = 'D';
		}
		else if ((mark >= 70) && (mark < 80)){
			grade = 'C';
		}
		else if ((mark >= 80) && (mark <= 90)){
			grade = 'B';
		}
		else if ((mark >= 90) && (mark <= 100)){
			grade = 'A';
		}
		
		// ----- Error Control -----
		
		if ((mark < 0) || (mark > 100)){
			System.out.println("Error!!! the number you entered is not in-between 1 and 100.");
		}
		else{
			
		// ----- Final Printout -----
					
		System.out.printf("Your mark '%d', is in the %c Grade.", mark, grade);
		}
	}
}