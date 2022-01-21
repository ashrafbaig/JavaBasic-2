package JavaTutor;

public class RemoveVowelsFromString {

	public static void main(String[] args) {
		String name = "Interview";
		String str2 = name.replaceAll("[aeiouAEIOU]", "");
		System.out.print("All Vowels Removed Successfully..!! New String is : " + str2);

	}

}
