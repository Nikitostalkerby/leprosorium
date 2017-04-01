package base.iQueue;

class Lepro {
	public static void main(String args[]) {
		FixedQueue q = new FixedQueue(10);
		char ch;
		int i;

		try {
			for (i = 0; i < 11; i++) {
				System.out.print("Attempting to store : " + (char) ('A' + i));
				q.put((char) ('A' + i));
				System.out.println(" - OK");
			}
			System.out.println(" - OK");
		} catch (QueueFullException e) {
			System.out.println(e);
		}
		System.out.println();

		try {
			for (i = 0; i < 11; i++) {
				System.out.print("Getting next char: ");
				ch = q.get();
				System.out.println(ch);
			}
		} catch (QueueEmptyException e) {
			System.out.println(e);
		}
	}
}