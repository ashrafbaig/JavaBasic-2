package JavaTutor;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharacterCount {

	public static void main(String[] args) {
		String str = "FORCA BARCA";
		CharacterCount(str.replace(" ", ""));

	}

	public static void CharacterCount(String Name) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = Name.toCharArray();
		for (char c : ch) {
				if (map.containsKey(c)) {

					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}
			
		}

		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
