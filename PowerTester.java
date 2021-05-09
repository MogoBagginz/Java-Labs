/*
	Aurthur:	Murali Wood
	Title:		PowerTester
	Created:	09.11.18
	Version:	1.0
*/
import java.util.Scanner;

public class PowerTester{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int number = in.nextInt();
		
		System.out.print("Enter a power value: ");
		int pow = in.nextInt();
		
		int result = power(number, pow);
		System.out.println("Fourth power of " + number + " is " + result);
	}
	
	public static int fourth(int pow4){
		int answer = pow4 * pow4 * pow4 * pow4;
		return answer;
	}
	
	public static int power(int base, int power){
		int answer = base;
		for (int i = 0; i < (power - 1); i++){
			answer = answer * base;
		}
		return answer;
	}
} 