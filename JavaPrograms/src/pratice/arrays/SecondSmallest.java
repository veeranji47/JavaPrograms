package pratice.arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		int a[] = {10,5,10,5,45};
		int least = a[0];
		int secSmal = a[1];
		for(int i = 0; i < a.length; i++) {
			if(least > a[i]){//10 > 5 | 5 > 5 | 5 > 10
				secSmal = least;
				least = a[i];
			}
			else if(secSmal > a[i] && least!=a[i]) {//5 > 10 | 5 > 5
				secSmal = a[i];
			}
		}
		System.out.println(secSmal);
	}

}
