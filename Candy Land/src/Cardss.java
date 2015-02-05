import java.util.Scanner;
public class Cardss
	{
	public static void cardGenerator()
		{
		System.out.println();
		int randomCard = (int)(Math.random()*25)+1;
		String [] cardColor = {"red", "yellow", "orange", "green", "blue", "purple", "gingerbread", "peppermint", "peanut", "lollypop", "ice cream"};
			if(randomCard == 1)
				{
				String a = cardColor[1/*red*/];
				System.out.println("red");
				
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
				String A = cardColor[1/*red*/] + cardColor[1/*red*/];
				System.out.println("2 red");
				}
			if(randomCard == 13)
				{
				String B = cardColor[2/*yellow*/] + cardColor[2/*yellow*/];
				System.out.println("2 yellow");
				}
			if(randomCard == 14)
				{
				String C = cardColor[3/*orange*/] + cardColor[3/*orange*/];
				System.out.println("2 orange");
				}
			if(randomCard == 15)
				{
				String D = cardColor[4/*green*/] + cardColor[4/*green*/];
				System.out.println("2 green");
				}
			if(randomCard == 16)
				{
				String E = cardColor[5/*blue*/] + cardColor[5/*blue*/];
				System.out.println("2 blue");
				}
			if(randomCard == 17)
				{
				String F = cardColor[6/*purple*/] + cardColor[6/*purple*/];
				System.out.println("2 purple");
				}
			if(randomCard == 18)
				{
				String ab = cardColor[1/*red*/];
				System.out.println("red2");
				}
			if(randomCard == 19)
				{
				String bb = cardColor[2/*yellow*/];
				System.out.println("yellow2");
				}
			if(randomCard == 20)
				{
				String cb = cardColor[3/*orange*/];
				System.out.println("orange2");
				}
			if(randomCard == 21)
				{
				String db = cardColor[4/*green*/];
				System.out.println("green2");
				}
			if(randomCard == 22)
				{
				String eb = cardColor[5/*blue*/];
				System.out.println("blue2");
				}
			if(randomCard == 23)
				{
				String fb = cardColor[6/*purple*/];
				System.out.println("purple2");
				}
			if(randomCard == 24)
				{
				String ac = cardColor[1/*red*/];
				System.out.println("red3");
				}
			if(randomCard == 25)
				{
				String bc = cardColor[2/*yellow*/];
				System.out.println("yellow3");
				}
			
			System.out.println("random card selection: " + randomCard);
		}
	}