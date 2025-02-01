package pratice.arrays;

import java.util.LinkedHashMap;

public class Sample {
	public static void main(String [] args) {
		String s="This is a test This test is simple";
		String [] arr=s.split(" ");
		LinkedHashMap<String,Integer> map= new LinkedHashMap();
	
		for(String word:arr) {
			word=word.toLowerCase();
			map.put(word,map.getOrDefault(word, 0)+1);
		}
			for(String key: map.keySet()) {
				if(map.get(key)>1) {
					System.out.println(key);
				}
			}
			System.out.println(map);
		}
	}

