import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word;
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter a word to check if its palindrome :  ");
		word = reader.nextLine();
		
		if(isPalindrome(word)){
			System.out.println("Yes "+word+" is a palindrome word.");
		}
		else {
			System.out.println("No. "+word+" is NOT a palindrome word.");
		}
		
		}
	
	public static boolean isPalindrome(String s) {
		  int n = s.length();
		  for (int i = 0; i < (n/2); ++i) {
		     if (s.charAt(i) != s.charAt(n - i - 1)) {
		         return false;
		     }
		  }

		  return true;
		}

}
