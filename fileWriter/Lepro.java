package fileWriter;

import java.io.*;

// /home/abigor/workspace/leprosorium/src/fileWriter/test

class Lepro {

	public static void main(String[] args) {
		
		String str;
		BufferedReader br = new BufferedReader(new
				InputStreamReader(System.in));
		System.out.println("Enter text('stop' to quit).");
		
		try(FileWriter fw = new FileWriter("/home/abigor/workspace/leprosorium/src/fileWriter/test")) {
			do {
				System.out.print(": ");
				str = br.readLine();
				if(str.compareTo("stop") == 0) break;
				str = str + "\r\n";
				fw.write(str);
			} while(str.compareTo("stop") != 0);
		} catch(IOException e) {
			System.out.println("Mothertrucker: " + e);
		}
	}
}