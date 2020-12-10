import java.util.*;

public class luckyNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the number of attempts: ");
		int n = scan.nextInt();
		ArrayList <String> numbers = new ArrayList <String>();
		System.out.println("Please enter all numbers : ");
		for (int i = 0; i<=n; i++) {
			//System.out.println("Hello World!");
			numbers.add(scan.nextLine());
		}

		for(int x =1;x<numbers.size();x++) {

			if(numbers.get(x).contains("6") && numbers.get(x).contains("8"))
			{	System.out.println(numbers.get(x) + " Unlucky");}
			else if(numbers.get(x).contains("6") || numbers.get(x).contains("8"))
			{	System.out.println(numbers.get(x) + " Lucky");}

			if(!numbers.get(x).contains("6") && !numbers.get(x).contains("8"))
			{System.out.println(numbers.get(x) + " Unlucky");}

		}


	}

}
