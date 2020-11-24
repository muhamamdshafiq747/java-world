

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1,num2,ans;
		char operator; 
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter numbers : ");
		num1 = reader.nextDouble();
		num2 = reader.nextDouble();
		System.out.println(" Enter the operator (+ - * /) : ");
		operator = reader.next().charAt(0);
		
		switch(operator) {
			case '+': ans = num1 + num2;
				break;
			case '-': ans = num1 - num2;
				break;
			case '*': ans = num1 * num2;
				break;
			case '/': ans = num1 / num2;
				break;
			default: System.out.printf("Error! Enter correct operator");
			return;
		}
		
		System.out.print("\nThe result is given as follows:\n");
	    System.out.printf(num1 + " " + operator + " " + num2 + " = " + ans);
	}

}
