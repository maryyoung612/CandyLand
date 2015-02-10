import java.util.Scanner;
public class Cardss
	{
	private int randomCard;
	public Cardss (int rc)
		{
		randomCard = rc;
		}
	static String playerMove;
	static String [] cardColor = {"red", "yellow", "orange", "green", "blue", "purple"};
	public static void cardGenerator()
		{
		System.out.println();
		int randomCard = (int)(Math.random()*18)+1;
			if(randomCard == 1)
				{
				String a = cardColor[0];
				System.out.println("red");
				String temp = Land.boardSpaces[Player.location];
				Land.boardSpaces[Player.location] = temp;
				}
			if(randomCard == 2)
				{
				String b = cardColor[1];
				System.out.println("yellow");
				String temp = Land.boardSpaces[Player.location];
				Land.boardSpaces[Player.location] = temp;
				}
			if(randomCard == 3)
				{
				String c = cardColor[2];
				System.out.println("orange");
				String temp = Land.boardSpaces[Player.location];
				Land.boardSpaces[Player.location] = temp;
				}
			if(randomCard == 4)
				{
				String d = cardColor[3];
				System.out.println("green");
				String temp = Land.boardSpaces[Player.location];
				Land.boardSpaces[Player.location] = temp;
				}
			if(randomCard == 5)
				{
				String e = cardColor[4];
				System.out.println("blue");
				String temp = Land.boardSpaces[Player.location];
				Land.boardSpaces[Player.location] = temp;
				}
			if(randomCard == 6)
				{
				String f = cardColor[5];
				System.out.println("purple");
				String temp = Land.boardSpaces[Player.location];
				Land.boardSpaces[Player.location] = temp;
				}
			if(randomCard == 7)
				{
				String bc = cardColor[1];
				System.out.println("yellow");
				String temp = Land.boardSpaces[Player.location];
				Land.boardSpaces[Player.location] = temp;
				}
			if(randomCard == 8)
				{
				String cc = cardColor[2];
				System.out.println("orange");
				String temp = Land.boardSpaces[Player.location];
				Land.boardSpaces[Player.location] = temp;
				}
			if(randomCard == 9)
				{
				String dc = cardColor[3];
				System.out.println("green");
				String temp = Land.boardSpaces[Player.location];
				Land.boardSpaces[Player.location] = temp;
				}
			if(randomCard == 10)
				{
				String ec = cardColor[4];
				System.out.println("blue");
				String temp = Land.boardSpaces[Player.location];
				Land.boardSpaces[Player.location] = temp;
				}
			if(randomCard == 11)
				{
				String fc = cardColor[5];
				System.out.println("purple");
				String temp = Land.boardSpaces[Player.location];
				Land.boardSpaces[Player.location] = temp;
				}
			if(randomCard == 12)
				{
				String ab = cardColor[0];
				System.out.println("red");
				String temp = Land.boardSpaces[Player.location];
				Land.boardSpaces[Player.location] = temp;
				}
			if(randomCard == 13)
				{
				String bb = cardColor[1];
				System.out.println("yellow");
				String temp = Land.boardSpaces[Player.location];
				Land.boardSpaces[Player.location] = temp;
				}
			if(randomCard == 14)
				{
				String cb = cardColor[2];
				System.out.println("orange");
				String temp = Land.boardSpaces[Player.location];
				Land.boardSpaces[Player.location] = temp;
				}
			if(randomCard == 15)
				{
				String db = cardColor[3];
				System.out.println("green");
				String temp = Land.boardSpaces[Player.location];
				Land.boardSpaces[Player.location] = temp;
				}
			if(randomCard == 16)
				{
				String eb = cardColor[4];
				System.out.println("blue");
				String temp = Land.boardSpaces[Player.location];
				Land.boardSpaces[Player.location] = temp;
				}
			if(randomCard == 17)
				{
				String fb = cardColor[5];
				System.out.println("purple");
				String temp = Land.boardSpaces[Player.location];
				Land.boardSpaces[Player.location] = temp;
				}
			if(randomCard == 18)
				{
				String ac = cardColor[0];
				System.out.println("red");
				String temp = Land.boardSpaces[Player.location];
				Land.boardSpaces[Player.location] = temp;
				}
		for (int i = Player.location + 1; i <= Player.location + 6; i++)
			{
			if (Land.boardSpaces[i].equals(Land.boardSpaces[randomCard]))
				{
				Player.location = i;
				String temp = Land.boardSpaces[Player.location];
				Land.boardSpaces[Player.location] = Player.characterChoice + "     ";
				break;
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