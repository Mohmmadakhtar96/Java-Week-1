import java.util.Scanner;

public class Compass {
	
	public Scanner StringIn;
	public static void direction() {


		Scanner sc = new Scanner(System.in);{
			
			System.out.println("Enter direction");
			String direct = sc.next();

			System.out.println(direct);
			
			sc.close();
			
			String direction = "2";
			switch (direction) {
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
		
		for (int i =0; i>=10; i++)
			System.out.println(i +" "+"Steps");

		
		Scanner sc1 = new Scanner(System.in);{
			
			System.out.println("Enter direction");
			String direct1 = sc1.next();

			System.out.println(direct1);
			
			sc1.close();
			
			String direction1 = "2";
			switch (direct1) {
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
		}
	}
	}
}


