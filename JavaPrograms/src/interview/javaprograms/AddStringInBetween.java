package interview.javaprograms;

import java.util.Arrays;

public class AddStringInBetween {
	public static void main(String[] args) {
		
	
	
//	int[] a = {1,2,3,4};
//	int[] b = {5,6,7,8};
//	int c[] = new int[a.length+b.length];
//	for(int i=0;i<c.length;i++) {
//		if(i<a.length) {
//			c[i] = a[i];
//		}else
//			c[i] = b[i-a.length]; 
//	}System.out.println(Arrays.toString(c));
//	
		
		String nm = "My name veera";
		String str[] = nm.split(" ");
		StringBuilder sb = new StringBuilder();
		int position = 2;
		for(int i=0;i<str.length;i++) {
			
			sb.append(str[i]).append(" ");
			if(i+1 == position) {
				sb.append("is").append(" ");
			}
			
		}
		System.out.println(sb);
	}

}
