package generic.intro;

public class Gen<T> {

	T object;

	Gen(T object) {
		this.object = object;
	}

	T getObject() {
		return this.object;
	}

	void showType() {
		System.out.println("Type T is " + object.getClass().getName());
	}
}