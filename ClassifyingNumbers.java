/*
	Aurthur:	Murali Wood
	Title:		ClassifyingNumbers
	Created:	05.11.18
	Version:	1.0
*/

import java.util.Scanner;

public class ClassifyingNumbers{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Chuck in some numbers :>");
		int num = in.nextInt();
		
		boolean natural = false;
		boolean integers = false;
		boolean positiveInt = false;
		boolean nonPositiveInt = false;
		boolean negativeInt = false;
		boolean nonPositiveInt = false;
		
		if (num <= 0){
			natural = true;
			integers = true;
			positiveInt = true;
			nonPositiveInt = true;
		}
		else if (num > 0){
			nonPositiveInt = true;
			negativeInt = true;
			integers = true;
		}
	}
}