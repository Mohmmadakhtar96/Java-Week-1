import java.util.Scanner;

public class Scan {
		
		public Scanner numIn;
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Name");
			
			System.out.println("Enter Age");
			String name = sc.nextLine();
			
			String gender = sc.next();
			
			System.out.println("name " +  "/ngender");
			
			sc.close();
		}
}