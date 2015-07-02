package iQueue;

class CircularQueue implements ICharQ {
	private char q[];
	private int putloc, getloc;
	
	public CircularQueue(int size) {
		q = new char[size+1];
		putloc = getloc = 0;
	}
	
	//
	public void put(char ch) {
		/* Очередь считается полной, если putloc на 1
		 * меньше getloc или если putloc указывает
		 * на конец массива, а getloc - на его начало. */
		if(putloc+1 == getloc |
				(putloc == q.length-1) & (getloc == 0)) {
			System.out.println(" - Queue is full.");
			return;
		}
		putloc++;
		
		// вернуться в начало
		if(putloc == q.length) putloc = 0;
		q[putloc] = ch;
	}
	
	public char get() {
		if(getloc == putloc) {
			System.out.println(" - Queue is emplty.");
			return (char) 0;
		}
		
		getloc++;
		
		// вернуться в начало
		if(getloc == q.length) getloc = 0;
		return q[getloc];
	}
}
