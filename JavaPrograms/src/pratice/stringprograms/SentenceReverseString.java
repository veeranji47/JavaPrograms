package pratice.stringprograms;

public class SentenceReverseString {

	public static void main(String[] args) {
		
		String str = "Hello this program is a reverse sentence string";
		String[] s = str.split(" ");
		String rev = "";
		for(int i = s.length-1; i >= 0; i--) {
			rev = rev + s[i] + " ";
		}
		System.out.println(rev);
	}

}
