package showFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Lepro {

	public static void main(String[] args) {

		int i;
		FileInputStream fin;

		try {
			// open the file
			fin = new FileInputStream(".//src/showFile/input.txt");
		} catch (FileNotFoundException exc) {
			System.out.println("File not found");
			return;
		}

		try {
			do {
				// reading the file
				i = fin.read();
				if (i != -1)
					System.out.print((char) i);
				// if (i = -1) end of file
			} while (i != -1);
		} catch (IOException exc) {
			System.out.println("Error reading file.");
		}

		try {
			fin.close();
		} catch (IOException exc) {
			System.out.println("Error closing file.");
		}
	}
}