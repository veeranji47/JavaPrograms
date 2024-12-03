package pratice.stringprograms;

public class CountUniqueCharInString {

	public static void main(String[] args) {
		String str = "I am a good boy";
		String s = "";
		for(int i = 0; i < str.length(); i++) {
			int count = 0;
			for(int j = 0; j < s.length(); j++) {
				if(str.charAt(i) == s.charAt(j))
					count++;
			}
			if(count == 0)
				s = s + str.charAt(i);
		}
		System.out.println(s.length());

	}

}
