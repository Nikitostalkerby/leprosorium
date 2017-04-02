package com.github.solairerove.leprosorium.old.base.iQueue;

public interface Charable {
	void put(char ch) throws QueueFullException;

	char get() throws QueueEmptyException;
}