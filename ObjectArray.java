//when there is no word "public" in front of class
//naming file can be anyname.java
class Account
{
	int a, b;

	public void setData (int c,int d)
	{
		a=c;
		b=d;
	}

	public void showData()
	{
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
	}
}

class ObjectArray
{
	public static void main (String[] args)
	{
		Account obj[] = new Account[2]; //declare and prepare memory
		obj[0] = new Account(); //initialize object
		obj[1] = new Account();
		obj[0] .setData(1, 2);
		obj[1] .setData(3, 4);
		System.out.println("For Array ELement 0");
		obj[0].showData();
		System.out.println("For Array ELement 1");
		obj[1].showData();
	}
}


