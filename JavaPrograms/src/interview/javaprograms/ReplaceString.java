package interview.javaprograms;

public class ReplaceString {
	public static void main(String[] args) {
		String str = "this is the school";
		
		String[] s = str.split(" ");
		String org = "";
		
		for(int i=0; i<s.length;i++) {
			String temp = s[i];
			if(temp.equals("the")) {
				temp = 'a'+"";
			}	
		}
		for(int i=0;i<s.length;i++) {
			org += s[i];
            if (i < s.length - 1) {
                org += " "; 
            }
		}
		System.out.println(org);
	}

}
