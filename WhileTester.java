/*
	Aurthur:		Murali wood
	Title:			WhileTester
	Created:		26/10/18
	Created:		1.0
	
	Tests While loops by printing various numbers
*/

import java.util.Scanner;

public class WhileTester{
	public static void main (String[] args){
		
		// ----- Printout Intro -----
		
		System.out.println("WhileTester running ... ");
		
		// ----- While Loop 1 - Numbers 0 to 9 -----
		
		// ----- Print out Question -----
		
		System.out.println("loop to print values 0 to 9 inclusive");
		
		int i = 0;
		
		// ----- Loop -----
		
		while (i < 10 ){
			if ((i >= 0) && (i < 9)){
				System.out.print(i + ", ");
				i++;
			}
			// looses the last ','
			else if (i == 9){
				System.out.println(i);
				i++;
			}
			else;
		}
		
		// ----- While Loop 2 - Numbers 99 to 50 Inclusive -----
		
		// ----- Printout Question -----
		
		System.out.println("loop to print values 99 to 50 inclusive");
		
		// ----- Variable Assignment -----
		
		i = 99;
		String numLine = "";
		
		// ----- Loop -----
		
		// While loop creates string of all the numbers from 99 to 50 
		while (i > 49 ){
			if ((i > 50) && (i < 100)){
				// add to string
				numLine = numLine + i + ", ";
				i--;
			}
			// looses the last ','
			else if (i == 50){
				// add to string
				numLine = numLine + i;
				i--;
			}
			else;
		}
		
		// ----- Printout Answer -----
		
		System.out.println(numLine.substring(0, 198));
		
		// ----- While Loop 3 - Even Number Between 50 and 100 Inclusive -----
		
		// ----- Printout Question -----
		
		System.out.println("loop to print even numbers between 50 and 100 inclusive");		
		 
		// ----- Assign Variables ----- 
		 
		i = 50;
		numLine = "";
		
		// ----- Loop -----
		
		while (i <= 100){
			if ((i >= 50) && (i < 100)){
				// add to string
				numLine = numLine + i + ", ";
				i = i + 2;
			}
			// looses the last ','
			else if (i == 100){
				// add to string
				numLine = numLine + i ;
				i++;
			}
			else;
		}
		
		// ----- Printout Answer -----
		
		System.out.println(numLine.substring(0, 103));
		
		// ----- While Loop - First 20 Numbers in the Arithmetic Sequence 0, 8, 16, 24 ... -----
		
		// ----- Printout Question -----
		
		System.out.println("loop to print first 20 numbers in the arithmetic sequence 0, 8, 16, 24");
		
		// ----- Assign Variables -----
		
		i = 0;
		numLine = "";

		// ----- Loop -----
		
		while (i <= 160){
			if ((i >= 0) && (i < 160)){
				// add to string
				numLine = numLine + i + ", ";
				i = i + 8;
			}
			// looses the last ','
			else if (i == 160){
				// add to string
				numLine = numLine + i ;
				i++;
			}
			else;
		}
		
		// ----- Printout Answer -----
		
		System.out.println(numLine.substring(0, 88));
		
		// ----- While Loop - First 10 Numbers In The Sequence 1, 2, 4, 8 ... -----
		
		// ----- Printout Question -----
		
		System.out.println("loop to print first 10 numbers in the sequence 1, 2, 4, 8");
		
		// ----- Assign Variables -----
		
		i = 2;
		numLine = "0, ";
		
		// ----- Loop -----
		
		while (i <= 512){
			if ((i >= 0) && (i < 512)){
				// add to string
				numLine = numLine + i + ", ";
				i = i * 2;
			}
			
			// looses the last ','
			else if (i == 512){
				// add to string
				numLine = numLine + i ;
				i++;
			}
			else;
		}
		
		// ----- Printout Answer -----
		
		System.out.println(numLine.substring(0, 37));
		
		// ----- While Loop - First 10 Numbers In The Sequence 1, 2, 0, 3, -1, 4, -2 ... -----
		
		// ----- Printout Question -----
		
		System.out.println("loop to print first 10 numbers in the sequence 1, 2, 0, 3, -1, 4, -2");
		
		// ----- Assign Variables -----
		
		int odds = 1;
		int even = 2;
		i = 2;
		numLine = "1, 2, ";
		
		// ----- Loop -----
		
		while (i < 10){
			// if i is divisible by 2 
			if ( (i % 2) == 0){	
				// Create next number
				odds--;
				// add to string
				numLine = numLine + odds + ", ";
				i++;
			}
			// else not divisible by 2 
			else{
				// Create next number
				even++;
				// add to string
				numLine = numLine + even + ", ";
				i++;
			}
		}
		
		// ----- Printout Answer -----
		
		System.out.println(numLine.substring(0, (numLine.length() - 2) ) );
		
		// ----- While Loop - First 10 Triangle numbers -----
		
		// ----- Printout Question -----
		
		System.out.println("loop to print first 10 triangle numbers");
		
		// ----- Assign Variables -----
		
		int triangleNumAdd = 1;
		int triangleNum = 0;
		i = 0;
		numLine = "";
		
		// ----- Loop -----
		
		while (i < 10){
			// Create next number
			triangleNum = triangleNum + triangleNumAdd;
			
			// add to string
			numLine = numLine + triangleNum + ", ";
			
			i++;
			triangleNumAdd++;
		}
		
		// ----- Printout Answer -----
		
		System.out.println(numLine.substring(0, (numLine.length() - 2) ) );
		
		// ----- While Loop - 12 Numbers In Sequence 1, 1, 1, 2, 2, 3, 4, 5, 7, 9, 12, 16 ... -----
		
		// ----- Printout Question -----
		
		System.out.println("Loop to print the first 12 numbers in the sequence " + 
							"1, 1, 1, 2, 2, 3, 4, 5, 7, 9, 12, 16");
		
		// ----- Assign Variables -----
		
		int numBack3 = 0;
		int numBack2 = 1;
		int numBack1 = 1;
		int numNew = 0;
		numLine = "1, 1, ";
		i = 0;
		
		// ----- Loop -----
		
		while (i < 10){
			// Create next number
			numNew = numBack2 + numBack3;
			
			// add to string
			numLine = numLine + numNew + ", ";
			
			// re assign numbers
			numBack3 = numBack2;
			numBack2 = numBack1;
			numBack1 = numNew;
			
			i++;
		}
		
		// Next line is used for debugging
		// System.out.print("" + numLine + "\n" + numLine.length());
		
		// ----- Printout Answer -----
	
		System.out.print(numLine.substring(0, 36));
	}
}