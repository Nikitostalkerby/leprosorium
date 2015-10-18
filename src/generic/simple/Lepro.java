package generic.simple;

public class Lepro {

	public static void main(String[] args) {

		TwoGen<Integer, String> object = new TwoGen<Integer, String>(88, "Generics");
		object.showTypes();

		int value = object.getob1();
		System.out.println("Value: " + value);

		String str = object.getob2();
		System.out.println("Value: " + str);
	}
}