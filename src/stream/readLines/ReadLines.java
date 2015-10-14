package stream.readLines;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ReadLines {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;

		System.out.println("Enter lines of text.");
		System.out.println("Enter 'kurwa' to quit.");
		do {
			str = br.readLine();
			System.out.println(str);
			if (str.equals("kurwa"))
				System.out.println("pwe pwe pwe\n");
		} while (!str.equals("kurwa"));
	}
}