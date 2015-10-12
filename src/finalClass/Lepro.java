package finalClass;

public class Lepro {

	public static void main(String[] args) {
		Complex c = Complex.valueOf(2, 5);
		Complex o = Complex.valueOf(2, 5);

		System.out.println(c.toString());
		System.out.println(c.hashCode());
		System.out.println(c.equals(o));
	}
}