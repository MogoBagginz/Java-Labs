/*
	Aurthur:	Murali Wood
	Title:		StringEquality
	Created:	16/10/18
	Version:	1.0
	
	Tests String equality vs the '==' symbol
	
*/

public class StringEquality
{
	public static void main(String[] args)
	{
		
		// ----- Declaring and Assigning Variables -----
		
		String str1 = "abcdef";
		String str2 = "abcdef";
		String str3 = "abc" + str1.substring(3);
		
		// ----- Printout Final -----
		
		System.out.println("str1 == str2 " + (str1 == str2));    // '==' compares the content of the variable
		System.out.println("str3 is " + str3);
		System.out.println("str1 == str3 " + (str1 == str3));
		System.out.println("str1.equals(str2) " + str1.equals(str2));  // equals() compares object location
		System.out.println("str1.equals(str3) " + str1.equals(str3));
	}
}