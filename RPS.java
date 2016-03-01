import java.util.Scanner;
import java.util.Random;
 
 
 public class RPS 
 {
 	public static void main(String[] args) throws java.lang.Exception {
 		Scanner kb = new Scanner(System. in );
 		Random rnd = new Random();
 		int input;
 		int B = 1;
 		int wins = 0, loss = 0, ties = 0;
		
 		System.out.println("Pick 1,2, or 3 for:");
 		System.out.println("ROCK (1), PAPER(2), or SCISSOR (3)");

			
			
 	while (B != 0) 
 		{
		int Rock = 1, Paper = 2, Scissor = 3;
		int a;
			
		input = kb.nextInt();
		while (input != 1 && input != 2 && input !=  3)
		{
			System.out.println("invalid input");
			System.out.println("Please input again");
			 a = kb.nextInt();
			 input = a;
		}

 		
 			int randomNumber = rnd.nextInt(3 - 1 + 1) + 1;
 			if (randomNumber == Rock) 
 		{
 				if (input == Rock)
 				{
 					System.out.println("Rock Vs. Rock: TIE");
 					ties++;
 				}
 				else if (input == Paper)
 				{
 					System.out.println("Paper Vs. Rock: YOU WIN");
 					wins++;
 			}
 				 else if (input == Scissor) 
 				 {
 					System.out.println("Scissor Vs. Rock: YOU LOSE");
 					loss++;
 				 }
 				
 			} 
 			else if (randomNumber == Paper) 
 			{
 				if (input == Rock)
 				{
 					System.out.println("Rock Vs. Paper: YOU LOSE");
 					loss++;
 				}
 				 else if (input == Paper) 
 				 {
 				System.out.println("Paper Vs. Paper: TIE");
 					ties++;
 				 }
 				else if (input == Scissor) 
 				{
 					System.out.println("Scissor Vs. Paper: YOU WIN");
 					wins++;
 				}
 			} 
 			else if (randomNumber == Scissor)
 			{ 
 				if (input == Rock)
 				{
 					System.out.println("Rock Vs. Scissor: YOU WIN");
 					wins++;
 				}
 				 else if (input == Paper)
 				 {
 					System.out.println("Paper Vs. Scissor: YOU LOSE");
 					loss++;
 				 }
 				 else if (input == Scissor) 
 				 {
 					System.out.println("Scissor Vs. Scissor: TIE");
 					ties++;
 				 }
 			
 				
 			}
 
 			int Y=8, N=9;
 		System.out.println("Do you want to play again? Y(8)/N(9)");
 			input = kb.nextInt();
 		if(input==Y)
 			{
 				B=1;	
 				System.out.println("Rock, Paper,SCISSOR");
 			}
 			else if(input==N)
 			{				
 				System.out.println("Your status:\n Wins: "+wins+
 									"\n Loss: "+loss+"\n Ties: "+ties);
 				System.out.println("GOODBYE");
 				System.exit(0);
 			}
 			
 
		}
 	}
 	
 } 