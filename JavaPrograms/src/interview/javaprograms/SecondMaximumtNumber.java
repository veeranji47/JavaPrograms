package interview.javaprograms;

import java.util.Arrays;

public class SecondMaximumtNumber {
	public static void main(String[] args) {
		int a[] = {2,6,4,4,6,1,9,9};
		int l = a[0], secl = a[0];
		
		for(int i = 0; i<a.length; i++) {
			if(a[i] > l) {	
				secl = l;
				l = a[i];	
			}else if(a[i] > secl && l!=a[i]) {
				
				secl = a[i];
			}	
		}
		System.out.println("second Maximum number " + secl);
	}

}
