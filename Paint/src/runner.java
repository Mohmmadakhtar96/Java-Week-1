import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		
		
		System.out.println("Room Area is: " + calcArea() + " m2");
		System.out.println(PriceLitre("CheapoMax", 19.99, 20) );
	}

			
		public static double calcArea() {
			
			double a = 1;
			double b = 2 ;
		
			//Scanner roomArea = new Scanner(System.in);
			
			//System.out.println("Enter Width");
			//a = roomArea.nextInt();		
			//System.out.println("Enter Height");
			//b = roomArea.nextInt();
			
			return a*b;
	}
		
		public static double PriceLitre(String name, double price, double litre) {
			
			double PriceLitre = price / litre;
			double cost = calcArea() /PriceLitre;
			return cost;
			
		}
		

}
