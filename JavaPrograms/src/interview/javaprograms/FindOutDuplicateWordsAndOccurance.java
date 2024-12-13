package interview.javaprograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindOutDuplicateWordsAndOccurance {

	public static void main(String[] args) {
		String str = "Hello Welcome to hyderabad Hello Welcome";
		
		String[] words = str.split(" ");
		LinkedHashMap<String, Integer> map = new LinkedHashMap();
		for(int i=0;i<words.length;i++) {
			if(map.containsKey(words[i])) {
				map.put(words[i], map.get(words[i])+1);
			}else {
				map.put(words[i], 1);
			}
			
		}
		for(Map.Entry<String, Integer> hash : map.entrySet()) {
			if(hash.getValue() > 1) {
			System.out.println("duplicate words : "+hash.getKey() + "-->"+ hash.getValue());
			}
		}

	}

}
