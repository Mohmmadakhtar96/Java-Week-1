import java.util.Scanner;

public class BlackJack {
	
	private static Scanner numIn;
	
	public static void main(String[] args) {
	
		int a;
		int b;
		
		numIn = new Scanner(System.in);
		
		System.out.println("Enter first number");
		a = numIn.nextInt();
		System.out.println("Enter second number");
		b = numIn.nextInt();
		
		
	
	if (a > b) 
	{
		System.out.println(a + " is bigger");
	}
	
	else if (a > 21 || b > 21) {
		a = 0;
		b = 0;
	
		System.out.println(a + b);
	}
	
	else 
	{
		System.out.println(b  + " is bigger");
	}
	
}
}