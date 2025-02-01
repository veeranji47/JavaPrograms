package interview.javaprograms;

public class RemoveSpacesReplaceOfSymbols {

	public static void main(String[] args) {
		char[] ch = {'$','@','%'};
		String str = "My name is veera";
		String[] s = str.split(" ");
		String op=""; 
		int count=0;
		for(int i=0;i<s.length;i++) {
			
			if(i < ch.length)
				op+=s[i]+ch[count++];
			else
				op+=s[i];
			
		}
		System.out.println(op);

	}

}
