/*
	Aurthur:	Murali Wood
	Title:		UnicodeValues
	Created:	16/10/18
	Version:	1.0
	
	Prints out the Unicode values of characters
	
*/

public class UnicodeValues
{
	public static void main(String[] args)
	{
		// ----- Assign Variables -----
		
		String str1 = "ABC";
		String str2 = "XYZ";
		String str3 = "abc";
		String str4 = "xyz";
		String str5 = "123";
		
		// ----- Printout Unicode Numbers -----
		
		System.out.println((int)str1.charAt(0) + " " + (int)str1.charAt(1) + " " + (int)str1.charAt(2));
		System.out.println((int)str2.charAt(0) + " " + (int)str2.charAt(1) + " " + (int)str2.charAt(2));
		System.out.println((int)str3.charAt(0) + " " + (int)str3.charAt(1) + " " + (int)str3.charAt(2));
		System.out.println((int)str4.charAt(0) + " " + (int)str4.charAt(1) + " " + (int)str4.charAt(2));
		System.out.println((int)str5.charAt(0) + " " + (int)str5.charAt(1) + " " + (int)str5.charAt(2));
	}
}
