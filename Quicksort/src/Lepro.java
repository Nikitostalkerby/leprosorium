public class Lepro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[] = { 'd', 'x', 'a', 'r', 'p',
				'j', 'i' };
		int i;
		
		System.out.print("Original array: ");
		for(i=0; i < a.length; i++)
			System.out.print(a[i]);
		
		System.out.println();
		
		Quicksort.qsort(a);
		
		System.out.print("Sosrted array: ");
		for(i=0; i < a.length; i++)
			System.out.print(a[i]);
	}

}
