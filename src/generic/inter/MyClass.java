package generic.inter;

public class MyClass<T extends Comparable<T>> implements MinMax<T> {
	T[] values;

	MyClass(T[] values) {
		this.values = values;
	}

	public T min() {
		T value = values[0];

		for (int i = 0; i < values.length; i++) {
			if (values[i].compareTo(value) < 0) {
				value = values[i];
			}
		}
		return value;
	}

	public T max() {
		T value = values[0];

		for (int i = 0; i < values.length; i++) {
			if (values[i].compareTo(value) > 0) {
				value = values[i];
			}
		}
		return value;
	}
}