package quicksort;

public class Lepro {

	public static void main(String[] args) {
		
		char a[] = { 'd', 'x', 'a', 'r', 'p',
				'j', 'i' };
		int i;
		
		System.out.print("Original array: ");
		for(i=0; i < a.length; i++)
			System.out.print(a[i]);
		
		System.out.println();
		
		Quicksort.qsort(a);
		
		System.out.print("Sorted array: ");
		for(i=0; i < a.length; i++)
			System.out.print(a[i]);
	}

}