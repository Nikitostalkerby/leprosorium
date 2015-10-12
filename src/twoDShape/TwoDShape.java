package twoDShape;

class TwoDShape {
	private double width;
	private double height;
	private String name;

	TwoDShape() {
		this.width = this.height = 0.0;
		this.name = "null";
	}

	TwoDShape(double width, double height, String name) {
		this.width = width;
		this.height = height;
		this.name = name;
	}

	TwoDShape(double var, String name) {
		this.width = this.height = var;
		this.name = name;
	}

	TwoDShape(TwoDShape object) {
		this.width = object.width;
		this.height = object.height;
		this.name = object.name;
	}

	double getWidth() {
		return this.width;
	}

	double getHeight() {
		return this.height;
	}

	void setWidth(double width) {
		this.width = width;
	}

	void setHeight(double height) {
		this.height = height;
	}

	String getName() {
		return this.name;
	}

	void showDim() {
		System.out.println("Width and height are " + this.width + " and " + this.height);
	}

	double area() {
		System.out.println("area() must be overriden");
		return 0.0;
	}
}