package file.showFileInPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Lepro {

	public static void main(String[] args) {

		int i;
		FileInputStream fin = null;

		try {
			fin = new FileInputStream(".//src/file/showFileInPractice/input.txt");

			do {
				i = fin.read();
				if (i != -1)
					System.out.print((char) i);
			} while (i != -1);
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (IOException e) {
			System.out.println("An I/O error occurred.");
		} finally {
			try {
				if (fin != null)
					fin.close();
			} catch (IOException e) {
				System.out.println("Error closing file.");
			}
		}
	}
}