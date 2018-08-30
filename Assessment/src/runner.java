import java.util.Scanner;

public class runner  {

	public static void main(String[] args) {
	
		
		Player P1 = new Player("John");
		
		System.out.println("Welcome"+" "+ P1);
		System.out.println("Grey foggy clouds float oppressively close to you,\r\n" + 
				"\n" + 
				"reflected in the murky grey water which reaches up your shins.\n" + 
				"\n" + 
				"Some black plants barely poke out of the shallow water.\r\n" + 
				"");
		
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
