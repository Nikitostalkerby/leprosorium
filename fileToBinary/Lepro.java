package fileToBinary;

import java.io.*;

// /home/abigor/workspace/leprosorium/src/fileToBinary/log

class Lepro {

	public static void main(String[] args) {
		
		try(BufferedReader reader = new BufferedReader(
				new FileReader("/home/abigor/workspace/leprosorium/src/fileToBinary/log"));
				DataOutputStream out = new DataOutputStream(
						new FileOutputStream("/home/abigor/workspace/leprosorium/src/fileToBinary/output"))) {
			String str;
			while((str = reader.readLine()) != null) {
				out.writeUTF(str);
			}
		} catch(IOException e) {
			System.out.println("Mothertrucker: " + e);
		}
	}
}