package pratice.numberprograms;

public class FibonaciSeries {

	public static void main(String[] args) {
		int a = 0, b = 1, sum = 0;
		int n = 5;
		for(int i = 1; i <= n; i++) {
			System.out.println(a);
			sum = a + b;
			a = b;
			b = sum; 
		}
	}

}
