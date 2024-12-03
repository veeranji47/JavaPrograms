package interview.javaprograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class UniqueWordsInArray {
	public static void main(String[] args) {
		String s = "Bees in fish bowl same fish in bowl";
		String[] arr = s.split(" ");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for(int i=0; i<arr.length;i++) {
			
			String unique = arr[i];
			if(map.containsKey(unique)){
					map.put(unique, map.get(unique)+1);
				}else {
					map.put(unique, 1);
			}
		}
		for(Entry<String, Integer> hash :map.entrySet()) {
			if(hash.getValue()>1) {
				System.out.println(hash.getKey());
			}
		}
			
	}

}
