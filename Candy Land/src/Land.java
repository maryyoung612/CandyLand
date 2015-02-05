import java.util.ArrayList;
public class Land
	{
	private String spaceColor;
	private int spaceNum;
	public Land (String sc, int sn)
		{
		spaceColor = sc;
		spaceNum = sn;
		}
	static String spaces []= new String [10];	
	[] spaces = {"red", "purple", "yellow", "blue", "orange", "green", "red", "gingerbread", "yellow", "blue"};
	
	public static void displayBoard()
		{
		System.out.print("-----------------------");
		System.out.print(" ");
		System.out.print("-------");
		System.out.print(" ");
		System.out.print("-------");
		System.out.print(" ");
		System.out.print("-------");
		System.out.print(" ");
		System.out.print("-------");
		System.out.print(" ");
		System.out.print("-------");
		System.out.print(" ");
		System.out.print("-------");
		System.out.print(" ");
		System.out.print("-------");
		System.out.print(" ");
		System.out.print("-------");
		System.out.print(" ");
		System.out.print("-------");
		System.out.print(" ");
		System.out.println("-------");
		//top of boxes
		System.out.print("|");
		System.out.print("     START LINE!");
		System.out.print("     |");
		System.out.print(" ");
		System.out.print("|");
		System.out.print("     |");
		System.out.print(" ");
		System.out.print("|");
		System.out.print("     |");
		System.out.print(" ");
		System.out.print("|");
		System.out.print("     |");
		System.out.print(" ");
		System.out.print("|");
		System.out.print("     |");
		System.out.print(" ");
		System.out.print("|");
		System.out.print("     |");
		System.out.print(" ");
		System.out.print("|");
		System.out.print("     |");
		System.out.print(" ");
		System.out.print("|");
		System.out.print("     |");
		System.out.print(" ");
		System.out.print("|");
		System.out.print("     |");
		System.out.print(" ");
		System.out.print("|");
		System.out.print("     |");
		System.out.print(" ");
		System.out.print("|");
		System.out.println("     |");
		//inside and sides of boxes
		System.out.print("-----------------------");
		System.out.print(" ");
		System.out.print("-------");
		System.out.print(" ");
		System.out.print("-------");
		System.out.print(" ");
		System.out.print("-------");
		System.out.print(" ");
		System.out.print("-------");
		System.out.print(" ");
		System.out.print("-------");
		System.out.print(" ");
		System.out.print("-------");
		System.out.print(" ");
		System.out.print("-------");
		System.out.print(" ");
		System.out.print("-------");
		System.out.print(" ");
		System.out.print("-------");
		System.out.print(" ");
		System.out.println("-------");
		//bottom of boxes
		}

	public String getSpaceColor()
		{
		return spaceColor;
		}
	public void setSpaceColor(String spaceColor)
		{
		this.spaceColor = spaceColor;
		}
	public int getSpaceNum()
		{
		return spaceNum;
		}
	public void setSpaceNum(int spaceNum)
		{
		this.spaceNum = spaceNum;
		}
	}