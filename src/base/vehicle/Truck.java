package base.vehicle;

class Truck extends Vehicle {
	private int cargocap;

	Truck(int p, int f, int m, int cargocap) {
		super(p, f, m);

		this.cargocap = cargocap;
	}

	int getCargo() {
		return this.cargocap;
	}

	void setCargo(int cargocap) {
		this.cargocap = cargocap;
	}
}