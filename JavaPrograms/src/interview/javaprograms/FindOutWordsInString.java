package interview.javaprograms;

public class FindOutWordsInString {

	public static void main(String[] args) {
		String str = "Welcome to the tek pyramid";
		String[] s = str.split(" ");
		int count=0;
		for(int i=0; i<s.length;i++) {
			count++;
		}
		System.out.println("Number of words in a string is : "+count);

	}

}
