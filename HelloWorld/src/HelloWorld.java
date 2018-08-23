
public class HelloWorld {
	public static void main(String[] args) {
		

		String i = "Hello World";
		
		System.out.println(i);
		System.out.println(Number());
		
		System.out.println(Number2(11, 13, false));
		
		
	}
	public static int Number() {
		int j = 2;
		
		return j;
	}
	static int Number2(int i, int k, boolean h) {
		int sum;
		if (h == true) {
			
		sum = i + k;
		
		}	
		
		else if (i == 0 || k == 0){
			sum = 0;
		
			
		}
		else {
		
		sum  = i * k;
		
		}
		return sum;
	}
}

