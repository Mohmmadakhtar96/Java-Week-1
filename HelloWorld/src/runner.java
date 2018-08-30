
public class runner {
	public static void main(String[] args) {
		String target = "This is a string";
	System.out.println(target.substring(0,3)); 
	
	System.out.println(target.charAt(2));
	
	System.out.println(target.substring(target.length()-3));
	
	//System.out.println(target.trim().substring(target.lengthbeginIndex, endIndex));

	System.out.println(target.trim().endsWith("g")); //checks what the last thing in the lsit is
	
	for (String s : target.split(" ")) {
		System.out.println(s);// splits the string up
		
		
	}
	method("ghg");
	

	}
public static void method(String input) {
	if(input.length() == 0) {
		System.out.println(input);
		
	}

	else {
		method(input.substring(0, input.length() - 1));
	}
	}
}

	

