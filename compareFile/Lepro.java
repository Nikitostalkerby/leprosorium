package compareFile;

import java.io.*;

// /home/abigor/workspace/leprosorium/src/compareFile/first
// /home/abigor/workspace/leprosorium/src/compareFile/second

class Lepro {

	public static void main(String[] args) {
		
		int i = 0, j = 0;
		
		try (FileInputStream f1 = new FileInputStream("/home/abigor/workspace/leprosorium/src/compareFile/first");
			FileInputStream f2 = new FileInputStream("/home/abigor/workspace/leprosorium/src/compareFile/second")) {
			
			do {
				i = f1.read();
				j = f2.read();
				if(i != j) break;
			} while(i != -1 && j != -1);
			
			if(i != j)
				System.out.println("Files differ.");
			else
				System.out.println("Files are the same.");
		} catch(IOException e) {
			System.out.println("I/O Error: " + e);
		}
	}
}