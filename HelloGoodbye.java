/*
	Aurthur:	Murali Wood
	Title:		HelloGoodbye
	Created:	08.11.18
	Version:	1.0
*/

import java.util.Scanner;

public class HelloGoodbye{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		// ----- Get Name From User -----
		
		System.out.print("Enter your name : ");
		String nameIn = in.nextLine();
		
		String sentence = hello(nameIn);
		System.out.println(sentence);
		
		goodbye(nameIn);
	}
	
	public static String hello(String name){
		name = "Hello " + name;
		return name;
	}
	
	public static void goodbye(String name){
		System.out.print("Goodbye " + name);
	}
}