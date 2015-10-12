package helpFile;

class Lepro {

	public static void main(String[] args) {
		Help help = new Help(".//src/helpFile/help.txt");
		String topic;

		System.out.println("Try the help system. " + "Enter 'kurwa' to end.");

		do {
			topic = help.getSelection();

			if (!help.helpOn(topic))
				System.out.println("Topic not found.\n");
		} while (topic.compareTo("kurwa") != 0);
	}
}