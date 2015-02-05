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
	static ArrayList <Land> spaces = new ArrayList <Land>();
	public static void declareBoard()
		{
		spaces.add(new Land ("red", 1));
		spaces.add(new Land ("purple", 2));
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
	public static ArrayList<Land> getSpaces()
		{
		return spaces;
		}
	public static void setSpaces(ArrayList<Land> spaces)
		{
		Land.spaces = spaces;
		}
	}