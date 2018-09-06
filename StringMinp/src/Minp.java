
public class Minp {


	public static void main(String[] args) {
	
		
		
			
		String target = "This is a string";
		
	System.out.println(target.substring(0,3)); //picks up the first three letters 
	
	System.out.println(target.charAt(2)); //picks the second letter in the string
	
	System.out.println(target.substring(target.length()-3)); //prints out the 
	
	//System.out.println(target.trim().substring(target.lengthbeginIndex, endIndex));

	System.out.println(target.trim().endsWith("!")); //checks what the last thing in the list is
	
	System.out.println(target.lastIndexOf("e"));
	
	System.out.println(target.toUpperCase());
	
	
	System.out.println(target.toLowerCase());
	for (String s : target.split(" ")) {
		System.out.println(s);// splits the string up
		
		String reverse = "Hello";
		
		StringBuilder sB = new StringBuilder(reverse).reverse();
		System.out.println(sB);
		
					
		String original = "hello";
		String re = " ";
		
		for (int i = original.length()-1; i >=0 ; i--) {
			re = re +reverse.charAt(i);
		}
		System.out.println(re);
	}
	}
}

	
		
	
		







	//return orginal;

	
	
			



