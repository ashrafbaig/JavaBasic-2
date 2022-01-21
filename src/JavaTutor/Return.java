package JavaTutor;

public class Return {

	public static void main(String[] args) {
		//Return obj = new Return();
		int d = Return.DataReturn(); // DataReturn();
		
		System.out.println(d);

	}

	public static int DataReturn(){
		
		int a = 1;
		int b = 2;
		int c ;
		c= a+b;
		return c;
		
	}
}
