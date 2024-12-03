package interview.javaprograms;

import java.util.Arrays;

public class ThirdHighestNumber {
	public static void main(String[] args) {
		int a[] = {2,6,4,6,1,9,9};
		int l = a[0], secl = a[0], thirdl = a[0];
		Arrays.sort(a);
		for(int i = 0; i<a.length; i++) {
			//using the sort order
//			int temp = 0;
//			for(int j = i+1; j<a.length;j++) {
//				if(a[i] > a[j]) {
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
			if(a[i] > l) {
				thirdl = secl;
				secl = l;
				l = a[i];	
			}else if(a[i] > secl && l!=a[i]) {
				thirdl = secl;
				secl = a[i];
			}
			else if(a[i] > thirdl && l!=a[i] && secl!=a[i])
				thirdl = a[i];
			
			
		}
		System.out.println("first higest number" + l);
		System.out.println("second higest number " + secl);
		System.out.println("third highest number" + thirdl);
		//System.out.println(Arrays.toString(a));
	}

}
