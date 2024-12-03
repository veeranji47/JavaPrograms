package interview.javaprograms;

import java.util.LinkedHashMap;

public class Occurance {

	public static void main(String[] args) {
		String s="dataaaa 1111 dd l5";
		LinkedHashMap<Character,Integer>map=new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(map.containsKey(ch) && ch!=' ') {
				map.put(ch,map.get(ch)+1);
			}
			else {
				if(ch!=' ') {
					
					map.put(ch, 1);
				}
			}
		}
		System.out.println(map);

	}

}
