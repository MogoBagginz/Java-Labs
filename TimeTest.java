import java.time.Duration;
import java.util.Scanner;
import java.time.temporal;

public class TimeTest
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		Duration durationObject = new Dutarion();
		temporal temporalObject = new temporal();
		
		System.out.print("Enter time 1 :>");
		String time1 = in.nextString();
		System.out.print("Enter time 2 :>");
		String time2 = in.nextString();
		
		TemporalUnit one = getBaseUnit(time1);
		TemporalUnit two = getBaseUnit(time2);
		
		int timeElapsed = durationObject.between(getBaseUnit(time1), getBaseUnit(time2));
		
		System.out.println("time elapsed = " + timeElapsed);
	}
}
