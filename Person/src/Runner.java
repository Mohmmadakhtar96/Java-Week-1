import java.util.ArrayList;

public class Runner {
	
	public static void main(String[] args) {
		
		
		Person Bob = new Person("Bob", 23, "Manager");	//Bob object of person
		Person Charlie = new Person("Charlie", 20, "Trainee");
		
		System.out.println(Bob.toString()); //prints toString 
		System.out.println(Bob.showName() +" "+ Bob.showAge() +" "+ Bob.showjobTitle());
		System.out.println(Charlie.showName() +" "+ Charlie.showAge() +" "+ Charlie.showjobTitle());
		
//		Bob.name;
	
		ArrayList<Person> people = new ArrayList<Person>(); //arraylist for object person which bob is the object and people is the name of the list 
				people.add(Bob);
				people.add(Charlie);
		
				for(Person H : people) //loops through the list and assign everyone to H 
				{
					
					
					System.out.println(H.name);
				}
//				System.out.println(people.get(H). toString());}
				
				
			
	}
}
