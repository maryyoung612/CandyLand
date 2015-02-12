public class gameRunner
	{
	public static void main(String[] args)
		{
		Player.introToPLayer();
		Land.displayBoard();
		boolean gameIsWon = false;
		while (!gameIsWon)
			{
			Player.playerMove();
			Land.displayBoard();
			if (Player.location >= 16)
				{
				System.out.println();
				System.out.println("YOU WIN! Your skill level is that of a preschooler!");
				System.exit(0);
				}
			}
		}
	}