package JavaTutor;

import java.util.Arrays;

public class StoreTheDuplicateInArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 3, 4, 7, 5, 5, 6, 7 };
		int c[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");

		}
		System.out.println();

		Arrays.sort(a);

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");

		}
		System.out.println();
		
		////////// Duplicate Number in the Array

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {

					c[j]=a[j];
					System.out.print(c[j] + " ");
				}
			}

		}
		System.out.println();
		 int count;
		
		for(int i=0;i< a.length;i++)
        {
            count=0;
            //Initialize the for loop for checking the element which are not repeated)
            for (int j = 0; j <  a.length; j++)
            {
                 //check the condition if any number is same so
               //increase
               if(a[i]==a[j] && i!=j)
                      count++;
            }
           //if count became zero so print the current element
         if(count==0)
             System.out.print(a[i]+" ");
        }
		
	}
		
		

	}


