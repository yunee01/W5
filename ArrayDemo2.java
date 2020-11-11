class ArrayDemo2
{

	//PASS BY REFERENCE
	public static void passByReference (String a[])
	{
			a[0] = "Changed";
	}

	public static String passByValue (String a)
	{
		return a = "Changed Again";
	}

	public static String[] getArray()
	{
		String[] a = {"One", "Two", "Three"};
		return a;
	}

	public static void main (String[] args)
	{
		String[] b={"Apple","Mango","Orange"};
		System.out.println("Before Function Call : " + b[0]);

		ArrayDemo2.passByReference(b);
		System.out.println("After Function Call : " + b[0]);

		ArrayDemo2.passByValue(b[0]);
		System.out.println("After Return Value : " + b[0]);

		System.out.println("The Array : ");
		for (String v: b)
			System.out.println(v);

		String[] c;
		c=getArray();
		for(String v: c)
			System.out.println(v);

	}
	//PASS BY REFERENCE


	
}
	

	
	


		
