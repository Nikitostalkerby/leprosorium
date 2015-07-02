package copyFile;

import java.io.*;

// /home/abigor/workspace/leprosorium/src/copyFile/input
// /home/abigor/workspace/leprosorium/src/copyFile/output

class Lepro {

	public static void main(String[] args) {
		
		int i;
		FileInputStream fin;
		FileOutputStream fout;
		
		try {
			fin = new FileInputStream("/home/abigor/workspace/leprosorium/src/copyFile/input");
		} catch(FileNotFoundException e) {
			System.out.println("Input file not found.");
			return;
		}
		
		try {
			fout = new FileOutputStream("/home/abigor/workspace/leprosorium/src/copyFile/output");
		} catch(FileNotFoundException e) {
			System.out.println("Error opening output file.");
			
			try {
				fin.close();
			} catch(IOException e2) {
				System.out.println("Error closing input file.");
			}
			return;
		}
		
		try {
			do {
				i = fin.read();
				if(i != -1) fout.write(i);
			} while(i != -1);
		} catch(IOException e) {
			System.out.println("File Error.");
		}
		
		try {
			fin.close();
		} catch(IOException e) {
			System.out.println("Error closing input file.");
		}
		
		try {
			fout.close();
		} catch(IOException e) {
			System.out.println("Error closing output file.");
		}
	}
}