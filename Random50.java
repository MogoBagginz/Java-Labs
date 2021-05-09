import java.util.Random;

/**
 <h1>Random50</h1>
 The Random50 program generates 50 random numbers from 1 to 999 and prints them 
 in rows of 5 in 10 columns. 
 Duplicated numbers will not appear.

 @author	Murali Wood
 @since		01.12.18
 @version	1.0
*/

public class Random50{
	
	// ----- Global Variables -----
	
	static int[] randomNumbers = new int[50];
	static int counter = 0;
	
	/**
	This is the main method, it uses methods getRndNum, processNum, checkNum 
	and printRnd.
	*/
	
	public static void main(String[] args){
		
		// ----- Create Variables -----
		
		int rndNew = 0;
		int rndNewPro = 0;
		
		// ----- The Main Loop ----- 
		
		while (counter < 50){
			
			// generate random number
			rndNew = getRndNum();
			
			// take the last three digits and makes it positive
			rndNewPro = processNum(rndNew);
			
			System.out.println("1 " + rndNew + " " + rndNewPro + " " + counter);
			
			do{
				// check if number is a duplicate
				if (checkNum(rndNewPro) == true){
					
					// if it is, generate another number
					rndNew = getRndNum();
					
					// process the number so it is three digits long and positive 
					rndNewPro = processNum(rndNew);
				}
				else{
				}
			}
			// if number is duplicated or out of range then it will be discarded, 
			// a new number will be generated, processed and checked again. 
			while (checkNum(rndNewPro) == true);
			
			// add to the array
			randomNumbers[counter] = rndNewPro;
			
			// new line
			if ((counter) % 5 == 0)
				System.out.print("\n");
			else;
			
			System.out.println("----end---- \n" + rndNew + " " + rndNewPro + " " + randomNumbers[counter] + " " + counter);
			
			// final printout
			for (int i = 0; i < randomNumbers.length; i++){
				System.out.print(" " + randomNumbers[i]);
			}
			
			System.out.printf("%03d ", rndNewPro);
			
			counter++;
		}
	}
	
	/**
	This method is generating a random number using java.util.Random 
	
	@return int returns a positive or negative random number 
	*/
	public static int getRndNum(){
		Random rnd = new Random();
		
		int rndNew = rnd.nextInt();
		
		return rndNew;
	}
	
	/**
	This method takes the raw random number and shortens it to its 3 least 
	significant bits. If the number is negative it will make it positive.
	
	@param rndNew int Takes a random number
	@return rndNewPro int Returns a 3 digit positive number
	*/
	public static int processNum(int rndNew){
		
		// if its negative * by -1
		if (rndNew < 0){
			rndNew = rndNew * (-1);
		}
		else;
		
		int multiply = rndNew / 10;
		int rndNewPro = rndNew - (multiply * 10);
	
		return rndNewPro;
	}
	
	/**
	This method checks if the number is the same as any other number in the 
	array.
	
	@param rndNewPro int 3 digit positive number
	@return duplicate boolean if the number is the same as and number in the 
	array this will be true
	*/
	public static boolean checkNum(int rndNewPro){
		
		boolean duplicate = false;
		
		if ((rndNewPro < 2)||(rndNewPro > 998)){
			duplicate = true;
		}
		else{}
		
		System.out.println("check num");
		
		for (int i = 0; i < counter; i++){
			System.out.println("for loop-------------------------------------");
			if (rndNewPro == randomNumbers[i]){
				duplicate = true;
				System.out.println("*");
			}
			else{}
		}
		return duplicate;
	}
}

	
// ----------------- Pseudo code -------------------


// create array

// Boolean printout false

// int i = 0;

// while printout = false 

	// ----generate a random number in between 1 to 999
	
	// boolean duplicate = false;
	
	// ---- check that number is not in the list already
	// for i < array length 
	
		// if new number == array[i]
		// duplicate = true;
		
	// ---- if it is then generate another number 
	//if duplicate = false;
		// add to array
		
	// if array.length = 50
	
		// print the results in rows of five and 10 Columns

		// $03d (printf format)
		
		// printout = true