package com.github.solairerove.leprosorium.old.file.copyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Lepro {

	public static void main(String[] args) {

		int i;
		FileInputStream fin;
		FileOutputStream fout;

		try {
			fin = new FileInputStream(".//src/com.github.solairerove.leprosorium.old.file/copyFile/input.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Input com.github.solairerove.leprosorium.old.file not found.");
			return;
		}

		try {
			fout = new FileOutputStream(".//src/com.github.solairerove.leprosorium.old.file/copyFile/output.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Error opening output com.github.solairerove.leprosorium.old.file.");

			try {
				fin.close();
			} catch (IOException e2) {
				System.out.println("Error closing input com.github.solairerove.leprosorium.old.file.");
			}
			return;
		}

		try {
			do {
				i = fin.read();
				if (i != -1)
					fout.write(i);
			} while (i != -1);
		} catch (IOException e) {
			System.out.println("File Error.");
		}

		try {
			fin.close();
		} catch (IOException e) {
			System.out.println("Error closing input com.github.solairerove.leprosorium.old.file.");
		}

		try {
			fout.close();
		} catch (IOException e) {
			System.out.println("Error closing output com.github.solairerove.leprosorium.old.file.");
		}
	}
}