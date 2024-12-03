package pratice.stringprograms;

public class ReverseSentence {
	public static void main(String[] args) {
		String str = "Hello veera";
		String rev = "";
		for(int i = str.length()-1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}

}
