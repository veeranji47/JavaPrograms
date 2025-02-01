package interview.javaprograms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) throws ArithmeticException {
		int a[] = {-1,-2,9,-1,0,15,0};
		int temp = 0;
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		
		
	}

}
