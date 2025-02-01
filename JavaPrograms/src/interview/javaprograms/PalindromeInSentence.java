package interview.javaprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PalindromeInSentence {

	public static void main(String[] args) {
		String str = "mom dad children mom mom dad";
		String[] s = str.split(" ");

		HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();

		for (String name : s) {
			if (map.containsKey(name)) {
				map.put(name, map.get(name) + 1);
			} else {
				map.put(name, 1);
			}
		}
		// System.out.println(map);
		for (Entry<String, Integer> hash : map.entrySet()) {

			String temp = hash.getKey();
			char[] ch = temp.toCharArray();
			String rev = "";

			for (int i = ch.length - 1; i >= 0; i--) {
				rev = rev + ch[i];
			}
			if (temp.equals(rev) && hash.getValue() > 2) {
				System.out.println("Repeted palindrome is " + rev);

			}

		}
	}

}
