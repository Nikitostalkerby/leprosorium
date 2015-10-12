package modifiedShowFile;

import java.io.FileInputStream;
import java.io.IOException;

class Lepro {

	public static void main(String[] args) {

		int i;

		try (FileInputStream fin = new FileInputStream(".//src/modifiedShowFile/input.txt")) {
			do {
				i = fin.read();
				if (i != -1)
					System.out.print((char) i);
			} while (i != -1);
		} catch (IOException e) {
			System.out.println("I/O error:" + e);
		}
	}
}