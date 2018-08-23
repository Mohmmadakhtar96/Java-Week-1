
public class Arrays {
	public static void main(String[] args) {
	
	
	int[] arrayofInts = {1,2,3,4,5};
	
	for (int i : arrayofInts)
	{
	System.out.println(i);
	}
	
	
	int[] arrayint = new int[3];
	
	for (int j = 0; arrayint.length; j++) 
		arrayint[j] = j + 1;
		int sum =0;
		for (int n : arrayint)
		sum += n;
		
		System.out.println(sum);
	}
		
		
	
	/*arrayint[0] = 1;
	arrayint[1] = 2;
	arrayint[2] = 3;
	}
	
	for (int j : arrayint)
	{
		System.out.println(j);*/
	}
}