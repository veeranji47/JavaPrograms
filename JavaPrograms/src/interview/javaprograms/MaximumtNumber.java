package interview.javaprograms;

import java.util.Arrays;

public class MaximumtNumber {
	public static void main(String[] args) {
		int a[] = {2,6,4,4,6,1,9,9};
		int l = a[0];
		
		for(int i = 0; i<a.length; i++) {
			if(a[i] > l) {	
				l = a[i];	
			}	
		}
		System.out.println("Maximum number is : " + l);
	}

}
