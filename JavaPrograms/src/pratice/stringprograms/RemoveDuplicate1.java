package pratice.stringprograms;

public class RemoveDuplicate1 {

	public static void main(String[] args) {
		
		    String s = "abcabcbb";
		    String str = "";
		    for(int i = 0; i < s.length(); i++) {
		    	int count = 0;
		    	for(int j = 0; j < str.length(); j++) {
		    		if(s.charAt(i) == str.charAt(j)) {
		    			count++;
		    		}
		    	}
		    	if(count == 0)
		    		str = str + s.charAt(i);
		    }
		    System.out.println(str);
		}
	

}
