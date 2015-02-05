import java.util.Scanner;
public class Player
	{
	public static void introToPLayer()
		{
		System.out.println("Welcome to Candy Land!");
		System.out.println("You will draw a card on your turn, try to get to the end first!");
		}
	public static void playerMove()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Draw a card.");
		String playerDraw = userInput.nextLine();
		Cardss.cardGenerator();
		}
	}