package pratice.stringprograms;

public class PresentVowelsInMyName {

	public static void main(String[] args) {
		String nm = "veeranjineyulu";
		String vowels = "";
		int count  = 0;
		for(int i = 0; i < nm.length(); i++) {
			if(nm.charAt(i) == 'a' || nm.charAt(i) == 'e' || nm.charAt(i) == 'i' || nm.charAt(i) == 'o' || 
					nm.charAt(i) == 'u' || nm.charAt(i) == 'A' || nm.charAt(i) == 'E' || nm.charAt(i) == 'I' || 
					nm.charAt(i) == 'U' || nm.charAt(i) == 'O' ) {
				vowels = vowels + nm.charAt(i);
			}
			
			if(nm.charAt(i) == 'a' || nm.charAt(i) == 'e' || nm.charAt(i) == 'i' || nm.charAt(i) == 'o' || 
					nm.charAt(i) == 'u' || nm.charAt(i) == 'A' || nm.charAt(i) == 'E' || nm.charAt(i) == 'I' || 
					nm.charAt(i) == 'U' || nm.charAt(i) == 'O' ) {
				count++;
			}
			
		}
		System.out.println("Vowels are : " + vowels);
		System.out.println("VOwels counts is : " + count);
	}

}
