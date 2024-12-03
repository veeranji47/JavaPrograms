package patterns.alphabets;

public class OddRowsFirstPlaceUppercase {

	public static void main(String[] args) {
		char ch = 'A';
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
