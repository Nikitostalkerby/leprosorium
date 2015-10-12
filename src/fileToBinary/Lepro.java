package fileToBinary;

import java.io.*;

// /home/abigor/workspace/leprosorium/src/fileToBinary/log

class Lepro {

	public static void main(String[] args) {

		try (BufferedReader reader = new BufferedReader(new FileReader(".//src/fileToBinary/input.txt"));
				DataOutputStream out = new DataOutputStream(new FileOutputStream(".//src/fileToBinary/output.txt"))) {
			String str;
			while ((str = reader.readLine()) != null) {
				out.writeUTF(str);
			}
		} catch (IOException e) {
			System.out.println("Mothertrucker: " + e);
		}
	}
}