package interview.javaprograms;

import java.util.Arrays;

public class ShiftAllZerosRightSide {

	public static void main(String[] args) {
		int[] a= {2,3,4,0,8,0,6,0,0,77,05};
		int[] op = new int[a.length];
		int right = 0;
		for(int i=0; i<a.length;i++) {
			if(a[i]!=0) {
				op[right++] = a[i];
			}
		}
		System.out.println(Arrays.toString(op));

	}

}
