package queue;

//Класс, реализующий очередь для хранения символов
public class Queue {
	private char q[]; // 
	private int putloc, getloc; //
	
	// сконструировать пустую очередь заданного размера
	Queue(int size) {
		q = new char[size+1]; // выделить память для очереди
		putloc = getloc = 0;
	}
	
	// сконструировать  очередь из существующего объекта типа Queue
	Queue(Queue ob) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];
		
		// копировать элементы в очередь
		for(int i=getloc+1; i <= putloc; i++)
			q[i] = ob.q[i];
	}
	
	// сконструировать очередь из массива исходных значений
	Queue(char a[]) {
		putloc = 0;
		getloc = 0;
		q = new char[a.length+1];
		
		for(int i = 0; i < a.length; i++)
			put(a[i]);
	}
	
	// поместить символ в очередь
	void put(char ch) {
		if(putloc==q.length-1) {
			System.out.println(" - Queue is full.");
			return;
		}
		
		putloc++;
		q[putloc] = ch;
	}
	
	// извлечь символ из очереди
	char get() {
		if(getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		
		getloc++;
		return q[getloc];
	}
}
