import java.io.*;

class Lepro {

	public static void main(String[] args) {
		
		int i = 0, j = 0;
		
		try (FileInputStream f1 = new FileInputStream("first");
			FileInputStream f2 = new FileInputStream("second")) {
			
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