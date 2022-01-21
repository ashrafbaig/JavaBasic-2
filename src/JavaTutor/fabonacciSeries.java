package JavaTutor;

public class fabonacciSeries {

	public static void main(String[] args) {

		int number =10, temp1=0,temp2=1,sum;
		
		for(int i =0; i<=number;i++){
			
			System.out.println(temp1);
			
			sum= temp1+temp2;
			temp1=temp2;
			temp2=sum;
			
			
		}
	}

}
