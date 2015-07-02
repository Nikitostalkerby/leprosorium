package helpFile;

// /home/abigor/workspace/leprosorium/src/helpFile/help

class Lepro {

	public static void main(String[] args) {
		Help help = new Help("/home/abigor/workspace/leprosorium/src/helpFile/help");
		String topic;
		
		System.out.println("Try the help system. " +
				"Enter 'kurwa' to end.");
		
		do {
			topic = help.getSelection();
			
			if(!help.helpOn(topic))
				System.out.println("Topic not found.\n");
		} while(topic.compareTo("kurwa") != 0);
	}
}