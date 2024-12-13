package interview.javaprograms;

import java.util.*;


public class PrintPositionAllDuplicateElements {
	public static void main(String[] args) {
		int[] a= {1,2,2,1,1};
		LinkedHashMap<Integer, ArrayList<Integer>> map = new LinkedHashMap();
		for(int i = 0;i<a.length;i++) {
			if(map.containsKey(a[i])) {
				map.get(a[i]).add(i);
			}else {
				map.put(a[i], new ArrayList<Integer>());
			}
		}
		for(Map.Entry<Integer, ArrayList<Integer>> hash: map.entrySet()) {
			if(!hash.getValue().isEmpty()) {
				System.out.println(hash.getKey()+"---"+hash.getValue());
			}
		}
		
		
		
	}

}
