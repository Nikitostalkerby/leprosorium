package modifiedCopyFile;

import java.io.*;

// /home/abigor/workspace/leprosorium/src/modifiedCopyFile/input
// /home/abigor/workspace/leprosorium/src/modifiedCopyFile/output

class Lepro {

	public static void main(String[] args) {
		
		int i;
		
		try (FileInputStream fin = new 
				FileInputStream("/home/abigor/workspace/leprosorium/src/modifiedCopyFile/input");
				
				FileOutputStream fout = new 
						FileOutputStream("/home/abigor/workspace/leprosorium/src/modifiedCopyFile/output")) {
			
			do {
				i = fin.read();
				if(i != -1) fout.write(i);
			} while(i != -1);
		} catch(IOException e) {
			System.out.println("I/O error: " + e);
		}
	}
}