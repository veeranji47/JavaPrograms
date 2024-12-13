package interview.javaprograms;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PrintOnlyDuplicate {
	public static void main(String[] args) {
		String str = "aaabbccaadef";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i = 0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch) && ch!=' ') {
				map.put(ch, map.get(ch)+1);
			}else {
				if(ch!=' ')
					map.put(ch, 1);
			}
		}
		//System.out.println(map);
		//print only duplicate values
		for(Entry<Character, Integer> hash :map.entrySet()) {
			if(hash.getValue() > 1) {
				System.out.println(hash.getKey()+"--"+hash.getValue());
				
			}
		}
		//print only unique values
//		for(Entry<Character, Integer> hash :map.entrySet()) {
//			if(hash.getValue() == 1) {
//				System.out.println(hash.getKey());
//			}
//		}
	}

}
