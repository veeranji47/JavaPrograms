package interview.javaprograms;

public class AlternativeWordsReverse {
	public static void main(String[] args) {
		String s = "Welcome to tp office";
		String op = "";
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++) {
			if(i%2==1) {
				String temp = str[i], rev ="";
				for(int j=temp.length()-1;j>=0;j--) {
					rev+=temp.charAt(j);
				}
				op+=rev+" ";
			}else {
				op+=str[i]+" ";
			}	
		}
		System.out.println(op);
		
		
	}

}
;