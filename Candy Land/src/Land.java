import java.util.ArrayList;
public class Land
	{
	static ArrayList <String> boardSpaces = new ArrayList<String>();
	public static void displayBoard()
		{
		
		boardSpaces.add("START LINE");
		boardSpaces.add("red");
		boardSpaces.add("yellow");
		boardSpaces.add("orange");
		boardSpaces.add("green");
		boardSpaces.add("blue");
		boardSpaces.add("purple");
		boardSpaces.add("red");
		boardSpaces.add("yellow");
		boardSpaces.add("orange");
		boardSpaces.add("green");
		boardSpaces.add("FINISH LINE");
		
		System.out.print("-----------------------");
		System.out.print(" ");
		System.out.print("--------------");
		System.out.print(" ");
		System.out.print("--------------");
		System.out.print(" ");
		System.out.print("--------------");
		System.out.print(" ");
		System.out.print("--------------");
		System.out.print(" ");
		System.out.print("--------------");
		System.out.print(" ");
		System.out.print("--------------");
		System.out.print(" ");
		System.out.print("--------------");
		System.out.print(" ");
		System.out.print("--------------");
		System.out.print(" ");
		System.out.print("--------------");
		System.out.print(" ");
		System.out.print("--------------");
		System.out.print(" ");
		System.out.println("-----------------------");
		//top of boxes
		System.out.print("|"+ "      " + boardSpaces.get(0));
		System.out.print("     |");
		System.out.print(" ");
		System.out.print("|" + boardSpaces.get(1));
		System.out.print("         |");
		System.out.print(" ");
		System.out.print("|" + boardSpaces.get(2));
		System.out.print("      |");
		System.out.print(" ");
		System.out.print("|" + boardSpaces.get(3));
		System.out.print("      |");
		System.out.print(" ");
		System.out.print("|" + boardSpaces.get(4));
		System.out.print("        |");
		System.out.print(" ");
		System.out.print("|" + boardSpaces.get(5));
		System.out.print("      |");
		System.out.print(" ");
		System.out.print("|" + boardSpaces.get(6));
		System.out.print("       |");
		System.out.print(" ");
		System.out.print("|" + boardSpaces.get(7));
		System.out.print("         |");
		System.out.print(" ");
		System.out.print("|" + boardSpaces.get(8));
		System.out.print("      |");
		System.out.print(" ");
		System.out.print("|" + boardSpaces.get(9));
		System.out.print("      |");
		System.out.print(" ");
		System.out.print("|" + boardSpaces.get(10));
		System.out.print("       |");
		System.out.print(" ");
		System.out.print("|"+ "     " + boardSpaces.get(11));
		System.out.println("     |");
		//inside and sides of boxes
		System.out.print("-----------------------");
		System.out.print(" ");
		System.out.print("--------------");
		System.out.print(" ");
		System.out.print("--------------");
		System.out.print(" ");
		System.out.print("--------------");
		System.out.print(" ");
		System.out.print("--------------");
		System.out.print(" ");
		System.out.print("--------------");
		System.out.print(" ");
		System.out.print("--------------");
		System.out.print(" ");
		System.out.print("--------------");
		System.out.print(" ");
		System.out.print("--------------");
		System.out.print(" ");
		System.out.print("--------------");
		System.out.print(" ");
		System.out.print("--------------");
		System.out.print(" ");
		System.out.println("-----------------------");
		//bottom of boxes
		}
	}