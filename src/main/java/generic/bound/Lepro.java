package generic.bound;

public class Lepro {

	public static void main(String[] args) {

		Integer inums[] = { 1, 2, 3, 4, 5 };
		Gen<Integer> iob = new Gen<Integer>(inums);
		double i = iob.average();
		System.out.println("iob average is " + i);

		Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Gen<Double> dob = new Gen<Double>(dnums);
		double d = dob.average();
		System.out.println("dob average is " + d);
	}
}