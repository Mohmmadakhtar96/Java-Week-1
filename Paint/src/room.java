import java.util.Scanner;

public class room { //wall to paint
	
	//public static void main(String[] args) {
		
	
		public static double calcArea() {
	
		int a;
		int b;
		
		Scanner roomArea = new Scanner(System.in);
		
		System.out.println("Enter Width");
		a = roomArea.nextInt();		
		System.out.println("Enter Height");
		b = roomArea.nextInt();
		
		return a*b;
		
		System.out.println("Room Area is: " + calcArea() + "m2");
		}
		
}
