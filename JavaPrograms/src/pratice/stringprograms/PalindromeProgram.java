package pratice.stringprograms;

public class PalindromeProgram {

	public static void main(String[] args) {
		String str = "racecar", palidrome = "";
		for(int i = 0; i < str.length(); i++) {
		palidrome = str.charAt(i) + palidrome ;	
		}
		if(str.equals(palidrome)) {
			System.out.println(str + " is a palindrome");
		}else {
			System.out.println(str + " is not a palindrome");
		}
	}

}
