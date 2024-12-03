package interview.javaprograms;

public class GenerateAillSubString {
	public static void main(String[] args) {
		String s = "aabbaa";
		String str = "";
		for(int i=0; i<s.length(); i++) {
			for(int j=i+1; j<=s.length();j++) {
				str = s.substring(i, j);
				int size = str.length();
				if(str.length() >= 2 && isPalindrome(str)) {
					System.out.println(str + " is a palindrome");
				}
			}
		}
		
	}
	public static boolean isPalindrome(String palindrome) {
		
		boolean flag = false;
		String rev = "";
		
		for(int i=palindrome.length()-1; i>=0;i--) {
			rev = rev+palindrome.charAt(i);
		}
		if(rev.equals(palindrome)) {
			flag = true;
			return flag;
		}else {
			
			return flag;
		
		}
		
	}

}
