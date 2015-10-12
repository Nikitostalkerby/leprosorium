package showFileWithFinally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Lepro {

	public static void main(String[] args) {

		int i;
		FileInputStream fin;

		try {
			// open the file
			fin = new FileInputStream(".//src/showFileWithFinally/input.txt");
		} catch (FileNotFoundException exc) {
			System.out.println("File not found");
			return;
		}

		try {
			do {
				i = fin.read();
				if (i != -1)
					System.out.print((char) i);
			} while (i != -1);
		} catch (IOException exc) {
			System.out.println("Error reading file.");
		} finally {
			try {
				fin.close();
			} catch (IOException exc) {
				System.out.println("Error closing file.");
			}
		}
	}
}