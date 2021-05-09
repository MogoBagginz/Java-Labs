/*
	Aurthur:	Murali Wood
	Title:		IgnoringCase
	Created:	05.11.18
	Version:	1.0
	
*/

import java.util.Scanner;

public class IgnoringCase{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		
		// ----- Initiate Variables -----
		
		boolean y = true;
		String answer = "";
		
		while (y == true){
			
			// ----- Printout 1 -----
			
			System.out.println("Do you wish to continue? [Y/N] :> ");
			answer = in.next();
			
			// continue
			if ((answer.equals("Y")) || (answer.equals("y"))){ 
				System.out.println("continuing ...");
			}
			// terminate
			else if ((answer.equals("N")) || (answer.equals("n"))){
				System.out.println("Terminating!");
				y = false;
			}
			// Error - invalid input 
			else if ((answer != "Y") && (answer != "y") && (answer != "N") && (answer != "n")){
				System.out.println("Invalid Input, try again");
			}
			else;
		}
	}
}