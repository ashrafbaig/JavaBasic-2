package JavaTutor;

public class ReverseTheSentence {

	public static void main(String[] args) {
//		String a = "I Love Java.";
//		String b = "";
//		String[] s = a.split(" ");
//
//		for (String str : s) {
//
//			b = b + str;
//		}
//
//		System.out.println(b);
		String str = "welcome to java akash";
		String words[] = str.split(" ");
		String reversedString = "";
		String reverseWord = "";

		// Reverse each word's position

		for (int i = 0; i < words.length; i++)

		{
			
			 reversedString = " " + words[i] + reversedString;
//			String word = words[i];
//			for (int j = word.length() - 1; j >= 0; j--) {
//				reverseWord = reverseWord + word.charAt(j);
//			}
//			/*reversedString = reversedString + reverseWord + " ";*/
//			reverseWord = reverseWord + " ";
		}
		

		// Displaying the string after reverse
	System.out.print("Reversed string : " + reversedString);
//		System.out.println(reverseWord);

	}
}
