
public class MotorBikes extends Vehicle {
	
	public float weight;

	public MotorBikes(String make, String model, double enginesize, int doors, int wheels, float weight) {
		super(make, model, enginesize, doors, wheels);
		// TODO Auto-generated constructor stub
		this.weight = weight;
	}
	
	public float getWeight() {
		return weight;
	}
	  public void setWeight(float weight) {
		  this.weight = weight;
	  }
	  public String toString() {
			return getMake ()+ " " + getModel ()+ " " + getEnginesize ()+" " + getDoors ()+" "+ getWheels ()+" " + getWeight ();  
		}
	
	

}
