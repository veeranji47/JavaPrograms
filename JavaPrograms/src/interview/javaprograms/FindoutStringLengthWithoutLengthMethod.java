package interview.javaprograms;

public class FindoutStringLengthWithoutLengthMethod {

	public static void main(String[] args) {
		String str = "Tek pyramid";
		int count=0;
		for(int i=0; i<str.length();i++) {
			count++;
		}
		System.out.println("The string length is : "+count);

	}

}
