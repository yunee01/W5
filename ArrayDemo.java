public class ArrayDemo
{
	public static void main (String[] args)
	{
		//EXAMPLE 1
		//declare & create an array of integer
		int[] anArray = new int[10]; //default value 0

		//assign a value to each array element and print
		for(int i = 0; i < anArray.length; i++)
		{
			anArray[i] = i;
			System.out.print(anArray[i] + " ");
		}
		System.out.println("\n\n");


		//EXAMPLE 2
		double[] val = new double[4];
		val[0] = 0.12;
		val[1] =1.43;
		val[2] = 2.98;

		int j = 3;
		System.out.println( val[j] ); //val[3] = 0.0
		System.out.println( val[j-1] ); //val[3-1] = 2.98

		j=j-2; //j=1
		System.out.println( val[j] );
		System.out.println("\n");


		//EXAMPLE 3
		int[] data = {23, 38, 14,-3, 0, 14, 9, 103, 0, -56};
		System.out.println("Array Size is " + data.length);
		//System.out.println("10th index element : " + data[10]); //exception inot error
		System.out.println("\n");


		//EXAMPLE 4
		int[] valA = {12, 23, 45, 56};
		int[] valB = new int[4];

		//correct if valB = valA
		//wrong if valA = valB
		//int[] valA = {12, 23, 45, 56};
		//int[] valB;

		//way 1
		/*valB[ 0 ] = valA[ 0 ];
		valB[ 1 ] = valA[ 1 ];
		valB[ 2 ] = valA[ 2 ];
		valB[ 3 ] = valA[ 3 ];*/

		//way 2
		valB = valA;

		//all value in valB is the same as valA
		for (int i = 0; i < valB.length; i++)
			System.out.println("Index in valB " + i + " : " + valB[ i ]);
		

		valA = valB;

		//all value in valA = 0 && valB = 0
		for (int i = 0; i < valB.length; i++)
			System.out.println("Index in valB" + i + " : " + valB[ i ]);
		System.out.println("\n");

		//EXAMPLE 5
		//ARRAY 2D
		int[][] anArray2 = new int[10][3];
		System.out.println("Row Length ? " + anArray2.length);
		System.out.println("Col Length ? " + anArray2[0].length);

		
	} 
}