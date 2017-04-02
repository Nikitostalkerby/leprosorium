package com.github.solairerove.leprosorium.old.base.twoDShape;

class Rectangle extends TwoDShape {

	Rectangle() {
		super();
	}

	Rectangle(double width, double height) {
		super(width, height, "rectangle");
	}

	Rectangle(double var) {
		super(var, "rectangle");
	}

	Rectangle(Rectangle object) {
		super(object);
	}

	boolean isSquare() {
		if (getWidth() == getHeight())
			return true;
		return false;
	}

	double area() {
		return getWidth() * getHeight();
	}
}