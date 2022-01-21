package JavaTutor;

import java.util.Arrays;

public class RemoveDuplicatesFromAnArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 3, 2, 3, 5 };
		/// Without Sorting

		System.out.println("Array Without Sorting");

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");

		}

		System.out.println();
		Arrays.sort(a);

		// With Sorting

		System.out.println("Array After Sorting");

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");

		}
		
		System.out.println();
		
		// Array without duplication
		
		System.out.println("Array without duplication");
		int b=0;
		a[b]= a[0];
		for (int i = 0; i < a.length; i++) {
			
			if(a[b]!=a[i]) {
				
				b++;
				a[b]=a[i];
				
			}

		}
		
		for (int i = 0; i <= b; i++) {
			System.out.print(a[i] + " ");
			
		}

	}

}
