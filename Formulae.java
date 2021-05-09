/* 
	Aurthur: 	Murali Wood
	Title:		Formulae
	Created: 	12/10/18
	Version:	1.0
*/

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Formulae
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		// to format in a println
		DecimalFormat formatter = new DecimalFormat("#0.00");
		
		// ----- Take Radius From User -----
		
		System.out.println("Enter radius of circle in cm:>");
		double radius = in.nextDouble();
		
		// ----- Make Sure Radius is Positive -----
		
		if (radius < 0)
		{
			System.out.println("Radius must be a positive number ... \nTry again :>");
			radius = in.nextDouble();
		}
		
		// ----- Arithmetic One -----
		
		double area = Math.PI * Math.pow(radius, 2);
		double circumferenceCircle = 2 * Math.PI * radius;
		double surfaceASphere = 4 * Math.PI * Math.pow(radius, 2);
		double volumeSphere = 4 / 3 * Math.PI * Math.pow(radius, 3);
		
		// ----- Printout Results -----
		
		System.out.println("Area of circle = " + formatter.format(area) + "cm^2");
		System.out.printf("Circumference of circle = %.2f cm", circumferenceCircle);
		System.out.println("\n\nSurface area of circle = " + formatter.format(surfaceASphere) + " cm^2");
		System.out.println("Volume of sphere = " + formatter.format(area) + "cm^3");
		
	}
}