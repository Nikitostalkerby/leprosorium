package com.github.solairerove.leprosorium.old.mixin;

public class MyClass implements NamedMixin<String> {

	private String name;

	public final void setName(final String name) {
		this.name = name;
	}

	@Override
	public final String getName() {
		return this.name;
	}
}