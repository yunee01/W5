import java.util.HashSet;

public class DemoSet
{
	public static void main(String[] args)
	{
		HashSet<String> setColors = new HashSet<String>();

		setColors.add("Red");
		setColors.add("Green");
		setColors.add("Yellow");
		setColors.add("Pink");
		setColors.add("Green"); //will nor be added into set

		System.out.println(setColors);
	}
}