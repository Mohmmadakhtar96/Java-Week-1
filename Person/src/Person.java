
public class Person {
	
	public String  name; //variables
	private int  age;
	private String  jobtitle;
	public Person(String name, int age, String jobtitle) { //parameter name 
		
		this.name = name; //assigns class name to the parameter name 
		this.age = age;
		this.jobtitle = jobtitle;
	}
		public void Persos() {
		}
		
			public String showName() { //method with a string return type
				 
				return name;
			}
			
			public int showAge() { //method with int return type
				return age;
			}
			
			public String showjobTitle( ) { //method with string return type
				return jobtitle;	//this returns jobtitle variable 
			}
			
		public String toString() {
			return "\nName: "+name+"\nAge: "+age+"\nJob Title: "+jobtitle;
		}
		
}


