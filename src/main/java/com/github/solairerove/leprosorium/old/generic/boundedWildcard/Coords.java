package com.github.solairerove.leprosorium.old.generic.boundedWildcard;

public class Coords<T extends TwoD> {
	T[] coords;

	Coords(T[] coords) {
		this.coords = coords;
	}
}