package com.github.solairerove.leprosorium.old.generic.constructor;

public class Lepro {

	public static void main(String[] args) {
		GenCons test = new GenCons(100);
		GenCons test2 = new GenCons(123.4F);

		test.showValue();
		test2.showValue();
	}
}