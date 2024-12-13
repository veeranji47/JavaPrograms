package interview.javaprograms;

public class FindSumOfAllOddIndexes {

	public static void main(String[] args) {
		int a[] = {4,6,7,3,9,3,8,2};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==1) {
				sum+=a[i];
			}
		}
		System.out.println("sum of Odd Indexes is : "+sum);

	}

}
