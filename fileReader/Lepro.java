package fileReader;

import java.io.*;

// /home/abigor/workspace/leprosorium/src/fileReader/test

class Lepro {

	public static void main(String[] args) {
	
		String str;
		
		try(BufferedReader br = new BufferedReader(
				new FileReader("/home/abigor/workspace/leprosorium/src/fileReader/test"))) {
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch(IOException e) {
			System.out.println("Mothertrucker: " + e);
		}
	}
}