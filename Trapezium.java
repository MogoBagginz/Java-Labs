/*
	Author:		Murali Wood
	Title:		Trapezium
	Created:	04/10/18
	Version:	1.0
*/

import java.util.Scanner;
import java.lang.Math;

public class Trapezium
{
	public static void main(String[] args)
	{
	
		Scanner in = new Scanner(System.in);
		
		// ----- Printout One (Introduction)-----
		
		System.out.println("           Trapezium Area and Perimeter Calculator          ");
		System.out.println("************************************************************");
		System.out.println("All length are in millimeters and all angles are in degrees.");
		
		// ----- User Inputs ------
		
		// side A and side B
		
		System.out.print("Enter Side A of trapezium :> ");
		double sideA = in.nextInt();
		
		System.out.print("Enter Side B of trapezium :> ");
		double sideB = in.nextInt();
		
		// angle x and angle Y
		
		System.out.print("Enter angle X of trapezium :> ");
		double angleX = in.nextInt();
		System.out.print("Enter angle Y of trapezium :> ");
		double angleY = in.nextInt();
		
		// hight
		
		System.out.print("Enter hight of trapezium :> ");
		double hight = in.nextInt();
		
		System.out.println("************************************************************");
		
		// ----- Arithmetic For Area And Perimeter -----
		
		// calculate area
		double area = 0.5 * ( sideA + sideB ) * hight;
		
		// calculate perimeter 
		double radiansX = Math.toRadians(angleX);
		double radiansY = Math.toRadians(angleY);
		double sinX = Math.sin(radiansX);
		double sinY = Math.sin(radiansY);
		double perimeter = sideA + sideB + ( hight / sinX) + ( hight / sinY );
		
		// ----- Printout Two (Results) -----
		
		System.out.printf("Area : %.1f%n", area);
		System.out.printf("Perimeter : %.1f", perimeter);
	}
}