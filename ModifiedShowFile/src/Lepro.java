import java.io.*;

// /home/vaas/Документы/leprosorium/ModifiedShowFile/src/text

class Lepro {

	public static void main(String[] args) {
		
		int i;
		
		if(args.length != 1) {
			System.out.println("What the duck is this sheet.");
			return;
		}
		
		try(FileInputStream fin = new FileInputStream(args[0])) {
			do {
				i = fin.read();
				if( i != -1) System.out.print((char) i);
			} while(i != -1);
		} catch(IOException e) {
			System.out.println("I/O error:" + e);
		}
	}
}