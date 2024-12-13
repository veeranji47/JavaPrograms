package interview.javaprograms;

import java.util.Arrays;

public class SmallestNumbersInArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,5,6,7,0,2,7};
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int min=Integer.MAX_VALUE;
		int smin=Integer.MAX_VALUE;
		int tmin=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				tmin=smin;
				smin=min;
				min=a[i];
			}
			else if (smin>a[i]&&a[i]!=min) {
				smin=a[i];
			}
			else if(tmin>a[i]&&a[i]!=min) {
				tmin=a[i];
			}
		}
		System.out.println("first smallest number "+min);
		System.out.println("second smallest number "+smin);
		System.out.println("Third smallest number "+tmin);


	}

}
