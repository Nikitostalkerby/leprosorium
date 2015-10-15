package file.trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Lepro {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		int i;

		try (FileInputStream fin = new FileInputStream(".//src/file/trycatch/input.txt")) {

			do {
				i = fin.read();
				if (i != -1) {
					System.out.print((char) i);
				}
			} while (i != -1);
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (IOException e) {
			System.out.println("Mothertrucker.");
		}
	}
}