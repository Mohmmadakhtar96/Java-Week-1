import java.util.Scanner;

public class Compass {
	
	public Scanner StringIn;
	public static void direction() {

		
		//put in while loop

		Scanner sc = new Scanner(System.in);{
			
			System.out.println("Enter direction");
			String direct = sc.next();

			System.out.println(direct);
			
			while (direct = ("South"));{
			switch (direct) {
			
			  case "1":
			    System.out.println("Move North");
			    break;
				//etc.
			  case "2":    	
				  System.out.println("Move South");
			    break;
			  case "3":
			    System.out.println("Move East");
			    break;
			  default:
			    System.out.println("Carry on Walking");
			    break;
			}
		
		for (int i =0; i<=5; i++)
			System.out.println(i +" "+"Steps");

	}
	}
}
}


