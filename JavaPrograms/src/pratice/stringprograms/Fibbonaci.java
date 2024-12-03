package pratice.stringprograms;

public class Fibbonaci {

	public static void main(String[] args) {
		int a = 0, b = 1, sum = 0;
		for(int i = 1; i <= 6; i++) {
			System.out.println(a);
			sum = a + b;
			a = b;
			b = sum;
		}
	}

}
