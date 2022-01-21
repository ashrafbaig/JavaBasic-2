package JavaTutor;

public class ReverseString {

	public static void main(String[] args) {
		String Name = "Tata Motors";

		int str_lenght = Name.length() - 1;

		String temp = "", reverse = "";

		for (int i = 0; i <= str_lenght; i++) {

			temp = temp + Name.charAt(i);

			if (i == str_lenght || Name.charAt(i) == ' ') {
				
				for(int j= temp.length()-1; j>=0;j--) {
					
					reverse = reverse + temp.charAt(j);
					if(j == 0 && (i != str_lenght)) {
						
						reverse = reverse + " ";
					}
					
					
				}
				
				temp= "";

			}

		}
		
		System.out.println(reverse);

	}

}
