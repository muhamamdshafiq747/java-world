import java.util.*;

public class primeFactorization {
	public static void main(String [] args) {
	      
		Scanner scan = new Scanner(System.in);
	    System.out.print("Please enter the total number of prime factorization you would like to check: ");
		int number = scan.nextInt();;
	        
	    for(int x=0;x<number;x++){
	        System.out.print("Please enter the number to check: ");
	    	primeFactors(scan.nextInt());
	    	
	    }
	    	System.out.println("End of check. Thanks for trying.");
	
	}
	
	public static void primeFactors(int n)
	{
	            // Print the number of 2s that divide n 
	              while (n%2==0) 
	              { 
	                  System.out.print(2 + " "); 
	                  n /= 2; 
	              } 
	        
	              // n must be odd at this point.  So we can 
	              // skip one element (Note i = i +2) 
	              for (int i = 3; i <= Math.sqrt(n); i+= 2) 
	              { 
	                  // While i divides n, print i and divide n 
	                  while (n%i == 0) 
	                  { 
	                      System.out.print(i + " "); 
	                      n /= i; 
	                  } 
	              } 
	        
	              // This condition is to handle the case whien 
	              // n is a prime number greater than 2 
	              if (n > 2) 
	                  System.out.print(n);
	              
	              System.out.println("");
	 }
        	

}

/*ArrayList<Integer> inputs = new ArrayList<Integer>();
for (int i = 0; i < number; i++) {
      inputs.add(Integer.valueOf(scan.nextInt()));
}*/


/*
 *class TestClass {
      public static void main(String args[]) throws Exception {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String line = br.readLine();
          int N = Integer.parseInt(line);
          ArrayList<Integer> inputs = new ArrayList<Integer>();
          for (int i = 0; i < N; i++) {
              inputs.add(Integer.valueOf(br.readLine()));
          }
          ArrayList<BigInteger> outputs = new ArrayList<BigInteger>();
          for(Integer input : inputs){
              outputs.add(factorial(input));
          }
          for(BigInteger result: outputs){
              System.out.println(result);
          }
      }

      private static BigInteger factorial(Integer input) {
          if(input == 1) return BigInteger.ONE;
          return factorial(input - 1).multiply(new BigInteger(String.valueOf(input)));
      }
 
 */
