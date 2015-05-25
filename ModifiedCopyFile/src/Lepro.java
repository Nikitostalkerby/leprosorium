import java.io.*;

// /home/vaas/Документы/leprosorium/ModifiedCopyFile/src/input
// /home/vaas/Документы/leprosorium/ModifiedCopyFile/src/output

class Lepro {

	public static void main(String[] args) {
		
		int i;
		
		if(args.length != 2) {
			System.out.println("English mothertrucker, do you speak it?");
			return;
		}
		
		try (FileInputStream fin = new FileInputStream(args[0]);
				FileOutputStream fout = new FileOutputStream(args[1])) {
			
			do {
				i = fin.read();
				if(i != -1) fout.write(i);
			} while(i != -1);
		} catch(IOException e) {
			System.out.println("I/O error: " + e);
		}
	}
}
