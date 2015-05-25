import java.io.*;

// /home/vaas/Документы/leprosorium/ShowFile/src/text
class Lepro {

	public static void main(String[] args) {
		
		int i;
		FileInputStream fin;
		
		if(args.length != 1) {
			System.out.println("What the duck is this sheet");
			return;
		}
		
		try {
			// open the file
			fin = new FileInputStream(args[0]);
		} catch(FileNotFoundException exc) {
			System.out.println("File not found");
			return;
		}
		
		try {
			do {
				// reading the file
				i = fin.read();
				if(i != -1) System.out.print((char) i);
				// if (i = -1) end of file
			} while(i != -1);
		} catch(IOException exc) {
			System.out.println("Error reading file.");
		}
		
		try {
			fin.close();
		} catch(IOException exc) {
			System.out.println("Error closing file.");
		}
	}
}