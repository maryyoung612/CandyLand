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
		System.out.println("card number:" + randomCard);
			if(randomCard == 1)
				{
				color = cardColor[1];
				System.out.println("red");
				}
			if(randomCard == 2)
				{
				color = cardColor[2];
				System.out.println("yellow");
				}
			if(randomCard == 3)
				{
				color = cardColor[3];
				System.out.println("orange");
				}
			if(randomCard == 4)
				{
				color = cardColor[4];
				System.out.println("green");
				}
			if(randomCard == 5)
				{
				color = cardColor[5];
				System.out.println("blue");
				}
			if(randomCard == 6)
				{
				color = cardColor[6];
				System.out.println("purple");
				}
			
		for (int i = Player.location + 1; i <= Player.location; i++)
			{
			if (Land.boardSpaces.get(i).equals(color))
				{
				Player.location = ((Object) Land.boardSpaces).nextIndex(color);
				temp = Land.boardSpaces.getPlayer.location;
				Land.boardSpaces.getPlayer.location = Player.characterChoice + "     ";
				}
			else if (!Land.boardSpaces.get(i).equals(color))
				{
				Player.location = i;
				temp = Land.boardSpaces.getPlayer.location;
				Land.boardSpaces.get(11) = Player.characterChoice + "        ";
				}
			}
		}
		public static void replaceBoardName()
			{
			temp = Land.boardSpaces.getPlayer.location;
			Land.boardSpaces.getPlayer.location = temp;
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