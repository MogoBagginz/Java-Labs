/*
	Aurthur:	Murali Wood
	Title:		CelciusFahrenheit
	Creater:	13/10/2018
	Version:	1.0
*/

import java.util.Scanner;

public class CelciusFahrenheit
{
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		
		// ----- Input -----
		
		System.out.print("\nEnter temperature in celcius :> ");
		double celcius = in.nextDouble();
		
		// ----- Math -----
		
		double fahrenheit = (celcius * 1.8) + 32;
		
		// ----- Printout -----
		
		System.out.printf("%n%.2f celcius = %.2f fahrenheit", celcius, fahrenheit);
	}
}
