package interview.javaprograms;

public class ReverseEachWordCharacters {
	//String projectName, createdBy;
	public static void main(String[] args) {
		String s = "Welcome to the Tk", rev = "";
		String[] s1 = s.split(" ");
		for(int i=0; i<s1.length;i++) {
			String str = s1[i];
			for(int j=str.length()-1; j>=0;j--) {
				rev = rev+str.charAt(j);
			}
			rev+=" ";
		}
		
		System.out.println(rev);
	}

}
