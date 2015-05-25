import java.io.*;

// /home/vaas/Документы/leprosorium/CopyFile/src/input
// /home/vaas/Документы/leprosorium/CopyFile/src/output

class Lepro {

	public static void main(String[] args) {
		
		int i;
		FileInputStream fin;
		FileOutputStream fout;
		
		if(args.length != 2) {
			System.out.println("What the duck is this sheet?!");
			return;
		}
		
		try {
			fin = new FileInputStream(args[0]);
		} catch(FileNotFoundException e) {
			System.out.println("Input file not found.");
			return;
		}
		
		try {
			fout = new FileOutputStream(args[1]);
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
