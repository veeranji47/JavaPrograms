package interview.javaprograms;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HighestWordBetweenWords {

	public static void main(String[] args) {
		String s1 = "Helloooo";
		String s2 = "wwwwelcomeeee";
		LinkedHashMap<Character, Integer> map1 = new LinkedHashMap<Character, Integer>();
		LinkedHashMap<Character, Integer> result = new LinkedHashMap();
		for(int i=0;i<s1.length();i++) {
			char ch = s1.charAt(i);
			if(map1.containsKey(ch)) {
				map1.put(ch, map1.get(ch)+1);
			}else {
				map1.put(ch, 1);
			}
		}
		
		LinkedHashMap<Character, Integer> map2 = new LinkedHashMap<Character, Integer>();
		for(int i=0;i<s2.length();i++) {
			char ch = s2.charAt(i);
			if(map2.containsKey(ch)) {
				map2.put(ch, map2.get(ch)+1);
			}else {
				map2.put(ch, 1);
			}
		}
		
		
		for(char list : map1.keySet()) {
			int value1 = map1.get(list);
			int value2 = map2.getOrDefault(list,0);
			result.put(list, Math.max(value1, value2));
			
		}
		for(char list:map2.keySet()) {
			if(!result.containsKey(list)) {
				result.put(list, map2.get(list));
			}
		}
		System.out.println("map1 : "+map1);
		System.out.println("map2 : "+map2);
		System.out.println(result);
		
		List list = new ArrayList(result.entrySet()) ;
		list.sort(Entry.comparingByValue(Comparator.reverseOrder()));
		System.out.println(list.get(0));
			
		
		

	}

}
