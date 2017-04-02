package com.github.solairerove.leprosorium.old.base.iQueue;

@SuppressWarnings("serial")
class QueueFullException extends Exception {
	int size;
	
	QueueFullException(int s) { size = s; }
	
	public String toString() {
		return "\nQueue is full. Maximum size is " +
				size;
	}
}