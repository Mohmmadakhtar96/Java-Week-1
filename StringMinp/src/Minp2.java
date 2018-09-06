
public class Minp2 {

	public static void main(String[] args) {
		String hithere = "Hi there!";
		System.out.println(hithere.compareTo("Hi There"));
		System.out.println(hithere.compareTo("Hello There"));
		
		
		//Split String
		String story = "Sean went to the shop";
		String[] wordList = story.split(" ");
		//System.out.println(wordList);
	
	for (int i=0; i<wordList.length; i++) {
		System.out.println(wordList[i]);
		System.out.println(wordList.length); //word and the list
	
	//boolean 
		String shells = "Sea shell on the seashore";
		System.out.println(shells.startsWith("Se")); //gives true in the console
	
	
	//string to lowercase
		
		String[]shellList = shells.toLowerCase().split(" ");
		int count = 0;
		
		for(String s :shellList) {
			if(s.startsWith("Se")) {
				count ++;
			}
		
		
		}

		{
		
		//String trim
		String movies = "I am going to the movies";
		//System.out.println(movies);
		System.out.println(movies.trim());
		
		String cleaned = movies.replaceAll("\\s +", " ");
		System.out.println(cleaned);
		}
		
	}
	}

	
	if (orginal.length() <2) {
		return orginal;
		
		{
	return reverseString(orginal.substring(1)) + orginal.charAt(0);
	}
	
	
	System.out.println(reverseString(orginal));
	
}
