package com.github.solairerove.leprosorium.old.base.iQueue;

@SuppressWarnings("serial")
class QueueEmptyException extends Exception {
	public String toString() {
		return "\nQueue is empty.";
	}
}