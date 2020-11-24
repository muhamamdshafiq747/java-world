import java.util.Scanner;
public class QuotientRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend, divisor,quotient,remainder;
		int first,second,third;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter Dividend: ");
		dividend = reader.nextInt();
		System.out.println("Enter Divisor: ");
		divisor = reader.nextInt();
		
		quotient = dividend / divisor;
		remainder = dividend % divisor;
		
		first = dividend/100;
		second = (dividend - (first*100)) / 10;
		third = (dividend - first*100 - second*10);
		
		//System.out.println(dividend+" / "+divisor+" = "+ quotient+" and remainder "+ remainder);
		
		System.out.println("   "+quotient+"  r "+remainder);
		System.out.println("  |----------");
		System.out.print(divisor+" |"+" "+first+" "+second+" "+third);

	}

}
