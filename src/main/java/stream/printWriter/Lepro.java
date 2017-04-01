package stream.printWriter;

import java.io.PrintWriter;

public class Lepro {

	public static void main(String[] args) {

		PrintWriter pw = new PrintWriter(System.out, true);

		pw.println("Some string.");

		int i = -7;
		pw.println(i);

		double d = 4.5e-7;
		pw.println(d);
	}
}