import java.util.Scanner;

public class MaximaMinima{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("enter a number :>");
		int num1 = in.nextInt();
		
		System.out.print("enter another number :>");
		int num2 = in.nextInt();
		
		if ( max(num1, num2) == min(num1, num2)){
			System.out.print("The numbers are equal!");
		}
		else{
			System.out.print("Max = " + max(num1, num2) + "\nMin = " + min(num1, num2));
		}
	}
	
	public static int max(int n1, int n2){
		if (n1 > n2){
			return n1;
		}
		else{
			return n2;
		}
	}
	
	public static int min(int n1, int n2){
		if (n1 < n2){
			return n1;
		}
		else{
			return n2;
		}
	}
}