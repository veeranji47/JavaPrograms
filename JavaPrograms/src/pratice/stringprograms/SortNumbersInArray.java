package pratice.stringprograms;

public class SortNumbersInArray {

	public static void main(String[] args) {
		int a[] = {10,5,20,45,2};
		
		for(int i = 0; i < a.length; i++) {
			int temp = 0;
			for(int j = 0; j < a.length; j++)
			if(a[i] < a[j]) {//10 > 5
				temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}
		for(int i = 0; i < a.length; i++ ){
			System.out.println(a[i]);
		}
	}

}
