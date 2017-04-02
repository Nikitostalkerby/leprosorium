package com.github.solairerove.leprosorium.old.base.abstractClass;

class Triangle extends TwoDShape {
	private String style;

	Triangle() {
		super();
		this.style = "null";
	}

	Triangle(String style, double width, double height) {
		super(width, height, "triangle");

		this.style = style;
	}

	Triangle(double var) {
		super(var, "triangle");

		this.style = "isosceles";
	}

	Triangle(Triangle object) {
		super(object);
		this.style = object.style;
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Triangle is " + this.style);
	}
}