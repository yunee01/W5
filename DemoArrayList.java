import java.util.ArrayList;

public class DemoArrayList
{
	public static void main (String[] args)
	{
		ArrayList<String> cars = new ArrayList<String>();

		cars.add("Ferrari");
		cars.add("Honda BRV");
		cars.add("Lamborghini");

		System.out.println(cars);

		//fruits.remove ("Jackfruit");
		cars.add("Audi");
		
		System.out.println(cars);
		System.out.println("BMW is exist ? " + cars.contains("BMW"));
		System.out.println("Position : " + cars.get(3)); //fruits.get (index)

		cars.set(2, "BMW");
		cars.add(2, "Yahama");

		System.out.println(cars);
		System.out.println("Size : " + cars.size());		
	}
}