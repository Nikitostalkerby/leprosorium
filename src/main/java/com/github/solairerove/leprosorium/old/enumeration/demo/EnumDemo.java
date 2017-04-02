package com.github.solairerove.leprosorium.old.enumeration.demo;

class EnumDemo {

	public static void main(String[] args) {
		Apple ap;

		System.out.println("Here are all Apple constants: ");

		Apple allApples[] = Apple.values();

		for (Apple a : allApples) {
			System.out.println(a);
		}

		ap = Apple.valueOf("Winesap");
		System.out.println("ap contains " + ap);
	}
}
