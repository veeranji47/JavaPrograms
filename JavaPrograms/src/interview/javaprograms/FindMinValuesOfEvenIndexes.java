package interview.javaprograms;

public class FindMinValuesOfEvenIndexes {

	public static void main(String[] args) {
		int a[] = {4,6,7,3,9,3,8,2};
		int min = a[0];
		
		for(int i=0;i<a.length;i++) {
			 
			if(i%2==0) {
				if(a[i]<min) {
					min = a[i];
				}
			}
		}
		System.out.println("Minimum value of even indexes is : "+min);

	}

}
