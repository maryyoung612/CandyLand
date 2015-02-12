import java.util.Scanner;
public class Cardss
	{
	private int randomCard;
	public Cardss (int rc)
		{
		randomCard = rc;
		}
	static String playerMove;
	static String color;
	static String temp;
	static String [] cardColor = { "" , "red", "yellow", "orange", "green", "blue", "purple"};
	public static void cardGenerator()
		{
		System.out.println();
		int randomCard = (int)(Math.random()*6)+1;
		
			if(randomCard == 1)
				{
				color = cardColor[1];
				System.out.println("Card color: red");
				}
			if(randomCard == 2)
				{
				color = cardColor[2];
				System.out.println("Card color: yellow");
				}
			if(randomCard == 3)
				{
				color = cardColor[3];
				System.out.println("Card color: orange");
				}
			if(randomCard == 4)
				{
				color = cardColor[4];
				System.out.println("Card color: green");
				}
			if(randomCard == 5)
				{
				color = cardColor[5];
				System.out.println("Card color: blue");
				}
			if(randomCard == 6)
				{
				color = cardColor[6];
				System.out.println("Card color: purple");
				}
			
		for (int i = Player.location + 1; i <= Land.boardSpaces.size(); i++)
			{
			if (Land.boardSpaces.get(i).equals(color))
				{
				int oldLocation = Player.location;
				
				temp = Land.boardSpaces.get(oldLocation);
				
				Player.location = i;
				Land.boardSpaces.set(Player.location, Player.characterChoice + "     ");
				Land.boardSpaces.set(oldLocation, Land.originalBoardSpaces.get(oldLocation));
				i = Land.boardSpaces.size();
				}
			}
		}
	
	
	public int getRandomCard()
		{
		return randomCard;
		}
	public void setRandomCard(int randomCard)
		{
		this.randomCard = randomCard;
		}
	public static String getPlayerMove()
		{
		return playerMove;
		}
	public static void setPlayerMove(String playerMove)
		{
		Cardss.playerMove = playerMove;
		}
	public static String[] getCardColor()
		{
		return cardColor;
		}
	public static void setCardColor(String[] cardColor)
		{
		Cardss.cardColor = cardColor;
		}
	}