package interview.javaprograms;

import java.util.Arrays;

public class MergeArrays {
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int b[] = {5,6,7,8};
		int size = a.length + b.length;
		int c[] = new int[size];
		int index = 0;
		
		for(int i = 0; i < a.length; i++) {
			c[index++] = a[i];
			c[index++] = b[i];
		}
		System.out.println(Arrays.toString(c));
//		for(int k = 0; k < c.length; k++)
//			System.out.println(c[k]);
	}

}
