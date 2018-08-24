public class Cars extends Vehicle {
	
	public String color;

	
	public Cars(String make, String model, double d, int doors, int wheels, String color) {
		super(make, model, d, doors, wheels);
		this.color = color;
		// TODO Auto-generated constructor stub
	}


	
	public String getColor() {
		return color;
	}
		
	public void setColor(String color){
		this.color = color;
	}
	
	public String toString() {
		return getMake ()+ " " + getModel ()+ " " + getEnginesize ()+" " + getDoors ()+" "+ getWheels ()+" " + getColor ();  
	}

}