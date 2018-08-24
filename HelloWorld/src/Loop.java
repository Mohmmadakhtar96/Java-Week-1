
public class Loop {
	public static void main(String[] args) {
		
		for(int i = 1; i<=10; i++)
		{
			System.out.println(i);
		}
		int day = 2;
		switch (day) {
		  case 6:
		    System.out.println("Garfield hates Mondays");
		    break;
			//etc.
		  case 2:    	
			  System.out.println("Saturday");
		    break;
		  case 5:
		    System.out.println("Sunday");
		    break;
		  default:
		    System.out.println("Not a day");
		    break;
		}
	}

}
