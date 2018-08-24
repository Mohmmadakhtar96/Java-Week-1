public class Bus extends Vehicle {
	public int seats;
	
	public Bus(String make, String model, double enginesize, int doors, int wheels, int seats) {
		super(make, model, enginesize, doors, wheels);
		// TODO Auto-generated constructor stub
		this.seats=seats;
	}

	public int seats(){
	return seats;
	}
	public int getSeats() {
		return seats;	
	}
	
	public void setSeats(int seats) {
		this.seats= seats;
				}
	
	public String toString() {
		return getMake ()+ " " + getModel ()+ " " + getEnginesize ()+" " + getDoors ()+" "+ getWheels ()+" " + getSeats ();  
	
}
}
