import java.text.DecimalFormat;
public class test
{
public static void main(String[] args)
{
double num1 = 0.333333;
double num2 = 6.333333333;
// Format is leading zero if required and rounded to 2 dp
DecimalFormat formatter = new DecimalFormat("#0.00");
System.out.println(formatter.format(num1));
System.out.println(formatter.format(num2));
}
}