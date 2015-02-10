import java.util.Scanner;
public class Player
	{
	static String characterChoice;
	static int location = 0;
	public static void introToPLayer()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to Candy Land!");
		System.out.println("You will draw a card on your turn, try to get to the end!");
		System.out.println("What single letter do you want to be your character token?");
		characterChoice = userInput.nextLine();	
		}
	public static void playerMove()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Draw a card.");
		String playerDraw = userInput.nextLine();
		Cardss.cardGenerator();
		}
	}