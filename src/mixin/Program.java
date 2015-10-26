package mixin;

public class Program {

	public static void main(String args[]) {
		
		DeviceA a = new DeviceA();
		DeviceB b = new DeviceB();
		 
		a.setActive(true);
		
		System.out.println(a.isActive());
		System.out.println(b.isActive());
	}
}