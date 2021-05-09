/*
	Authur:		Murali Wood
	Title:		GradeCalculator
	Created:	12/10/2018
	Version:	1.0
*/

import java.util.Scanner;

public class GradeCalculator
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		// ----- Take Class Test Results From User -----
		
		System.out.print("\nEnter grade out of 20 for class test scores :> ");
		System.out.print("\nTest one :> ");
		double test1 = in.nextDouble();
		while (test1 < 0 || test1 > 20)
		{
			System.out.print("Grade must be bettween 0 up to 20 :> ");
			test1 = in.nextDouble();
		}
		System.out.print("Test two :> ");
		double test2 = in.nextDouble();
		while (test2 < 0 || test2 > 20)
		{
			System.out.print("Grade must be bettween 0 up to 20 :> ");
			test2 = in.nextDouble();
		}
		System.out.print("Test three :> ");
		double test3 = in.nextDouble();
		while (test3 < 0 || test3 > 20)
		{
			System.out.print("Grade must be bettween 0 up to 20 :> ");
			test3 = in.nextDouble();
		}
		System.out.print("Test four :> ");
		double test4 = in.nextDouble();
		while (test4 < 0 || test4 > 20)
		{
			System.out.print("Grade must be bettween 0 up to 20 :> ");
			test4 = in.nextDouble();
		}
		
		// ----- Take Lab Results From User -----
		
		System.out.print("\nEnter grade out of 10 for Lab sessions:> ");
		System.out.print("\nLab one:> ");
		double lab1 = in.nextDouble();
		while (lab1 < 0 || lab1 > 10)
		{
			System.out.print("Grade must be bettween 0 up to 10 :> ");
			lab1 = in.nextDouble();
		}
		System.out.print("Lab two :> ");
		double lab2 = in.nextDouble();
		while (lab2 < 0 || lab2 > 10)
		{
			System.out.print("Grade must be bettween 0 up to 10 :> ");
			lab2 = in.nextDouble();
		}
		System.out.print("Lab three :> ");
		double lab3 = in.nextDouble();
		while (lab3 < 0 || lab3 > 10)
		{
			System.out.print("Grade must be bettween 0 up to 10 :> ");
			lab3 = in.nextDouble();
		}
		System.out.print("Lab four :> ");
		double lab4 = in.nextDouble();
		while (lab4 < 0 || lab4 > 10)
		{
			System.out.print("Grade must be bettween 0 up to 10 :> ");
			lab4 = in.nextDouble();
		}
		System.out.print("Lab five :> ");
		double lab5 = in.nextDouble();
		while (lab5 < 0 || lab5 > 10)
		{
			System.out.print("Grade must be bettween 0 up to 10 :> ");
			lab5 = in.nextDouble();
		}
		
		// ----- Printout Class Tests -----
		
		System.out.println("\n     Class Tests");
		System.out.printf("%nClass Test1      %5.1f/10", test1);
		System.out.printf("%nClass Test2      %5.1f/10", test2);
		System.out.printf("%nClass Test3      %5.1f/10", test3);
		System.out.printf("%nClass Test4      %5.1f/10", test4);
		
		double testTotal = test1 + test2 + test3 + test4;
		double testPerCent = (testTotal / 80) * 100;
		
		System.out.printf("%n%nTotal      %.1f / 80 = %.0f%%", testTotal, testPerCent);
		
		// ----- Printout Lab Work -----
		
		System.out.println("\n\n     Laboratory Work");
		System.out.printf("%nlab1      %5.1f/10", lab1);
		System.out.printf("%nlab2      %5.1f/10", lab2);
		System.out.printf("%nlab3      %5.1f/10", lab3);
		System.out.printf("%nlab4      %5.1f/10", lab4);
		System.out.printf("%nlab5      %5.1f/10", lab5);
		
		double labTotal = lab1 + lab2 + lab3 + lab4 + lab5;
		double labPerCent = (labTotal / 50) * 100;
		
		System.out.printf("%n%nTotal      %.1f / 50 = %.0f%%", labTotal, labPerCent);
		
		// ----- Printout Final -----
		
		double totalMark = (testPerCent * 0.6) + (labPerCent * 0.4);
		
		System.out.printf("%n%nWeighted Total = (%.0f%% * 0.6) + (%.0f%% * 0.4)", 
						   testPerCent, labPerCent);
		System.out.printf("%n               = %.1f + %.1f = %.1f", 
						  (testPerCent * 0.6), (labPerCent * 0.4), totalMark);
		System.out.printf("%n               = %.0f%%", totalMark); 
	}
}