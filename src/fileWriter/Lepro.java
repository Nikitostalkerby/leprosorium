package fileWriter;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Lepro {

	public static void main(String[] args) {

		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter text('stop' to quit).");

		try (FileWriter fw = new FileWriter(".//src/fileWriter/input.txt")) {
			do {
				System.out.print(": ");
				str = br.readLine();
				if (str.compareTo("stop") == 0)
					break;
				str = str + "\r\n";
				fw.write(str);
			} while (str.compareTo("stop") != 0);
		} catch (IOException e) {
			System.out.println("Mothertrucker: " + e);
		}
	}
}