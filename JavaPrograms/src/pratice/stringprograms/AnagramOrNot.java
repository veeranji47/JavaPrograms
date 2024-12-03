package pratice.stringprograms;

import java.util.Arrays;

public class AnagramOrNot {

	public static void main(String[] args) {
		String str1 = "spar";
		String str2 = "rasp";
		
		if(str1.length() == str2.length()) {
			char ch1[] = str1.toLowerCase().toCharArray();
			char ch2[] = str2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean flag = true;
			for(int i = 0; i < ch2.length; i++) {
				if(ch1[i] != ch2[i]) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(str1 + " is a anagram string");
			}else {
				System.out.println(str1+ " is not a anagram ");
			}
			
		}else {
			System.out.println(str1 + " is not a anagram string");
		}
	}

}
