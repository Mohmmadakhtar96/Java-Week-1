
public class Vehicle {

		private String make; 
		private String model;
		private double enginesize;
		public int doors;
		public int wheels;
		
		public Vehicle(String make, String model, double enginesize, int doors, int wheels) {
					this.make = make;
					this.model = model;
					this.enginesize = enginesize;
					this.doors = doors;
					this.wheels = wheels;
	
}

		public String getMake() {
			return make;
		}

		public void setMake(String make) {
			this.make = make;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public double getEnginesize() {
			return enginesize;
		}

		public void setEnginesize(double enginesize) {
			this.enginesize = enginesize;
		}

		public int getDoors() {
			return doors;
		}

		public void setDoors(int doors) {
			this.doors = doors;
		}

		public int getWheels() {
			return wheels;
		}

		public void setWheels(int wheels) {
			this.wheels = wheels;
		}
}

