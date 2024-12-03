package interview.javaprograms;

import java.util.Arrays;

public class LeftRotation {
	public static void main(String[] args) {
		int[] a = {2,4,5,1,7,9};
		int rotation = 3;
	
		for(int i=0; i<rotation;i++) {
			
			int swap = a[0];
			//swap the second place element to first place
			for(int j=0; j<a.length-1;j++) {
				a[j] = a[j+1];
			}
			//swap the first element to last
			a[a.length-1] = swap;
		}
		System.out.println(Arrays.toString(a));
	}

}
