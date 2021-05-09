/*
	Aurthur:	Murali Wood
	Title:		Switcharoo
	Created:	01.11.18
	Version:	1.0
	
	Switches the fist and second string given by the user.
	
*/

import java.util.Scanner;

public class Switcharoo
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		// ----- Ask For 2 Strings -----
		
		System.out.print("What do you want to swap(x)? ");
		String x = in.next();
		
		System.out.print("With what(y)?");
		String y = in.next();
		
		// ----- Save y for later -----
		
		String reserve = y;
		
		// ----- Swap y to x -----

		y = x;
		
		// ----- Swap x to reserve(old y) -----
		
		x = reserve;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}