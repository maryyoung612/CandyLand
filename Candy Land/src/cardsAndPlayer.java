import java.util.ArrayList;
public class cardsAndPlayer
	{
	public static void cardGenerator()
	{
	int randomCard = (int)(Math.random()*64)+1;
	String [] cardColor = {"Red", "Yellow", "Orange", "Green", "Blue", "Purple"};
	if(randomCard == 1)
		{
		String a = cardColor["Red"];
		}
	if(randomCard == 2)
		{
		String b = cardColor["Yellow"];
		}
	if(randomCard == 3)
		{
		String c = cardColor["Orange"];
		}
	if(randomCard == 4)
		{
		String d = cardColor["Green"];
		}
	if(randomCard == 5)
		{
		String e = cardColor["Blue"];
		}
	if(randomCard == 6)
		{
		String f = cardColor["Purple"];
		}
	if(randomCard == 7)
		{
		String A = cardColor["Red"] + cardColor["Red"];
		}
	if(randomCard == 8)
		{
		
		}
	if(randomCard == 9)
		{
		
		}
	}
	}