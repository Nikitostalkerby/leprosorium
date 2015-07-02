package readWriteData;

import java.io.*;

// /home/abigor/workspace/leprosorium/src/readWriteData/data

class Lepro {

	public static void main(String[] args) {
		
		int i = 10;
		double d = 1023.56;
		boolean b = true;
		
		try (DataOutputStream dataOut = 
				new DataOutputStream(new 
						FileOutputStream("/home/abigor/workspace/leprosorium/src/readWriteData/data"))) {
			System.out.println("Wtiting " + i);
			dataOut.writeInt(i);
			
			System.out.println("Wtiting " + d);
			dataOut.writeDouble(d);
			
			System.out.println("Wtiting " + b);
			dataOut.writeBoolean(b);
			
			System.out.println("Wtiting " + 12.2 * 7.4);
			dataOut.writeDouble(12.2 * 7.4);
		} catch(IOException e) {
			System.out.println("Write error.");
			return;
		}
		
		System.out.println();
		
		try (DataInputStream dataIn =
				new DataInputStream(new 
						FileInputStream("/home/abigor/workspace/leprosorium/src/readWriteData/data"))) {
			i = dataIn.readInt();
			System.out.println("Reading " + i);
			
			d = dataIn.readDouble();
			System.out.println("Reading " + d);
			
			b = dataIn.readBoolean();
			System.out.println("Reading " + b);
			
			d = dataIn.readDouble();
			System.out.println("Reading " + d);
		} catch(IOException e) {
			System.out.println("Read error.");
		}
	}
}