import java.util.Scanner;
public class Cardss
	{
	static String playerMove;
	static int randomCard;
	public static void cardGenerator()
		{
		System.out.println();
		randomCard = (int)(Math.random()*19)+1;
		String [] cardColor = {"red", "yellow", "orange", "green", "blue", "purple", "gingerbread"};
			if(randomCard == 1)
				{
				String a = cardColor[1/*red*/];
				System.out.println("red");
				for (int i = 0; i < Land.boardSpaces[i].length(); i++)
					{
					if (randomCard == cardColor[1])
						{
						Land.boardSpaces[i] = Player.characterChoice;
						}
					}
				}
			if(randomCard == 2)
				{
				String b = cardColor[2/*yellow*/];
				System.out.println("yellow");
				}
			if(randomCard == 3)
				{
				String c = cardColor[3/*orange*/];
				System.out.println("orange");
				}
			if(randomCard == 4)
				{
				String d = cardColor[4/*green*/];
				System.out.println("green");
				}
			if(randomCard == 5)
				{
				String e = cardColor[5/*blue*/];
				System.out.println("blue");
				}
			if(randomCard == 6)
				{
				String f = cardColor[6/*purple*/];
				System.out.println("purple");
				}
			if(randomCard == 7)
				{
				String g = cardColor[7/*gingerbread*/];
				System.out.println("gingerbread");
				}
			if(randomCard == 8)
				{
				String cc = cardColor[3/*orange*/];
				System.out.println("orange3");
				}
			if(randomCard == 9)
				{
				String dc = cardColor[4/*green*/];
				System.out.println("green3");
				}
			if(randomCard == 10)
				{
				String ec = cardColor[5/*blue*/];
				System.out.println("blue3");
				}
			if(randomCard == 11)
				{
				String fc = cardColor[6/*purple*/];
				System.out.println("purple3");
				}
			if(randomCard == 12)
				{
				String ab = cardColor[1/*red*/];
				System.out.println("red2");
				}
			if(randomCard == 13)
				{
				String bb = cardColor[2/*yellow*/];
				System.out.println("yellow2");
				}
			if(randomCard == 14)
				{
				String cb = cardColor[3/*orange*/];
				System.out.println("orange2");
				}
			if(randomCard == 15)
				{
				String db = cardColor[4/*green*/];
				System.out.println("green2");
				}
			if(randomCard == 16)
				{
				String eb = cardColor[5/*blue*/];
				System.out.println("blue2");
				}
			if(randomCard == 17)
				{
				String fb = cardColor[6/*purple*/];
				System.out.println("purple2");
				}
			if(randomCard == 18)
				{
				String ac = cardColor[1/*red*/];
				System.out.println("red3");
				}
			if(randomCard == 19)
				{
				String bc = cardColor[2/*yellow*/];
				System.out.println("yellow3");
				}
			
			System.out.println("random card selection: " + randomCard);
		}
	}