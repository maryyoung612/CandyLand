
public class AI
	{
	public static void AIMove()
		{
		System.out.println("Now it is the computer's turn.");
		Cardss.cardGenerator();
		for (int i = 0; i < Land.boardSpaces[i].length(); i++)
			{
			if (Cardss.randomCard == Cardss.cardColor[1])
				{
				Land.boardSpaces[i] = Player.newAIToken;
				}
			else if (Cardss.randomCard == Cards.cardColor[2])
				{
				Land.boardSpaces[i] = Player.newAIToken;
				}
			else if (Cardss.randomCard == Cards.cardColor[3])
				{
				Land.boardSpaces[i] = Player.newAIToken;
				}
			else if (Cardss.randomCard == Cards.cardColor[4])
				{
				Land.boardSpaces[i] = Player.newAIToken;
				}
			else if (Cardss.randomCard == Cards.cardColor[5])
				{
				Land.boardSpaces[i] = Player.newAIToken;
				}
			else if (Cardss.randomCard == Cards.cardColor[6])
				{
				Land.boardSpaces[i] = Player.newAIToken;
				}
			else if (Cardss.randomCard == Cards.cardColor[7])
				{
				Land.boardSpaces[i] = Player.newAIToken;
				}
			}
		}
	}