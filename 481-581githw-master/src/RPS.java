import java.util.Scanner;
import java.util.Random;

/*
 * Team : Manjula Nimmagadda, Zimo Cai, Jingchao Yang
 * RockPaperScissors Game.
 */

public class RPS {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner kb = new Scanner(System.in);
		Random rnd = new Random();
		int input;
		int B = 1;
		int wins = 0, loss = 0, ties = 0;

		System.out.println("Pick 1,2,3,4 or 5 for:");
		System.out.println("ROCK (1), PAPER(2), SCISSOR (3), LIZARD (4), or SPOCK (5)");

		while (B != 0) {
			int Rock = 1, Paper = 2, Scissor = 3, Lizard = 4, Spock = 5;
			int a;

			while (true) {
				System.out.print("input a number");
				try {
					input = new Scanner(System.in).nextInt();
					break;
				} catch (Exception e) {
					continue;
				}
			}
			//input = kb.nextInt();
			while (input != 1 && input != 2 && input != 3 && input != 4 && input != 5) {
				System.out.println("invalid input");
				System.out.println("Please input again");
				a = kb.nextInt();
				input = a;
			}

			int randomNumber = rnd.nextInt(5 - 1 + 1) + 1;
			if (randomNumber == Rock) {
				if (input == Rock) {
					System.out.println("Rock Vs. Rock: TIE");
					ties++;
				} else if (input == Paper) {
					System.out.println("Paper Vs. Rock: YOU WIN");
					wins++;
				} else if (input == Scissor) {
					System.out.println("Scissor Vs. Rock: YOU LOSE");
					loss++;
				} else if (input == Lizard) {
					System.out.println("Lizard Vs. Rock: YOU LOSE");
					loss++;
				} else if (input == Spock) {
					System.out.println("Spock Vs. Rock: YOU WIN");
					wins++;
				}
			} else if (randomNumber == Paper) {
				if (input == Rock) {
					System.out.println("Rock Vs. Paper: YOU LOSE");
					loss++;
				} else if (input == Paper) {
					System.out.println("Paper Vs. Paper: TIE");
					ties++;
				} else if (input == Scissor) {
					System.out.println("Scissor Vs. Paper: YOU WIN");
					wins++;
				} else if (input == Lizard) {
					System.out.println("Lizard Vs. Paper: YOU WIN");
					wins++;
				} else if (input == Spock) {
					System.out.println("Spock Vs. Paper: YOU LOSE");
					loss++;
				}
			} else if (randomNumber == Scissor) {
				if (input == Rock) {
					System.out.println("Rock Vs. Scissor: YOU WIN");
					wins++;
				} else if (input == Paper) {
					System.out.println("Paper Vs. Scissor: YOU LOSE");
					loss++;
				} else if (input == Scissor) {
					System.out.println("Scissor Vs. Scissor: TIE");
					ties++;
				} else if (input == Lizard) {
					System.out.println("Lizard Vs. Scissor: YOU LOSE");
					loss++;
				} else if (input == Spock) {
					System.out.println("Spock Vs. Scissor: YOU WIN");
					wins++;
				}
			} else if (randomNumber == Lizard) {
				if (input == Rock) {
					System.out.println("Rock Vs. Lizard: YOU WIN");
					wins++;
				} else if (input == Paper) {
					System.out.println("Paper Vs. Lizard: YOU LOSE");
					loss++;
				} else if (input == Scissor) {
					System.out.println("Scissor Vs. Lizard: YOU WIN");
					wins++;
				} else if (input == Lizard) {
					System.out.println("Lizard Vs. Lizard: TIE");
					ties++;
				} else if (input == Spock) {
					System.out.println("Spock Vs. Scissor: YOU LOSE");
					loss++;
				}
			} else if (randomNumber == Spock) {
				if (input == Rock) {
					System.out.println("Rock Vs. Spock: YOU LOSE");
					loss++;
				} else if (input == Paper) {
					System.out.println("Paper Vs. Spock: YOU WIN");
					wins++;
				} else if (input == Scissor) {
					System.out.println("Scissor Vs. Spock: YOU LOSE");
					loss++;
				} else if (input == Lizard) {
					System.out.println("Lizard Vs. Spock: YOU WIN");
					wins++;
				} else if (input == Spock) {
					System.out.println("Spock Vs. Spock: TIE");
					ties++;
				}
			}

			int Y = 8, N = 9;
			System.out.println("Do you want to play again? Y(8)/N(9)");
			input = kb.nextInt();
			if (input == Y) {
				B = 1;
				System.out.println("Rock, Paper, Scissor, Lizard, Spock");
			} else if (input == N) {
				System.out.println("Your status:\n Wins: " + wins + "\n Loss: " + loss + "\n Ties: " + ties);
				System.out.println("GOODBYE");
				System.exit(0);
			}

		}
	}

}