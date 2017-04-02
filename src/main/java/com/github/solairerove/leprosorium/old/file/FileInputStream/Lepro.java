package com.github.solairerove.leprosorium.old.file.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Lepro {

	public static void main(String[] args) {

		int i;
		FileInputStream fin;

		try {
			fin = new FileInputStream(".//src/com.github.solairerove.leprosorium.old.file/showFile/input.txt");
		} catch (FileNotFoundException exc) {
			System.out.println("File not found");
			return;
		}

		try {
			do {
				i = fin.read();
				if (i != -1) {
					System.out.print((char) i);
				}
			} while (i != -1);
		} catch (IOException exc) {
			System.out.println("Error reading com.github.solairerove.leprosorium.old.file.");
		}

		try {
			fin.close();
		} catch (IOException exc) {
			System.out.println("Error closing com.github.solairerove.leprosorium.old.file.");
		}
	}
}