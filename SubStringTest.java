/*
	Aurthur:	Murali Wood
	Title:		SubStringTest
	Created:	16/10/18
	Version:	1.0
	
	Tests out properties of the method SubString
	
*/

public class SubStringTest
{
	public static void main(String[] args)
	{
		String sentence = "Java was fist released at the Sun World exhibition in 1995";
		//                 0123456789012345678901234567890123456789012345678901234567
		//                          10        20        30        40        50
		
		System.out.println(sentence);
		System.out.println(sentence.substring(0, 4));
		System.out.println(sentence.substring(0, 50));
		System.out.println(sentence.substring(30, 39));
		System.out.println(sentence.substring(51, 58));
		System.out.println(sentence.substring(12, 15));
		
		// System.out.println(sentence.substring(59)); // Error
	}
}