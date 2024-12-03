package pratice.stringprograms;

public class CountLowercaseAndUppercase {

	public static void main(String[] args) {
		String str = "I am A TraVeLler";
		int lcount = 0, ucount = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				ucount++;
			else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				lcount++;
		}
		System.out.println("Uppercase count is : " + ucount + "\n" + "Lowercase count is : " + lcount );

		
	}

}
