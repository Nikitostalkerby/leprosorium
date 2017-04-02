package com.github.solairerove.leprosorium.old.file.showFileWithFinally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Lepro {

	public static void main(String[] args) {

		int i;
		FileInputStream fin;

		try {
			// open the com.github.solairerove.leprosorium.old.file
			fin = new FileInputStream(".//src/com.github.solairerove.leprosorium.old.file/showFileWithFinally/input.txt");
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
			System.out.println("Error reading com.github.solairerove.leprosorium.old.file.");
		} finally {
			try {
				fin.close();
			} catch (IOException exc) {
				System.out.println("Error closing com.github.solairerove.leprosorium.old.file.");
			}
		}
	}
}