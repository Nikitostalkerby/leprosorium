package mixin;

public final class NameMixinProvider<T> implements Named<T> {

	private T name;

	public final void setName(final T name) {
		this.name = name;
	}

	@Override
	public final T getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
}