package file.fileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Lepro {

	public static void main(String[] args) {

		String str;

		try (BufferedReader br = new BufferedReader(new FileReader(".//src/file/fileReader/input.txt"))) {
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			System.out.println("Mothertrucker: " + e);
		}
	}
}