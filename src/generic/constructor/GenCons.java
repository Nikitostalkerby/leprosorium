package generic.constructor;

public class GenCons {
	private double value;

	<T extends Number> GenCons(T value) {
		this.value = value.doubleValue();
	}

	void showValue() {
		System.out.println("value: " + value);
	}
}