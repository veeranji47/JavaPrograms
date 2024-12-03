package interview.javaprograms;

public class CountDigitsInString {
	public static void main(String[] args) {
		String str = "Ab23@bg57&b8";
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				count = (int) (ch) - 48;
			}
		}
		System.out.println(count);
	}

}
