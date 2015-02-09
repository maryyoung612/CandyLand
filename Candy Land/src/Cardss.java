import java.util.Scanner;
public class Cardss
	{
	static String playerMove;
	static int randomCard;
	static String [] cardColor = {"red", "yellow", "orange", "green", "blue", "purple", "gingerbread"};
	public static void cardGenerator()
		{
		System.out.println();
		randomCard = (int)(Math.random()*19)+1;
			if(randomCard == 1)
				{
				String a = cardColor[1];
				System.out.println("red");
				}
			if(randomCard == 2)
				{
				String b = cardColor[2];
				System.out.println("yellow");
				}
			if(randomCard == 3)
				{
				String c = cardColor[3];
				System.out.println("orange");
				}
			if(randomCard == 4)
				{
				String d = cardColor[4];
				System.out.println("green");
				}
			if(randomCard == 5)
				{
				String e = cardColor[5];
				System.out.println("blue");
				}
			if(randomCard == 6)
				{
				String f = cardColor[6];
				System.out.println("purple");
				}
			if(randomCard == 7)
				{
				String g = cardColor[7];
				System.out.println("gingerbread");
				}
			if(randomCard == 8)
				{
				String cc = cardColor[3];
				System.out.println("orange");
				}
			if(randomCard == 9)
				{
				String dc = cardColor[4];
				System.out.println("green");
				}
			if(randomCard == 10)
				{
				String ec = cardColor[5];
				System.out.println("blue");
				}
			if(randomCard == 11)
				{
				String fc = cardColor[6];
				System.out.println("purple");
				}
			if(randomCard == 12)
				{
				String ab = cardColor[1];
				System.out.println("red");
				}
			if(randomCard == 13)
				{
				String bb = cardColor[2];
				System.out.println("yellow");
				}
			if(randomCard == 14)
				{
				String cb = cardColor[3];
				System.out.println("orange");
				}
			if(randomCard == 15)
				{
				String db = cardColor[4];
				System.out.println("green");
				}
			if(randomCard == 16)
				{
				String eb = cardColor[5];
				System.out.println("blue");
				}
			if(randomCard == 17)
				{
				String fb = cardColor[6];
				System.out.println("purple");
				}
			if(randomCard == 18)
				{
				String ac = cardColor[1];
				System.out.println("red");
				}
			if(randomCard == 19)
				{
				String bc = cardColor[2];
				System.out.println("yellow");
				}
		for (int i = Player.location + 1; i <= Player.location + 7; i++)
			{
			if (Land.boardSpaces[i].equals(randomCard))
				{
				Player.location = i;
				break;
				}
			}
			System.out.println("random card selection: " + randomCard);
		}
	}