package interview.javaprograms;

import java.util.Arrays;
import java.util.HashMap;

public class OccuranceUsingArrays {
	public static void main(String[] args) {
		String str="aabbcccddf";
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i<ch.length;i++) {
			if(map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i])+1);
			}else {
				map.put(ch[i],1);
			}
			
		}
		
		System.out.println(map);
	}

}
