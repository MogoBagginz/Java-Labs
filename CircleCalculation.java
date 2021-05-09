/*
	Aurthur:	Murali Wood
	Title:		CircleCalculation
	Created:	15.11.18
	Version:	1.0
	
	has methods to find area, find circumference and convert to radians.
*/

import java.util.Scanner;
import java.lang.Math;

public class CircleCalculation{
	public static void main(String[] args){
		
		// ----- Assign Variables ----- 
		
		double radius = getRadius();
		double area = findCircleArea(radius);
		double circumference = findCircumference(radius);
		double areaRadians = findRadians(area);
		double circumferenceRadians = findRadians(circumference);
		
		// ----- Print Results -----
		
		printArea(area, radius, circumference, areaRadians, circumferenceRadians);
	}
	
	// Takes the radius from the user
	public static double getRadius(){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the radius of your circle :> ");
		double radius = in.nextDouble();
		
		return radius;
	}
	
	// returns the area when given the radius of a circle
	public static double findCircleArea(double radius){
		// r * r * pi
		double area = Math.pow(radius, 2) * Math.PI;
		
		return area;
	}
	
	// returns the circumference when given the radius
	public static double findCircumference(double radius){
		// r + r * pi
		double circumference = (radius + radius) * Math.PI;
		
		return circumference;
	} 
	
	// converts a number to radians by dividing by pi
	public static double findRadians(double num){
		double radian = num / Math.PI;
		
		return radian;
	}
	
	// prints out results
	public static void printArea(double area, double radius, double circumference, double areaRadians, double circumferenceRadians){
		System.out.print("The radius is : " + radius 
						 + "\nThe area is : " + area 
						 + ". Area in radians : " + areaRadians
						 + "\nThe circumference is : " + circumference 
						 + ". Circumference in radians : " + circumferenceRadians);
	}
}