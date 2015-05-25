import java.io.*;

class RandomAccessDemo {

	public static void main(String[] args) {
		
		double data[] = { 19.4, 10.1, 123.54, 33.0,
				87.9, 74.25 };
		double d;
		
		// открыть и использовать файл с произвольным доступом 
		// Файл с произвольным доступом открывается для записи/чтения.
		try(RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
			for(int i = 0; i < data.length; i++) {
				raf.writeDouble(data[i]);
			}
			// прочитать отдельные значение из файла
			// для установки указателя файла служит метод seek()
			raf.seek(0); // найти первое значение
			d = raf.readDouble();
			System.out.println("First value is " + d);
			
			raf.seek(8); // найти второе значение
			d = raf.readDouble();
			System.out.println("Second value is " + d);
			
			raf.seek(8 * 3); // найти четвертое значение
			d = raf.readDouble();
			System.out.println("Fourth value is " + d);
			
			System.out.println();
			
			// значения через одно
			System.out.println("Here is every other value: ");
			for(int i = 0; i < data.length; i+=2) {
				raf.seek(8 * i); // i-е значение
				d = raf.readDouble();
				System.out.print(d + " ");
			}
		} catch(IOException e) {
			System.out.println("I/O Error: " + e);
		}
	}
}