import java.util.Scanner;
public class Player
	{
	static String characterChoice;
	static String newAIToken;
	public static void introToPLayer()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to Candy Land!");
		System.out.println("You will draw a card on your turn, try to get to the end first!");
		System.out.println("would you like to be X or O?");
		characterChoice = userInput.nextLine();
		if (characterChoice.equals("X") || characterChoice.equals("x"))
			{
			newAIToken = "O";
			}
		else if(characterChoice.equals("O") || characterChoice.equals("o"))
			{
			newAIToken = "X";
			}
		}
	public static void playerMove()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Draw a card.");
		String playerDraw = userInput.nextLine();
		Cardss.cardGenerator();
		
		}
	}