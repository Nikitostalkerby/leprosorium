package com.github.solairerove.leprosorium.old.file.copyFileExt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Lepro {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		int i;

		try (FileInputStream fin = new FileInputStream(".//src/com.github.solairerove.leprosorium.old.file/copyFileExt/input.txt");
			 FileOutputStream fout = new FileOutputStream(".//src/com.github.solairerove.leprosorium.old.file/copyFileExt/output.txt")) {
			do {
				i = fin.read();

				if (i != -1) {
					fout.write(i);
				}
			} while (i != -1);
		} catch (IOException e) {

			PrintWriter pw = new PrintWriter(System.out);
			pw.println("I/O Error: " + e);
		}
	}
}