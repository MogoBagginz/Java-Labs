/*
	Aurthur:	Murali Wood
	Title:		FahrenheitCelcius
	Creater:	13/10/2018
	Version:	1.0
*/

import java.util.Scanner;

public class FahrenheitCelcius
{
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		
		// ----- Input -----
		
		System.out.print("\nEnter temperature in fahrenheit :> ");
		double fahrenheit = in.nextDouble();
		
		// ----- Math -----
		
		double celcius = (fahrenheit - 32) / 1.8;
		
		// ----- Printout -----
		
		System.out.printf("%n%.2f fahrenheit = %.2f celcius", fahrenheit, celcius);
	}
}
