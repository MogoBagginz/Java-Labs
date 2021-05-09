/*
	Aurthur:	Murali Wood
	Title:		Encryption
	Created:	20.11.18
	Version:	1.0
*/

import java.util.Scanner;

public class Encryption{
	public static void main(String[] args){
	
	// ----- Get Secret From User -----
	
	String secret = new String(getString());
	
	// ----- Get Key From User -----
	
	int key = getKey();
	
	String secretEncrypt = new String("");

	for ( int i = 0; i < secret.length(); i++){
		secretEncrypt = secretEncrypt + encrypt(secret.charAt(i), key);
	}
	
	// ----- Printout - Results -----
	
	printEncrypt(secret, secretEncrypt, key);
	}
	
	
	/*
	This method takes a secret given by the user and returns it as a string. 
	*/
	public static String getString(){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Tell me a secret :> ");
		String secret = new String(in.nextLine());
		
		return secret;
	}
	
	/*
	This method takes a key from the user, the key with tell the encrypt method
	how many places each letter will move down the alphabet. It returns an int.
	*/
	public static int getKey(){
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is your key? :> ");
		int key = in.nextInt();
		
		return key;
	}
	
	/*
	*/
	public static char encrypt(char ch, int key){
		int base = 0;
		if ( 'A' <= ch && ch <= 'Z'){
			base = 'A';
		}
		else if ( 'a' <= ch && ch <= 'z'){
			base = 'a';
		}
		else
			return ch;
		
		int offset = (ch - base) + key;
		return (char)(base + offset);
	}
	
	public static void printEncrypt(String secret, String secretE, int key){
		System.out.print("Your secret is \"" + secret 
						+ "\".\nYour Encryption \"" + secretE 
						+ "\".\nThe key is \"" + key + "\".");
	}
}