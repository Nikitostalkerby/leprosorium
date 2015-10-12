package vehicle;

class Vehicle {
	private int passengers;
	private int fuelcap;
	private int mpg;

	Vehicle(int passengers, int fuelcap, int mpg) {
		this.passengers = passengers;
		this.fuelcap = fuelcap;
		this.mpg = mpg;
	}

	int range() {
		return mpg * fuelcap;
	}

	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}

	int getPassengers() {
		return this.passengers;
	}

	void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	int getFuelcap() {
		return this.fuelcap;
	}

	void setFuelcap(int fuelcap) {
		this.fuelcap = fuelcap;
	}

	int getMpg() {
		return this.mpg;
	}

	void setMpg(int mpg) {
		this.mpg = mpg;
	}
}