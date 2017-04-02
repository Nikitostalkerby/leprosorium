package com.github.solairerove.leprosorium.old.generic.inter;

public interface MinMax<T extends Comparable<T>> {
	T min();
	
	T max();
}