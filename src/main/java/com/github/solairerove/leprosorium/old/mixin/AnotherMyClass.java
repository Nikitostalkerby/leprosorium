package com.github.solairerove.leprosorium.old.mixin;

public class AnotherMyClass implements NamedMixin<MyName> {

	private MyName name;

	public final void setName(final MyName name) {
		this.name = name;
	}

	@Override
	public final MyName getName() {
		// TODO Auto-generated method stub
		return name;
	}
}