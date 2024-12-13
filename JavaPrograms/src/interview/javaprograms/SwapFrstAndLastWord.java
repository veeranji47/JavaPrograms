package interview.javaprograms;

public class SwapFrstAndLastWord {
	public static void main(String[] args) {
//		String s = "My name is Veera";
//		String[] s1= s.split(" ");
//		String str = "";
		String s = "veera";
		char ch = s.charAt(0);
		for(int i = 0; i<s.length();i++) {
			char temp = 0;
//			if(s1[i]==s1[0]) {
//				temp = s1[0];
//				s1[0] = s1[s1.length-1];
//				s1[s1.length-1] = temp; 
//			}
//			
//			str = str + s1[i]+" ";
			if(s.charAt(i)==s.charAt(0)) {
				temp = s.charAt(0);
				ch=s.charAt(s.length()-1);
				s.charAt(s.length()-1) = temp;
			}
			
		}
		
		System.out.println(str);
	}

}
