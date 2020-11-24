import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        String playAgain = "Q";
        do
        {
            String colours = "RBGYOP";
            int randomNum;
            String guessColours;
            String ans = "";
            String userguess;
            String result="";
            
            
            // I will use the below for loop to generate a random 4colour string.  
            for(int x=6; x>2; x--)
            {
                randomNum =((char)(Math.random()*x));
                guessColours = colours.substring(randomNum,randomNum+1);
                colours=colours.substring(0,randomNum)+colours.substring(randomNum+1,colours.length());
                ans = ans + guessColours;
            }
            //System.out.println("The Random generated 4 colours are : " + ans);// if need to reveal ans for testing purpose 
            int i =1;
            while(i<9)
            {   
                System.out.print("Enter your guess using 4 distinct letters from RGBYOP and Q to quit: ");
                userguess = sc.nextLine();
              if(userguess.indexOf("Q")<= -1)
              {
                for(int x=0; x<ans.length(); x++)
                { 
                    if(ans.substring(x,x+1).equals(userguess.substring(x,x+1))) 
                    {
                        //System.out.print("B");
                        result = result + "B";
                    }
                    else
                    { 
                        int index = ans.indexOf(userguess.substring(x,x+1));
                        if(index>=0)
                        {
                            //System.out.print("W");
                            result = result + "W";
                        }

                    }
                }
                  
                System.out.println("Results : "+result);
                if(result.equals("BBBB"))
                {
                    System.out.println("Congratulations! You have guessed correctly in "+i+" attempts");
                    break; 
                }
                else
                {  
                    if(i>=8)
                    {
                        System.out.println("Sorry, you have already made 8 guesses");
                        System.out.println("The answer is "+ans);
                    }
                    else{result="";}//Reset result to empty. 
                }
              }
              else
              {
                System.out.println("You have enter Q to quit game.");//To inform user he has quit by entering q
                break;
              }
              i++;
            }
            System.out.print("Enter to play again or Q to quit: "); // propmt if he wants to playagain when the game comes to an end/ or if he has quit
         playAgain = sc.nextLine();
        }while(!playAgain.equals("Q"));  
        System.out.print("Hope you had fun !");
        System.out.println();
       

        
        
 }
}

