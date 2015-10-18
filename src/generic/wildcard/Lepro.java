package generic.wildcard;

public class Lepro {

	public static void main(String[] args) {

		Integer inums[] = { 1, 2, 3, 4, 5 };
		Stats<Integer> iob = new Stats<Integer>(inums);
		double i = iob.average();
		System.out.println("iob average is " + i);

		Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Stats<Double> dob = new Stats<Double>(dnums);
		double d = dob.average();
		System.out.println("dob average is " + d);

		Float fnums[] = { 1.1F, 2.2F, 3.3F, 4.4F, 5.5F };
		Stats<Float> fob = new Stats<Float>(fnums);
		double f = fob.average();
		System.out.println("fob average is " + f);

		System.out.println("Averages of iob and dob ");
		if (iob.sameAvg(dob)) {
			System.out.println("are the same.");
		} else {
			System.out.println("differ.");
		}

		System.out.println("Averages of iob and fob ");
		if (iob.sameAvg(fob)) {
			System.out.println("are the same.");
		} else {
			System.out.println("differ.");
		}
	}
}