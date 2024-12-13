 package interview.javaprograms;

import java.util.Arrays;

public class SumOfArrays {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {4,5,6,7,8,9};
		int[] sum = new int[b.length];
		for(int i= 0;i<b.length;i++) {
			if(i<a.length)
				sum[i] = sum[i]+a[i];
			if(i<b.length)
				sum[i] = sum[i]+b[i];
		}
		System.out.println(Arrays.toString(sum));
	}

}
