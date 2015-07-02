package queue;

// продемонстрировать класс Queue в действии
public class Lepro {
	public static void main(String args[]) {
		// построить пустую очередь для хранения 10 элементов
		Queue q1 = new Queue(10);
		char name[] = {'T', 'o', 'm'};
		// построить очередь из массива
		Queue q2 = new Queue(name);
		
		char ch;
		int i;
		
		// поместить ряд символов в очередь q1
		for(i = 0; i < 10; i++)
			q1.put((char) ('A' + i));
		
		// построить одну очередь из другой очереди
		Queue q3 = new Queue(q1);
		
		// показать очереди
		System.out.print("Contents of q1: ");
		for(i=0; i < 10; i++) {
			ch = q1.get();
			System.out.print(ch);
		}
		
		System.out.println("\n");
		
		System.out.print("Contents of q2: ");
		for(i=0; i < 3; i++) {
			ch = q2.get();
			System.out.print(ch);
		}
		
		System.out.println("\n");
		
		System.out.print("Contents of q3: ");
		for(i=0; i < 10; i++) {
			ch = q3.get();
			System.out.print(ch);
		}
	}
}
