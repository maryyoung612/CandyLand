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
			if (Land.boardSpaces.getPlayer.location.equals(Land.boardSpaces.get(11))
				{
				System.out.println("YOU WIN!");
				System.exit(0);
				}
			}
		}
	}