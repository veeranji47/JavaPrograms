package pratice.stringprograms;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String str = "abcabcbb";
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			for(int j = 1; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if(count >= 1) {
				System.out.println(str.charAt(i));
			}
			
		}
	}

}
