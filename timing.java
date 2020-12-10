import java.util.*;

public class timing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.print("Please enter the number of participants: ");
        int n = reader.nextInt();
        ArrayList <String> timing = new ArrayList <String>();
        System.out.println("Please enter all the timing HH:MM:SS : ");
        for (int i = 0; i<=n; i++) {
            //System.out.println("Hello World!");
            timing.add(reader.nextLine());
        }

        Collections.sort(timing);
        
        System.out.print("The shortest timing is : ");
        String S = timing.get(1);
        System.out.print(S);

		
		
	}

}
