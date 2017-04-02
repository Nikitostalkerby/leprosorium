package com.github.solairerove.leprosorium.old.enumeration.demo;

class Lepro {

	public static void main(String[] args) {
		Apple apple;

		apple = Apple.RedDel;
		System.out.println("Value of apple: " + apple);

		apple = Apple.GoldenDel;

		if (apple == Apple.GoldenDel) {
			System.out.println("apple contatins GoldenDel");
		}

		// Use an enum to control a switch statement
		switch (apple) {
		case Jonathan:
			System.out.println("Jonathan is red.");
			break;
		case GoldenDel:
			System.out.println("GoldenDel is yellow.");
			break;
		case RedDel:
			System.out.println("Red Delicious is red.");
			break;
		case Winesap:
			System.out.println("Winesap is red.");
			break;
		case Cortland:
			System.out.println("Cortland is red.");
			break;
		}
	}
}