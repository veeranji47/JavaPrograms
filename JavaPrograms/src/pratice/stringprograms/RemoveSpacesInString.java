package pratice.stringprograms;

public class RemoveSpacesInString {

	public static void main(String[] args) {
		String str = "Java is     a programming      language";
		String str1 = "";	
//		str = str.strip();
//		System.out.println(str);
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				str1 = str1 + str.charAt(i);
			}
		}
		System.out.println(str1);
	}

}
