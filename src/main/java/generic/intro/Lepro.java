package generic.intro;

public class Lepro {

	public static void main(String[] args) {

		Gen<Integer> intObject;
		intObject = new Gen<Integer>(88);
		intObject.showType();

		int value = intObject.getObject();
		System.out.println("Value: " + value);
		System.out.println();

		Gen<String> stringObject = new Gen<String>("Generic Test");
		stringObject.showType();

		String str = stringObject.getObject();
		System.out.println("Value: " + str);
	}
}