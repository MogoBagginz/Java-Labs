import java.util.Scanner;
import java.lang.String;

public class DigitExtraction{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter some numbers :> ");
		int num = in.nextInt();
		
		System.out.println("The last number is " + lastDigit(num));
	}
	
	public static int firstDigit(int n){
		
	}
	public static int lastDigit(int n){
			int last = lastIndexOf(n, 0);
			
			return last;
	}
}