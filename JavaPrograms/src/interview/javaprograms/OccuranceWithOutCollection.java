package interview.javaprograms;

import java.util.LinkedHashMap;

public class OccuranceWithOutCollection {

	public static void main(String[] args) {
		String s="dataaaa 1111 dd l5";
		for (int i = 0; i < s.length(); i++) {
			
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j) && s.charAt(i)!=' ') {
					count++;
					
					
					
				}
				
			}	
			if(count > 1)
				System.out.println(s.charAt(i) + "---" + count);
			
		}
		

	}

}
