package interview.javaprograms;

public class ConsecutiveCharacters {
	public static void main(String[] args) {
		String str = "a3b2c1";
		String op = "";
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i+1)>='1' && str.charAt(i+1)<='9') {
				
				char ch = str.charAt(i+1);
				//System.out.println((int)ch);
				for(int j = 0;j<ch-48;j++) {
					op+=str.charAt(i);
				}
				
			}
		}
		System.out.println(op);
	}

}
