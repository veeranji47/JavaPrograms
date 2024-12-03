package pratice.stringprograms;

public class SwapTwoStringWithoutThirdVariable {

	public static void main(String[] args) {
		String str = "Hello";
		String str2 = "Welcome";
		
		int size = str.length();
		
		str = str + str2;
		
		str2 = str.substring(0, str.length() - str2.length());
		str = str.substring(size);
		
		System.out.println(str2);
		System.out.println(str);
	}

}
