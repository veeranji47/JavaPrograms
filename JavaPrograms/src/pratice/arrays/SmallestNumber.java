package pratice.arrays;

public class SmallestNumber {

	public static void main(String[] args) {
		int a[] = {10,5,10,5,45};
		int least = a[0];
		for(int i = 1; i < a.length; i++) {
			if(least > a[i])//10 > 5
				least = a[i];
		}
		System.out.println(least);
	}

}
