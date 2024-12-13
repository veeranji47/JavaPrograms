package interview.javaprograms;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Welcome";
		
		isReverse(str);
	}
	public static void isReverse(String s) {
		if(s.length()-1 >= 0) {
			System.out.print(s.charAt(s.length()-1));
			isReverse(s.substring(0, s.length()-1));
		}
	}

}
