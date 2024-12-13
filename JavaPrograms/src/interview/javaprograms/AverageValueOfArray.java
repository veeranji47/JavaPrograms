package interview.javaprograms;

public class AverageValueOfArray {

	public static void main(String[] args) {
		int[] a = {4,6,7,3,9};
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println("Sum of elements is : "+sum);
		double avg = sum / a.length ;
		System.out.println("average value of array : "+avg);

	}

}
