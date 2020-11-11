import java.util.Vector;
import java.util.Enumeration; //API Enumeration

public class DemoVector
{
	public static void main (String[] args)
	{
		Vector<String> fruits = new Vector<String>();

		fruits.add("Rambutan");
		fruits.add("Jackfruit");
		fruits.add("Mangosteen");

		System.out.println(fruits);

		//fruits.remove ("Jackfruit");
		fruits.add("Mango");
		
		System.out.println(fruits);
		System.out.println("Mangosteen is exist ? " + fruits.contains("Mangosteen"));
		System.out.println("Position : " + fruits.get(1)); //fruits.get (index)

		fruits.set(1,"Durian");
		fruits.add(2,"Avacado");

		System.out.println(fruits);
		System.out.println("Size : " + fruits.size());		

		//another way to travese using loop other than toString, for each
		Enumeration<String> enumFruit = fruits.elements();
		while (enumFruit.hasMoreElements())
		{
			System.out.println(enumFruit.nextElement()); //nextElement = i++
		}

		/*System.out.println("With for : ");
		for (Enumeration<String> e = v.elements(); e.hasMoreElements();) 
			System.out.println(e.nextElement());*/
	}
}