import java.util.Random;
import java.util.Scanner;
public class ROCKPAPER {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random randomValue = new Random();
		int computerChoice = randomValue.nextInt(3) +1;
		int noOfChoices = 0;
		int TotalChances = 5;
		int ComputerPoint = 0;
		int PersonPoint = 0 ;
		while (noOfChoices < TotalChances) {
			System.out.println("Enter Rock, Paper, Scissor as 1, 2, 3 respectively:");
			byte userInput = sc.nextByte();
			
			if(userInput == computerChoice) {
				System.out.println("It is a Tie no addition of Score");
			}
			else if (userInput <= 3 && userInput>=1 ) {
				if(userInput ==1 && computerChoice ==3) {
					System.out.println("Congrates you Won");
					
					PersonPoint = (int)PersonPoint +1;
					System.out.println("your Score is" + PersonPoint + "Computer Score is"+ComputerPoint );
					System.out.println("Your Entered" + userInput + "and the Computer choice was" + computerChoice);
				}
			}
		}
	}
}