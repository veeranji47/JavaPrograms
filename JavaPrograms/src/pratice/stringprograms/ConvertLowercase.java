package pratice.stringprograms;

public class ConvertLowercase {

	public static void main(String[] args) {
		String str = "Hello Java Kadhu ra MAWA";
		String str2 = "";
		char ch[] = str.toCharArray();
		
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] =(char) ((char) str.charAt(i) + 32);
			}
		}
		for(int i = 0; i < ch.length; i++)
			System.out.print(ch[i]);
	}

}
