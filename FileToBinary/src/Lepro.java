import java.io.*;

class Lepro {

	public static void main(String[] args) {
		
		try(BufferedReader reader = new BufferedReader(new FileReader("log"));
				DataOutputStream out = new DataOutputStream(new FileOutputStream("binLog"))) {
			String str;
			while((str = reader.readLine()) != null) {
				out.writeUTF(str);
			}
		} catch(IOException e) {
			System.out.println("Mothertrucker: " + e);
		}
	}
}